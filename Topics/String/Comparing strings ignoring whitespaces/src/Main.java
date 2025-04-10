import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inc1 = scanner.nextLine();
        String inc2 = scanner.nextLine();

        inc1 = inc1.replace(" ", "").strip();
        inc2 = inc2.replace(" ", "").strip();

        System.out.println(inc1.equals(inc2) ? "true" : "false");

        scanner.close();
    }
}