 class StudentDons {
    String name;
    int age;
    String Location;
    String Hobbies;
    public StudentDons(String n, Integer a, String loc, String hob){
        this.name = n;
        this.age = a;
        this.Location = loc;
        this.Hobbies = hob;

    }

    public void display() {
        System.out.println(" My self "+name+" iam "+ age+" Years old And Iam from"+Location+" and my hobbies are: "+Hobbies);
   
    }
}
public class studentcons {
    public static void main(String[] args) {
        
        StudentDons s1 = new StudentDons("Harsh", 20,"Mumbai","Reading");
        s1.display();
        StudentDons s2 = new StudentDons("Rohan", 21,"Delhi","Gaming");        
        s2.display();
        StudentDons s3 = new StudentDons("Shubham", 22,"Chennai","Coding");
        s3.display();
        StudentDons s4 = new StudentDons("Amit", 23,"Kolkata","Traveling");
        s4.display();
        StudentDons s5 = new StudentDons("Vikram", 24,"Bangalore","Music");
        s5.display();}
}