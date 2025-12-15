class ZooAnimals {
    String name;
    String colour;
    int age;
        public void display1() {
        System.out.println(" Animal Name: "+name+" Colour: "+colour+" Age: "+age);}
    }
class Caretaker {
    String caretakerName;
    String contactnumber;
    public void display2()
     {
        System.out.println(" CaretakerName: "+caretakerName+" Contactnumber: " + contactnumber );}
     }
class ZOO {
    String Zooname;
    String location;
    public void display3() {
        System.out.println(" Zoo Name: "+Zooname+" Location: "+ location );}
    }

public class zoosimulator {
    public static void main(String[] args) {
        ZooAnimals a1 = new ZooAnimals();
        a1.name = "Lion";
        a1.colour = "Golden";
        a1.age = 5;
        a1.display1();
        ZooAnimals a2 = new ZooAnimals();
        a2.name = "Tiger";
        a2.colour = "Orange";
        a2.age = 4;
        a2.display1();
        ZooAnimals a3 = new ZooAnimals();
        a3.name = "Elephant";
        a3.colour = "Grey";
        a3.age = 10;
        a3.display1();
        Caretaker c1 = new Caretaker();
        c1.caretakerName = "John";
        c1.contactnumber = ("1234567890");
        c1.display2();
        Caretaker c2 = new Caretaker();
        c2.caretakerName = "Mike";
        c2.contactnumber = ("0987654321");
        c2.display2();
        ZOO z1 = new ZOO();
        z1.Zooname = "City Zoo";
        z1.location = "New York";
        z1.display3();}



        
    
}
