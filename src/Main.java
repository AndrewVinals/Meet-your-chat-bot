import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is Sam.");
        System.out.println("I was created in 2024.");
        System.out.println("Please, remind me your name.");

        String name = sc.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int remainder3 = sc.nextInt();
        int remainder5 = sc.nextInt();
        int remainder7 = sc.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.printf("Your age is %s; that's a good time to start programming!\n", age);
        System.out.println("Now I will prove to you that I can count to any number you want.");


        int count = sc.nextInt();
        for(int i = 0; i <= count; i++){
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");
    }
}