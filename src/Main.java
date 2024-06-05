import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is Sam.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");

        String name = sc.nextLine();

        System.out.println("What a great name you have, " + name + "!");
    }
}