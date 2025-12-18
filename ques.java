import java.util.ArrayList;
import java.util.Scanner;

class Stack {
    ArrayList<Integer> s = new ArrayList<>();
    public int front(){
        return s.get(0);
    }
    public void enqueue(int newData){
        s.add(newData);
    }
    public int dequeue(){
        int temp = s.get(0);
        s.remove(0);
        return temp;
    }

}

public class ques {
    public static void main(String[] args) {
        Stack list = new Stack();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to add: ");
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            System.out.print("Enter element to add: ");
            int element = sc.nextInt();
            list.enqueue(element);
        }

       
      
        System.out.println("the top most element is : " +list.front());
        System.out.println("the removed element is : "+list.dequeue());
        System.out.println("the top most element after dequeue is : "+ list.front());
    }
}

    

