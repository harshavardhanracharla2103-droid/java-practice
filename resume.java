import java.util.Scanner;

public class resume {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Please Enter ur name");
        String Name = a.nextLine();
        System.out.println("Please Enter ur contact number");
        String Contactnumber = a.nextLine();
        System.out.println("Please Enter ur email id");
        String Email = a.nextLine();
        System.out.println("Please Enter ur github link");
        String Gitlink = a.nextLine();
        System.out.println("Please Enter ur Present CGPA");
        String PresentCGPA = a.nextLine();
        System.out.println("Please Enter ur Skills1");
        String Skills1 = a.nextLine();
        System.out.println("Please Enter ur Skills2");
        String Skills2 = a.nextLine();  
         System.out.println("Please Enter ur Skills3");
        String Skills3 = a.nextLine();
        System.out.println("Please ENter ur Strengths");
        String Strengths = a.nextLine();
        
        System.out.println("Please Enter ur MiniProject1");
        String MiniProject1 = a.nextLine();
        System.out.println("Please Enter ur MiniProject2");
        String MiniProject2 = a.nextLine();
       
        System.out.println  ("Please Enter ur 1)");
        String semsiterproject1 = a.nextLine();
        System.out.println("Please Enter ur 2)");
        String semsiterproject2 = a.nextLine();
        System.out.println("please Enter ur certification1");
        String certification1 = a.nextLine();
        System.out.println("Please Enter ur certification2");
        String certification2 = a.nextLine();
        System.out.println("please enter ur certificaton3");
        String certification3 = a.nextLine();
        System.out.println("-----RESUME-----");
        System.out.println("Name:"+Name);
        System.out.println("Contactnumber:"+Contactnumber);
        System.out.println("Email:"+Email);
        System.out.println("Gitlink:"+Gitlink);
        System.out.println("PresentCGPA:"+PresentCGPA);
        System.out.println("SKILLS:");
        System.out.println("1."+Skills1);
        System.out.println("2."+Skills2);
        System.out.println("3."+Skills3);
        System.out.println("STRENGTH:");
        System.out.println(Strengths);
        System.out.println("MINI PROJECTS:");
        System.out.println("1."+MiniProject1);
        System.out.println("2."+MiniProject2);
        System.out.println("SEMEISTR PROJECTS :");
        System.out.println("1."+semsiterproject1);
        System.out.println("2."+semsiterproject2);
        System.out.println(" CERTIFICATIONS");
        System.out.println("1."+certification1);
        System.out.println("2."+certification2);
        System.out.println("3."+certification3);
    }
}