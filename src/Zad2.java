import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Unos broja od korisnika
        System.out.print("Unesi broj: ");
        int broj = scan.nextInt();
        int sumaDjelitelja = 0;

        // Petlja trazi djelitelje broja (od 1 do broj/2)
        for (int i = 1; i <= broj / 2; i++) {
            if (broj % i == 0) { // Ako je i djelitelj broja dodajemo ga u zbroj u sljedecoj liniji koda
                sumaDjelitelja += i;
            }
        }

        // Provjerava je li broj jednak zbroju svojih djelitelja
        if (sumaDjelitelja == broj) {
            System.out.println(broj + " je savrsen broj.");
        } else {
            System.out.println(broj + " nije savrsen broj.");
        }

        scan.close();
    }
}
