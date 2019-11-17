package Ex2_3;

import java.util.Scanner;

public class Main {
    private static char letter;

    private static void enterLetter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        letter = scanner.next().charAt(0);
    }

    private static boolean isVowelFirstWay(){
        char[] vowelLetters = {'a','e','i','o','u'};
        for (int i=0;i<vowelLetters.length;i++){
            if (letter == vowelLetters[i] || letter == Character.toUpperCase(vowelLetters[i])){
                return true;
            }
        }
        return false;
    }

    private static boolean isVowelSecondWay(){
        String vowelLetters = "AEIOUaeiou";
        int letterPosition = vowelLetters.indexOf(letter);
        if (letterPosition >= 0){
            return true;
        }
        return false;
    }

    private static boolean isVowelThirdWay(){
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u': return true;
            default: return false;
        }
    }

    private static boolean isVowelFourthWay(){
        boolean isVowel = Character.toString(letter).matches("[AEIOUaeiou]");
        return isVowel;
    }

    private static void outputResult(){
        System.out.println("Is the letter a vowel?");
        System.out.println("According to the first method: " + isVowelFirstWay());
        System.out.println("According to the second method:" + isVowelSecondWay());
        System.out.println("According to the third method:" + isVowelThirdWay());
        System.out.println("According to the fourth method:" + isVowelFourthWay());
    }

    public static void main(String[] args) {
        enterLetter();
        outputResult();
    }
}
