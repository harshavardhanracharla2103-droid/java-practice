
import java.util.ArrayList;
import java.util.Scanner;

public class todolist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Menu = new ArrayList<>();
        System.out.println("Please Enter your task1:- ");
        String A = sc.nextLine();
        Menu.add(A);
        System.out.println("Please enter Your Task2:- ");
        String B=sc.nextLine();
        Menu.add(B);
        System.out.println("Your tasks are:-" +Menu);
        System.out.println("Please Enter Your finished task");
        String C=sc.nextLine();
        if (C.equals(A)){
            Menu.remove(A);
            System.out.println("Your pending task is "+Menu);
        }
        else {
            Menu.remove(B);
            System.out.println("Your pending task is "+Menu);
        }

    }
}
    

