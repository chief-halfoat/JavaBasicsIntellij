package replit;

import java.util.Scanner;

//Some pyramid stuff
public class Repl223 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("What number would you like to use for the pyramid?");
        int rows = scn.nextInt();
        System.out.println("");
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=rows; j++){
                System.out.print(" ");
            }
            rows--;
            for (int k=1; k<=i; k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void pyramidBuilder(int n){
        for (int i = 1; i < n; i++) {
            for(int j=1;j<n;j++){
                System.out.print(" ");
        }
            n--;
            for(int k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
