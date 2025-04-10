import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inc = scanner.nextLine();
        String out = "";
        int start = scanner.nextInt();
        int stop = scanner.nextInt();

        if (start >= 0 && stop <= inc.length()) {
            System.out.println(inc.substring(start, stop + 1));
        }
        scanner.close();
    }
}