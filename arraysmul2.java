public class arraysmul2 {
    public static void main(String[] args){
    int [] multiples = new int[100];
    for (int i=1;i<=multiples.length;i++){
        multiples[i-1] = 2*i;
        System.out.print(multiples[i-1]+" ");
    }
    }
    
}
