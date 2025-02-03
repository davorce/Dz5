import java.util.Scanner;
import java.util.ArrayList;

public class Zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Kreiramo ArrayList za pohranu ocjena
        ArrayList<Integer> ocjene = new ArrayList<>();
        System.out.println("Unesi ocjene jednu po jednu (unesi negativan broj ili vise od 5 za kraj):");
        while (true) {
            System.out.print("Unesi ocjenu: ");
            int ocjena = scan.nextInt();  // Unosimo ocjenu

            // Ako je unesena nelogicna ocjena, prekidamo unos
            if (ocjena < 0 || ocjena > 5) {
                break;
            }

            // Dodajemo ocjenu u ArrayList
            ocjene.add(ocjena);
        }

        int suma = 0;

        // Računamo zbroj svih ocjena u ArrayList
        for (int ocjena : ocjene) {
            suma += ocjena;
        }

        // Racunam prosjeka
        double prosjek = (double) suma / ocjene.size();
        System.out.println("Prosjecna ocjena je: " + prosjek);
        scan.close();  // Zatvaram scanner
    }
}