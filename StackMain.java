import java.util.ArrayList;
import java.util.Scanner;

class Stack {
ArrayList<Integer> s = new ArrayList<>();
public int peek(){
    return s.get(s.size()-1);
}
public void push(int newData){
    s.add(newData);
}
public int pop(){
    int temp = s.get(s.size()-1);
    s.remove(s.size()-1);
    return temp;
}

}

public class StackMain {
public static void main(String[] args) {
    Stack list = new Stack();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements to push: ");
    int n = sc.nextInt();
    for (int i = 0 ;i<n;i++) {
        System.out.print("Enter element to push: ");
        int element = sc.nextInt();
        list.push(element);
    }

    
    
    System.out.println("the top most element is : " +list.peek());
    System.out.println("the removed element is : "+list.pop());
    System.out.println("the top most element after popping is : "+ list.peek());
}
}


    

