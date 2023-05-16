package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] tableauEntiers = new int[5];
        tableauEntiers [0]=1;
        // s'il y a une valeur 6 dans le tableau, le tableau n'est donc pas null, donc pas besoin de controler tableauEntiers.length > 0
        if (tableauEntiers[0] == 6 || tableauEntiers[tableauEntiers.length - 1] == 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
