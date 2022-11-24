import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int n,carpim=1;

        System.out.print("Faktöriyelini hesaplama istediğiniz sayıyı giriniz: ");
        n = inp.nextInt();

        for (int i = 1; i <= n; i++) {
           carpim=carpim*i;
        }
        System.out.println(carpim);
    }
}