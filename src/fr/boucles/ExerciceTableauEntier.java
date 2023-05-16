package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] number = new int[10];
        for(int i = 0; i<10; i++){
            number[i]=i+1;
            System.out.println(number[i]);
        }
        System.out.println(number[0]);
        System.out.println(number.length);
        System.out.println(number[number.length-1]);
        number[4] = 8;
        System.out.println(number[4]);
        for(int i = 0; i<10; i++){
            System.out.println(number[i]);
        }
    }
}
