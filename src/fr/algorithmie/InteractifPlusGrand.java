package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ecrire 10 nombres :");
        // créer le table nombre pour stocker les 10 données
        int[] nombre = new int[10];
        // supposer que le nombre max est le 1er et le stoker dans la variable max
        int max = nombre[0];
        for (int i=0; i< nombre.length; i++){
            // stocker les 10 données dans le table nombre
            nombre[i] = scanner.nextInt();
            // comparer max avec d'autres données, si la condition est vrai; le nouveau donnné prend la place de max
            if (max < nombre[i]){
                max = nombre[i];
            }
        }
        System.out.println("le plus grand de ces nombres " + max);


    }
}
