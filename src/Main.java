import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       int number = Number(sc);
       int reversenumber =hesablama(number);
       getif(reversenumber,number);
    }
    public static int Number(Scanner sc) {
         return sc.nextInt();
    }
    public static int hesablama(int number){
        int reversenumber =0;
        while(number>0){
        int lastnum= number % 10;
        reversenumber=reversenumber*10+lastnum;
        number/=10;
    }
     return reversenumber;
}
    public static boolean getif(int number ,int reversenumber){
        boolean ispalindrom=false;
     if (reversenumber==number){
          ispalindrom=true;
     }
     if (ispalindrom){
         System.out.println("pali");
        return true;
     }else{
         System.out.println("not");
     }
        return false;
}

}