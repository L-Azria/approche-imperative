package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire un nombre :");
        int nombre = scanner.nextInt();
        int somme = 0;
        for (int i = 1; i <= nombre; i++){
            somme = somme + i;
        }
        System.out.println("somme de tous les entiers compris entre 1 et " + nombre + " : " + somme);
    }
}
