
class ZooAnimals {
    String name;
    String colour;
    int age;

    public ZooAnimals(String an, String ac, int aa) {
        this.name = an;
        this.colour = ac;
        this.age = aa;
    }

    public void display1() {
        System.out.println(" Animal Name: " + name + " Colour: " + colour + " Age: " + age);
    }
}

class Caretaker {
    String caretakerName;
    String contactnumber;

    public Caretaker(String cn, String cc) {
        this.caretakerName = cn;
        this.contactnumber = cc;
    }

    public void display2() {
        System.out.println(" CaretakerName: " + caretakerName + " Contactnumber: " + contactnumber);
    }

}

class ZOO {
    String Zooname;
    String location;

    public ZOO(String zn, String zl) {
        this.Zooname = zn;
        this.location = zl;
    }

    public void display3() {
        System.out.println(" Zoo Name: " + this.Zooname + " Location: " + this.location);
    }
}

public class zoosim {
    public static void main(String[] args) {
        ZooAnimals a1 = new ZooAnimals("Lion", "Golden", 5);
        a1.display1();
        ZooAnimals a2 = new ZooAnimals("Tiger", "Orange", 4);
        a2.display1();
        ZooAnimals a3 = new ZooAnimals("Elephant", "Grey", 10);
        a3.display1();
        Caretaker c1 = new Caretaker("John", "1234567890");
        c1.display2();
        Caretaker c2 = new Caretaker("Mike", "0987654321");
        c2.display2();
        ZOO z1 = new ZOO("City Zoo", "New York");
        z1.display3();
    }
}