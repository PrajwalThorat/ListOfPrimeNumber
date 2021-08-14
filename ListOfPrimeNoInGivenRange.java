import java.util.Scanner;
public class ListOfPrimeNoInGivenRange {

    public static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ;  i <= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range To find Prime Number");
        System.out.print("From : ");
        int from = scanner.nextInt();
        System.out.print("To   : ");
        int to = scanner.nextInt();
        for(int i = from ; i<=to ; i++){
            if(IsPrime(i)){
                System.out.println(i);
            }
        }
    }

    
}
