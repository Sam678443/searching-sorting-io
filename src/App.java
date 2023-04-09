import java.util.Scanner;

public class App {
    Scanner input;

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.SortingApp();
    }

    public void SortingApp() {
        input = new Scanner(System.in);
        int[] unsortedArray = fileIO.readFile("lib/unsorted.txt");
        System.out.println(
                "Which sorting algorithm would you like to use?\n\n> [B]ubble sort\n> [S]election sort\n>[I]nsertion sort");
        String userChoice = input.nextLine();

        switch (userChoice) {
            case "B":
                Sort.bubbleSort(unsortedArray);
                break;

            case "S":
                Sort.selectionSort(unsortedArray);
                break;

            case "I":
                Sort.insertionSort(unsortedArray);
                break;

            default:
                System.exit(0);
        }
        System.out.println("What would you like to search for?");
        int secondUserChoice = input.nextInt();
        BinarySearch search = new BinarySearch(unsortedArray, secondUserChoice);
    }
}
