package bekeres;
import java.util.Scanner;
public class Bekeres {
    public static void main(String[] args) {
        Scanner sc;                                 //
        
        sc = new Scanner(System.in);
        
        int szam;
        System.out.print("Kérek egy egész számot: ");
        szam = sc.nextInt();
        
        sc.close();
        
        System.out.println("A bekert szam ketszerese: "+szam*2);
    }
    
}
