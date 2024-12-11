import os
from PyPDF2 import PdfReader, PdfWriter

def decrypt_pdf(input_path, password):
    """Decrypts a single PDF file."""
    reader = PdfReader(input_path)
    writer = PdfWriter()

    # Check if the PDF is encrypted
    if reader.is_encrypted:
        reader.decrypt(password)

        # Add pages to the writer
        for page in reader.pages:
            writer.add_page(page)

        # Save the decrypted PDF
        output_path = input_path.replace(".pdf", "_decrypted.pdf")
        with open(output_path, "wb") as f:
            writer.write(f)
        print(f"Decrypted: {output_path}")
    else:
        print(f"Already decrypted or not encrypted: {input_path}")

def decrypt_pdfs_in_folder(root_folder, password):
    """Walks through folders and decrypts all PDFs."""
    for dirpath, _, filenames in os.walk(root_folder):
        for filename in filenames:
            if filename.lower().endswith(".pdf"):
                file_path = os.path.join(dirpath, filename)
                decrypt_pdf(file_path, password)

# Replace 'your-password' with the password for the encrypted PDFs
decrypt_pdfs_in_folder(root_folder=".", password="your-password")
