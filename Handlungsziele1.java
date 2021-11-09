package ch.tbz;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Handlungsziele1 {
    public static void main(String[] args) {
        int A = 0;
        int B = 0;
        int C = 0;

        Scanner eingabewert = new Scanner(System.in);

        do {

            System.out.println("Geben Sie eine ganze Zahl ein: ");
            A = eingabewert.nextInt();
            System.out.println("Geben Sie eine weitere ganze Zahl ein: ");
            B = eingabewert.nextInt();
            System.out.println("Geben Sie eine dritte ganze Zahl ein: ");
            C = eingabewert.nextInt();

            if (A > B) {
                if (A > C) {
                    System.out.println("A ist die grösste Zahl.");
                }
            } else if (B > C) {
                System.out.println("B ist die grösste Zahl.");
            } else {
                System.out.println("C ist die grösste Zahl.");
            }



            if (A < B) {
                if (A < C) {
                    System.out.println("A ist die kleinste Zahl.");
                }
            } else if (B < C) {
                System.out.println("B ist die kleinste Zahl.");
            } else if (C < B || C < A) {
                System.out.println("C ist die kleinste Zahl.");
            } else {
                System.out.println("Alle Zahlen sind gleich gross!");
            }

        }while(A != B || B != C || A != C);




    }
}