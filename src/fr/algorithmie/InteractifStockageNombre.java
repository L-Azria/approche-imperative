package fr.algorithmie;

import java.util.Scanner;

// A finir
public class InteractifStockageNombre {
    public static void main(String[] args) {
        System.out.println("1. Ajouter un nombre\n" +
                "2. Afficher les nombres existants.\n" +
                "Choisissez une option");
        Scanner scanner = new Scanner(System.in);
        int nombreOption = scanner.nextInt();

        int[] tableNombre = new int[3];
        int i = 0;
        while (i <= tableNombre.length){
            if(nombreOption==1){
                System.out.println("Ecrire un chiffre pour l'ajouter au tableau : ");
                    tableNombre[i] = scanner.nextInt();
                    i++;
                System.out.println("1. Ajouter un nombre\n" +
                        "2. Afficher les nombres existants.\n" +
                        "Choisissez une option");
                nombreOption = scanner.nextInt();

            } else if (nombreOption==2) {
                System.out.println("Contenu du table");
                for (i=0; i< tableNombre.length;i++){
                    System.out.println(tableNombre[i]);
            }

        }
        }
    }
}