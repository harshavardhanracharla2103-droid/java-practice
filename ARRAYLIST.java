import java.util.ArrayList;
public class ARRAYLIST {
    public static void main(String[] args){
        ArrayList <String> fruits = new ArrayList <>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("guava");
        System.out.println("Initial array list:"+fruits);

        String first = fruits.get(0);
        System.out.println(first);

        fruits.set(1,"orange");
         System.out.println(fruits);

        fruits.remove(2);
         System.out.println(fruits);}

    

        

        

    }
    

