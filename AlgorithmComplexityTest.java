package ss13_practice_search;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string :");
        String inputString = scanner.nextLine();
        int[] frenquentChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int asccii = (int) inputString.charAt(i);
            frenquentChar[asccii] += 1;
        }
        int max = 0;
        char character =(char) 255;
        for (int j = 0 ; j < 255 ;j++){
            if(frenquentChar[j] > max){
                max = frenquentChar[j];
                character = (char) j;
            }
        }
        System.out.println("The most appearing letter is '" + character + "' with a frequency of " + max + " times");
    }
  
}
