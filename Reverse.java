import java.util.Scanner;
class Reverse {
    public static void main(String[] args){
    Scanner Y = new Scanner(System.in);
    int n,r,rev=0;
    System.out.println("Enter Values:");
    n = Y.nextInt();
    System.out.println("Before Reversing:"+n);
    while(n!=0){
        r=n%10;
        rev=rev*10+r;
        n=n/10;
    }
    
    System.out.println("After Reversing:"+rev);
    
    }  
}