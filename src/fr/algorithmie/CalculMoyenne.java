package fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        float somme = 0;
        for(int i = 0; i< array.length; i++){
            somme= somme+array[i];
        }
        float moyenne = somme/ array.length;
        System.out.println("La moyenne est : " + moyenne );
    }
}
