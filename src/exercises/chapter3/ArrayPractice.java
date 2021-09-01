package exercises.chapter3;


import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        ArrayPractice arrayPractice = new ArrayPractice();
        //arrayPractice.printOddNum();
        //arrayPractice.splitGivenString();
        arrayPractice.splitGivenStringInToSentences();
    }

    public void printOddNum() {
        int[] myArray = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 1) {
                //System.out.println(myArray[i]);
            }
        }
    }

    public String[] splitGivenString() {

        String myGivenString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse. ";
        String[] mySplitString = myGivenString.split(" ");
        //System.out.println(Arrays.toString(mySplitString));
        return mySplitString;
    }

    public void splitGivenStringInToSentences() {

        String myGivenString = "I would not, could not, in a box. I would not, could not with a fox. " +
                "I will not eat them in a house. I will not eat them with a mouse. ";
        String[] mySplitString = myGivenString.split("\\.");
        System.out.println(Arrays.toString(mySplitString));
    }
}