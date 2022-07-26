package assignmentskk;

import java.util.Scanner;

public class GreetingMsgForInputName {
    public static void main(String[] args) {
//        Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name= sc.nextLine();
        System.out.println(greetingForYou(name) +" " + name + ".");

    }
    static String greetingForYou(String n){
        String greeting = "Hope, you are spending great time in this world";
        return (greeting );
    }

}
