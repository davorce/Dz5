public class Zad1 {
    public static void main(String[] args) {
        String nizZnakova = "Ljuljaj, ljuljaj brod!";

        //Kreiranje stringa za usporedbu
        String znakovi = "Ponedjeljak";
        String naziv = new String("Ponedjeljak");

        // 1. == vs equals()
        System.out.println("== comparison: " + (znakovi == naziv)); // false (različiti objekti)
        System.out.println("equals comparison: " + znakovi.equals(naziv)); // true (isti sadržaj)

        // 2. length() - Broj znakova u stringu
        System.out.println("Velicina (length): " + nizZnakova.length()); // 22

        // 3. charAt(index) - Dohvacanje znaka na odredenoj poziciji
        System.out.println("Potraga za znakom (charAt): " + nizZnakova.charAt(11)); // 'j'

        // 4. endsWith(suffix) - Provjera zavrsava li string odredenim nizom znakova
        System.out.println("(endsWith 'od!'): " + nizZnakova.endsWith("od!")); // true

        // 5. indexOf(character) - Prva pojava odredenog znaka
        System.out.println("(indexOf 'L'): " + nizZnakova.indexOf('L')); // 0

        // 6. lastIndexOf(character) - Zadnja pojava odredenog znaka
        System.out.println("(lastIndexOf 'j'): " + nizZnakova.lastIndexOf('j')); // 15

        // 7. contains(substring) - Sadrzi li string podstring
        System.out.println("(contains 'brod'): " + nizZnakova.contains("brod")); // true

        // 8. startsWith(prefix) - Provjera pocinje li string odredenim prefiksom
        System.out.println("(startsWith 'Ljuljaj'): " + nizZnakova.startsWith("Ljuljaj")); // true

        // 9. substring(start, end) - Izdvajanje podstringa
        System.out.println("(substring 9-18): " + nizZnakova.substring(9, 18)); // "ljuljaj b"

        // 10. toLowerCase() - Pretvara u mala slova
        System.out.println("(toLowerCase): " + nizZnakova.toLowerCase()); // "ljuljaj, ljuljaj brod!"

        // 11. toUpperCase() - Pretvara u velika slova
        System.out.println("(toUpperCase): " + nizZnakova.toUpperCase()); // "LJULJAJ, LJULJAJ BROD!"

        // 12. trim() - Uklanja razmake na pocetku i kraju
        String spaced = "   Java   ";
        System.out.println("(trim): " + spaced.trim()); // "Java"

        // 13. replace(oldChar, newChar) - Zamjenjuje znakove u stringu
        System.out.println("(replace 'a' with '@'): " + nizZnakova.replace('a', '@')); // "Ljulj@j, ljulj@j brod!"

        // 14. replaceAll(regex, replacement) - Zamjenjuje podstring pomocu regularnih izraza
        System.out.println("(replaceAll 'ljuljaj' with 'plesi'): " + nizZnakova.replaceAll("ljuljaj", "plesi")); // "Ljuljaj, plesi plesi brod!"

        // 15. isEmpty() - Provjerava je li string prazan
        System.out.println("(isEmpty): " + nizZnakova.isEmpty()); // false

        // 16. split(regex) - Razbija string na dijelove prema separatoru
        String[] words = nizZnakova.split(" "); // Razdvaja po razmaku
        System.out.println("(split): ");
        for (String word : words) {
            System.out.println(word);
        }

        // 17. equalsIgnoreCase(str) - Usporedivanje bez obzira na velika/mala slova
        System.out.println("(equalsIgnoreCase 'ljuljaj, ljuljaj brod!'): " + nizZnakova.equalsIgnoreCase("ljuljaj, ljuljaj brod!")); // true

        // 18. concat(str) - Dodavanje stringa na postojeci string
        System.out.println("(concat ' Ahoy!'): " + nizZnakova.concat(" Ahoy!")); // "Ljuljaj, ljuljaj brod! Ahoy!"

        // 19. format(format, args) - Formatiranje stringa
        String formatted = String.format("Pjesma: %s, Broj znakova: %d", "Ljuljaj brod", nizZnakova.length());
        System.out.println("(format): " + formatted); // "Pjesma: Ljuljaj brod, Broj znakova: 22"

        // 20. toCharArray() - Pretvara string u niz charova
        char[] chars = nizZnakova.toCharArray();
        System.out.println("(toCharArray): ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 21. join(delimiter, elements...) - Spaja više stringova s delimiterom
        String joined = String.join(", ", "Jedan", "Dva", "Tri");
        System.out.println("(join): " + joined); // "Jedan, Dva, Tri"// }
    }
}