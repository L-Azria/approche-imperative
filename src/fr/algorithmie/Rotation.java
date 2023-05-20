package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tableauEntiers = {1,2,3,4,5};
        int[] rotation = new int[5];
        int i;
        System.out.println("rotation à droite :");
        rotation[0]=tableauEntiers[tableauEntiers.length-1];
        System.out.println(rotation[0]);
        for(i=1; i<= tableauEntiers.length-1; i++){
            rotation[i] = tableauEntiers[i-1];
            System.out.println(rotation[i]);
        }

    }
}
