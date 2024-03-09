package forBolmeIslemı;

import java.util.Scanner;

public class ForBolmeIslemı {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;
        Scanner sc = new Scanner(System.in);
        System.out.print("bir sayi girin: ");
        sayi1=sc.nextInt();
        System.out.print("bir sayi daha girin: ");
        sayi2= sc.nextInt();

        for (int a= sayi1; sayi2>=a; a++) {
            if (a%3==0){
            System.out.println(a);
            }
        }
        sc.close();
    }
}
