package exercises.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        //ArrayList<Integer> numbersToSum = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
       //Integer theSum = ArrayListPractice.sumAllEvenValues(numbersToSum);
       //System.out.println("The sum is: " + theSum.toString());
      ArrayPractice arrayPractice= new ArrayPractice();
      String[]  returnedWord= arrayPractice.splitGivenString();


        ArrayList<String> wordToSearch = new ArrayList<String>(Arrays.asList(returnedWord));
        System.out.println("what word length are you looking for: ");
        Integer searchLength= ArrayListPractice.getUserSearchInput();
        ArrayListPractice.printWordsWithFiveLetters(wordToSearch,searchLength);
    }
    public static Integer getUserSearchInput(){
        Scanner scanner = new Scanner(System.in);
        Integer myUserInt=scanner.nextInt();
        scanner.close();
        return myUserInt;

    }

    public static void printWordsWithFiveLetters(ArrayList<String> words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }
            //System.out.println(words.get(i));
        }



    public static Integer sumAllEvenValues(ArrayList<Integer> valueToSum) {
        Integer sum=0;
        for (int i = 0; i < valueToSum.size(); i++) {

            if (valueToSum.get(i) % 2 == 0) {
                //System.out.println(valueToSum.get(i));
                sum=sum + valueToSum.get(i);
            }
        }
            return sum;

    }
}



