import java.util.Scanner;

public class Cricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] runs = new int[20];
        int totalRuns = 0;
        int innings = 0;
        int extraRuns = 0;
        int currentRun = 0;

        System.out.println("Enter runs for each ball. Enter -1 for out, -2 for wide, -3 for no ball.");

        for (int i = 1; i <=runs.length; i++) {
            System.out.print("Ball " +i+ ": ");
            currentRun = sc.nextInt();

            if (currentRun == -1) {
                System.out.println("Player out");
                break;
            }
            else if (currentRun == -2) {
                extraRuns++;
                i--;
                System.out.println("Wide ball");
            }
            else if (currentRun == -3) {
                extraRuns++;
                i--;
                System.out.println("No Ball");
            }
            else if (currentRun >= 0 && currentRun <= 6) {
                runs[innings] = currentRun;
                innings++;
            }
            else {
                i--;
                System.out.println("Invalid input");
            }
        }

        for (int i = 0; i < innings; i++) {
            totalRuns = totalRuns + runs[i];
        }
        totalRuns = totalRuns + extraRuns;
        if (innings > 0) {
            double average = (double) totalRuns / innings;
            System.out.println("Total runs: " + totalRuns);
            System.out.println("Innings played: " + innings);
            System.out.println("Average: " + average);
        }
        else {
            System.out.println("No valid input");
        }
    }
}
