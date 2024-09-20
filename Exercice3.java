
import java.util.Scanner;

public class Exercice3 {
    
    public static int som(int n1 , int n2 ){

        return n1+n2;

    }
   
   
    public static void main(String[] args) {
     Scanner  sc=new Scanner(System.in);
     int n1 = sc.nextInt();
     int n2 = sc.nextInt();
     int somme = som(n1,n2);
     System.out.println(" Le resultat est " + somme);
    }
}