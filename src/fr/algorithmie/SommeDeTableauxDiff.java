package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array_1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array_2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int[] sommeDeTableaux = new int[array_1.length];
        for (int i = 0; i < array_1.length; i++) {
            if (i > array_2.length - 1) {
                sommeDeTableaux[i] = array_1[i];
            } else {
                sommeDeTableaux[i] = array_1[i] + array_2[i];
            }
            System.out.println("somme de tableaux : " + "[" + i + "] " + sommeDeTableaux[i]);
        }

    }
}
