package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choisir un rang N : ");
        int N = scanner.nextInt();

        if(N==0){
            System.out.println(0);
        } else if (N==1) {
            System.out.println(1);
        } else {int n1 = 0;
        int n2 = 1;
        int fibonacciN = 0;
            for (int i=2; i<=N; i++){
                fibonacciN = n1 + n2;
                n1 = n2;
                n2 = fibonacciN;
            }
            System.out.println("Nombre Fibonacci : " + fibonacciN);
        }

    }
}
