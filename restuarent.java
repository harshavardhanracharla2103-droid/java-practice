import java.util.Scanner;
public class restuarent {
    public static void main (String[] args){

        String[] item = {"bamboochicken", "chickenmanchurya", "chillichicken", "biryani"};
        int [] price = {250, 250, 200, 210};
        int cp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("HVR RESTAURENT WELCOMES YOU");

        System.out.println("enter the number of items you want to order:");
        int n = sc.nextInt();
        String [] itemsOrdered = new String[n];
        System.out.print("enter the items you want to order:");
        String orderitems = sc.nextLine();
        for (int i = 0; i < n; i++) {
            itemsOrdered[i] = sc.nextLine();}
        System.out.println("your order summary:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < item.length; j++) {
                if (itemsOrdered[i].equalsIgnoreCase(item[j])) {
                    System.out.println(itemsOrdered[i] + " : " + price[j]);
                    cp += price[j];
                }
            }


        


        }



        System.out.println("total price:" + cp);    }
}
    

