package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tableauEntiers = {1,2,3,4,1};
        if ((tableauEntiers.length >= 1) && (tableauEntiers[0] == tableauEntiers[tableauEntiers.length - 1])) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
