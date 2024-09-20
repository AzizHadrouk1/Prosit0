public class Exercice2 {
    
    public static int som(int n1 , int n2 ){

        return n1+n2;

    }
   
   
    public static void main(String[] args) {
     int n1 = Integer.parseInt(args[0]);
     int n2 = Integer.parseInt(args[1]);
     int somme = som(n1,n2);
     System.out.println(" Le resultat est " + somme);
    }
}