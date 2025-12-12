import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please Enter ur name");
        String Name = a.nextLine();
        Name = Name.toLowerCase();
        StringBuilder sb = new StringBuilder(Name);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if ("aeiou".indexOf(ch) != -1) {
                sb.deleteCharAt(i);
                i--;}
                else if (ch == ' ') {
                sb.setCharAt(i, '.'); 
            }
       
        }
        System.out.println(sb); 
        }

        

    }