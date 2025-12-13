class Animal { // parent class
    public void sleep() {
        System.out.println("Animal is sleeping");
    }

    public void lazy() {
        System.out.println("Animal is lazy");
    }
}

class Dog extends Animal { // child class
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

class Bark extends Animal
{

    }

public class inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog("Tommy",3);
        d1.sleep();
        
    
        Animal a1=new Animal();
        a1.sleep();
        a1.sleep();;

     

    }
}
   