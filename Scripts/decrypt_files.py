import os
import shutil
import re
from zipfile import ZipFile
from PyPDF2 import PdfReader, PdfWriter
import pathlib
import subprocess

def decrypt_pdf(file_path):
    """Decrypts a PDF file by copying its contents to a new file."""
    try:
        reader = PdfReader(file_path)
        writer = PdfWriter()

        if reader.is_encrypted:
            try:
                reader.decrypt("")  # Attempt decryption with an empty password
            except Exception as e:
                print(f"{file_path}: Failed to decrypt PDF ({e})")
                return

        for page in reader.pages:
            writer.add_page(page)

        with open(file_path, "wb") as f:
            writer.write(f)

        print(f"{file_path}: Decrypted")
    except Exception as e:
        print(f"{file_path}: Error ({e})")

def modify_presentation(file_path):
    """Removes modification password protection from a PowerPoint file."""
    try:
        temp_file = f"{file_path}.zip"
        shutil.copy(file_path, temp_file)

        with ZipFile(temp_file, 'r') as archive:
            file_to_change = "ppt/presentation.xml"
            if file_to_change in archive.namelist():
                archive.extract(file_to_change)

        with open(file_to_change, "r") as file:
            content = file.read()

        modified_content = re.sub(r"<p:modifyVerifier[^>]+>", "", content)

        with open(file_to_change, "w") as file:
            file.write(modified_content)

        subprocess.run(["zip", "-r", temp_file, file_to_change], stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        shutil.move(temp_file, file_path)
        os.remove(file_to_change)

        print(f"{file_path}: Decrypted")
    except Exception as e:
        print(f"{file_path}: Error ({e})")

def process_files_in_folder(root_folder):
    """Processes all PDF and PowerPoint files in the folder and its subdirectories."""
    for dirpath, _, filenames in os.walk(root_folder):
        for filename in filenames:
            file_path = os.path.join(dirpath, filename)

            if filename.lower().endswith(".pdf"):
                decrypt_pdf(file_path)
            elif filename.lower().endswith((".ppt", ".pptx")):
                modify_presentation(file_path)

if __name__ == "__main__":
    root_folder = os.getcwd()
    process_files_in_folder(root_folder)

