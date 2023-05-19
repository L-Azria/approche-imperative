package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tableauEntiers = {1,2,3,4,5};
        int[] rotation = new int[6];
        int i;
        System.out.println("rotation à droite :");
        rotation[0]=tableauEntiers[tableauEntiers.length-1];
        for(i=0; i< tableauEntiers.length; i++){
            rotation[i+1] = tableauEntiers[i];
            System.out.println(rotation[i]);
        }

    }
}
