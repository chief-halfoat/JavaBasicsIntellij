package replit;

import java.util.Scanner;

public class Repl223 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number.");
        int input = scanner.nextInt();
        int k=0;
        for(int i=1;i<=input; ++i, k=0){
            for(int j=1; j<=input-i;++j){
                System.out.print("  ");
            }
            while(k!=2*i-1){
                System.out.print(input+" ");
                k++;
            }
            System.out.println();
        }
    }
}
