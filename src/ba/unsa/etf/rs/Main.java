package ba.unsa.etf.rs;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int n){
        int suma=0;
        int pomocni;
        while(n!=0){
            pomocni=n%10;
            n/=10;
            suma+=pomocni;
        }

        return suma;
    }
    public static void main(String[] args) {
        int broj;
        Scanner ulaz=new Scanner(System.in);
        broj=ulaz.nextInt();
        for(int i=1;i<=broj;i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }

        }

    }
}
