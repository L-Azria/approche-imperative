package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire un nombre :");
        int nombre = scanner.nextInt();
        System.out.println("10 chiffres suivants :");
        for (int i = 1; i < 11; i++ ){
           int nbreSuivants = nombre + i;
            System.out.println(nbreSuivants);
        }

    }
}
