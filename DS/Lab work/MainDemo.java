import java.util.Scanner;

public class MainDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Choose a demo to run:");
            System.out.println("1. MathUtils");
            System.out.println("2. NumberUtils");
            System.out.println("3. FactorialRecursionUtils");
            System.out.println("4. ArrayUtils");
            System.out.println("5. StringUtils");
            System.out.println("6. MatrixUtils");
            System.out.println("7. StackUtils");
            System.out.println("8. QueueUtils");
            System.out.println("9. LinkedListUtils");
            System.out.println("10. TreeUtils");
            System.out.println("11. GraphUtils");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    runMathUtilsDemo(scanner);
                    break;
                case 2:
                    runNumberUtilsDemo(scanner);
                    break;
                case 3:
                    runFactorialRecursionUtilsDemo(scanner);
                    break;
                case 4:
                    runArrayUtilsDemo(scanner);
                    break;
                case 5:
                    runStringUtilsDemo(scanner);
                    break;
                case 6:
                    runMatrixUtilsDemo(scanner);
                    break;
                case 7:
                    runStackUtilsDemo(scanner);
                    break;
                case 8:
                    runQueueUtilsDemo(scanner);
                    break;
                case 9:
                    runLinkedListUtilsDemo(scanner);
                    break;
                case 10:
                    runTreeUtilsDemo(scanner);
                    break;
                case 11:
                    runGraphUtilsDemo(scanner);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }

    private static void runMathUtilsDemo(Scanner scanner) {
        System.out.println("Enter length and width for rectangle area calculation:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Rectangle Area: " + MathUtils.calculateArea(length, width));

        System.out.println("Enter radius for circle area calculation:");
        double radius = scanner.nextDouble();
        System.out.println("Circle Area: " + MathUtils.calculateCircleArea(radius));

        System.out.println("Enter base and exponent for power calculation:");
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();
        System.out.println((int) base + "^" + (int) exponent + ": " + MathUtils.power((int) base, (int) exponent));

        System.out.println("Enter a number for square root calculation:");
        double number = scanner.nextDouble();
        System.out.println("Square root of " + number + ": " + MathUtils.squareRoot(number));

        System.out.println("Enter numbers for sum calculation (comma separated):");
        String[] inputNumbers = scanner.next().split(",");
        double[] numbers = new double[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Double.parseDouble(inputNumbers[i]);
        }
        System.out.println("Sum of numbers: " + MathUtils.sum(numbers));
    }

    private static void runNumberUtilsDemo(Scanner scanner) {
        System.out.println("Enter a number to check if it's prime:");
        int number = scanner.nextInt();
        System.out.println("Is " + number + " prime? " + NumberUtils.isPrime(number));

        System.out.println("Enter a number to get its factors:");
        int factorNumber = scanner.nextInt();
        System.out.print("Factors of " + factorNumber + ": ");
        for (int factor : NumberUtils.getFactors(factorNumber)) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Enter a number to check if it's odd:");
        int oddNumber = scanner.nextInt();
        System.out.println("Is " + oddNumber + " odd? " + NumberUtils.isOdd(oddNumber));

        System.out.println("Enter a number to check if it's even:");
        int evenNumber = scanner.nextInt();
        System.out.println("Is " + evenNumber + " even? " + NumberUtils.isEven(evenNumber));
    }

    private static void runFactorialRecursionUtilsDemo(Scanner scanner) {
        System.out.println("Enter a number for factorial calculation:");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + ": " + FactorialRecursionUtils.factorial(number));

        System.out.println("Enter a number for Fibonacci calculation:");
        int index = scanner.nextInt();
        System.out.println(index + "th Fibonacci number: " + FactorialRecursionUtils.fibonacci(index));
    }

    private static void runArrayUtilsDemo(Scanner scanner) {
        System.out.println("Enter array elements (comma separated):");
        String[] inputArray = scanner.next().split(",");
        int[] arr = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr[i] = Integer.parseInt(inputArray[i]);
        }

        System.out.print("Original array: ");
        printArray(arr);

        ArrayUtils.sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);

        System.out.println("Enter a number to search in the array:");
        int searchNumber = scanner.nextInt();
        System.out.println("Binary search result for " + searchNumber + ": " + ArrayUtils.binarySearch(arr, searchNumber));
    }

    private static void runStringUtilsDemo(Scanner scanner) {
        System.out.println("Enter two strings to check if they are anagrams:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + StringUtils.isAnagram(str1, str2));

        System.out.println("Enter a string to convert to uppercase:");
        String upperStr = scanner.nextLine();
        System.out.println("Uppercase: " + StringUtils.toUpperCase(upperStr));

        System.out.println("Enter a string to convert to lowercase:");
        String lowerStr = scanner.nextLine();
        System.out.println("Lowercase: " + StringUtils.toLowerCase(lowerStr));
    }

    private static void runMatrixUtilsDemo(Scanner scanner) {
        System.out.println("Enter first 2x2 matrix (four elements comma separated):");
        int[][] matrix1 = readMatrix(scanner);
        System.out.println("Enter second 2x2 matrix (four elements comma separated):");
        int[][] matrix2 = readMatrix(scanner);

        System.out.println("Matrix Addition:");
        printMatrix(MatrixUtils.add(matrix1, matrix2));

        System.out.println("Matrix Multiplication:");
        printMatrix(MatrixUtils.multiply(matrix1, matrix2));
    }

    private static void runStackUtilsDemo(Scanner scanner) {
        StackUtils<Integer> stack = new StackUtils<>();
        System.out.println("Enter numbers to push to stack (comma separated):");
        String[] inputStack = scanner.nextLine().split(",");
        for (String num : inputStack) {
            stack.push(Integer.parseInt(num));
        }

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    private static void runQueueUtilsDemo(Scanner scanner) {
        QueueUtils<String> queue = new QueueUtils<>();
        System.out.println("Enter elements to enqueue (comma separated):");
        String[] inputQueue = scanner.nextLine().split(",");
        for (String element : inputQueue) {
            queue.enqueue(element);
        }

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Is queue empty? " + queue.isEmpty());
    }

    private static void runLinkedListUtilsDemo(Scanner scanner) {
        LinkedListUtils.Node head = null;
        System.out.println("Enter elements to insert into the linked list (comma separated):");
        String[] inputLinkedList = scanner.nextLine().split(",");
        for (String num : inputLinkedList) {
            head = LinkedListUtils.insertAtBeginning(head, Integer.parseInt(num));
        }

        System.out.print("Linked List: ");
        LinkedListUtils.printList(head);

        System.out.println("Enter a number to delete from the linked list:");
        int deleteValue = scanner.nextInt();
        head = LinkedListUtils.deleteNode(head, deleteValue);
        System.out.print("After deletion: ");
        LinkedListUtils.printList(head);
    }

    private static void runTreeUtilsDemo(Scanner scanner) {
        TreeUtils.Node root = null;
        System.out.println("Enter elements to insert into the tree (comma separated):");
        String[] inputTree = scanner.nextLine().split(",");
        for (String num : inputTree) {
            root = TreeUtils.insert(root, Integer.parseInt(num));
        }

        System.out.print("Inorder traversal: ");
        TreeUtils.inorderTraversal(root);

        System.out.println("\nEnter a number to search in the tree:");
        int searchValue = scanner.nextInt();
        System.out.println("Search result for " + searchValue + ": " + (TreeUtils.search(root, searchValue) != null));
    }

    private static void runGraphUtilsDemo(Scanner scanner) {
        System.out.println("Enter the number of vertices for the graph:");
        int vertices = scanner.nextInt();
        GraphUtils g = new GraphUtils(vertices);

        System.out.println("Enter edges in the format 'from to' (e.g., 0 1), type 'done' when finished:");
        while (true) {
            String edgeInput = scanner.next();
            if (edgeInput.equalsIgnoreCase("done")) break;
            int from = Integer.parseInt(edgeInput);
            int to = scanner.nextInt();
            g.addEdge(from, to);
        }

        System.out.println("Enter the starting vertex for DFS:");
        int startVertex = scanner.nextInt();
        System.out.print("DFS starting from vertex " + startVertex + ": ");
        g.DFS(startVertex);
        System.out.println();

        System.out.print("BFS starting from vertex " + startVertex + ": ");
        g.BFS(startVertex);
        System.out.println();
    }

    private static int[][] readMatrix(Scanner scanner) {
        String[] matrixElements = scanner.next().split(",");
        int[][] matrix = new int[2][2];
        matrix[0][0] = Integer.parseInt(matrixElements[0]);
        matrix[0][1] = Integer.parseInt(matrixElements[1]);
        matrix[1][0] = Integer.parseInt(matrixElements[2]);
        matrix[1][1] = Integer.parseInt(matrixElements[3]);
        return matrix;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
