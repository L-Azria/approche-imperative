package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1;
        System.out.println(nombreAleatoire);
        int nombreEssais = 0;
        System.out.println("Devinez le chiffre généré par Java (entre 1 et 100):");

        Scanner scanner = new Scanner(System.in);
        System.out.println("votre réponse :");
        nombreEssais++;
        int nombre = scanner.nextInt();
        while (nombre != nombreAleatoire) {
            if (nombre>nombreAleatoire){
            System.out.println("Vous êtes au-dessus du nombre, nouvelle tentative :");
            nombre = scanner.nextInt();
            nombreEssais++;
        } else if (nombre < nombreAleatoire) {
            System.out.println("Vous êtes en-dessous du nombre, nouvelle tentative :");
            nombre = scanner.nextInt();
            nombreEssais++;
        }}
        System.out.println("Bravo, vous avez trouvé en " + nombreEssais + " coups");

    }
}
