package replit;

import java.util.Scanner;

public class Repl223A {public static void main(String args[]){
    Scanner sc=new Scanner(System.in); //Scanner class in java
    System.out.print("Enter the rows you want");
    int rows=sc.nextInt();
    int k=0;
    for(int i=1;i<=rows;i++,k=0){
        for(int space = 1; space<=rows-i;++space){
            System.out.print("  ");
        }
        while(k!=2*i-1){
            System.out.print(rows+" ");
            ++k;
        }
        System.out.println();
    }
//    System.out.println("");
//    for (int i=1; i<=rows; i++){
//        for (int j=1; j<=rows; j++){
//            System.out.print(" ");
//
//        }
//        for (int k=1; k<=i; k++){
//            System.out.print(i+" ");
//
//        }
//        rows--;
//
//        System.out.println();
//    }

}

}
