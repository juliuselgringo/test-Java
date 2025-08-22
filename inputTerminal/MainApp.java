import java.util.Scanner;

class MainApp {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);

        System.out.println("Quel est ton prénom? :");
        String firstName = inputUser.nextLine();
        
        System.out.println("Quel est ton age? :");
        String userAge = inputUser.nextLine();

        System.out.println("Hello " + firstName + ", you have " + userAge + " ans");
    }
}