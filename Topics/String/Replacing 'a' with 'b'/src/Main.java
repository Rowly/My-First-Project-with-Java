import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String mute = scanner.nextLine();
        String mutated = null;
        mutated = mute.replace("a", "b");
        System.out.println(mutated);
        scanner.close();
    }
}