package Ex_1;

import java.util.Random;

public class HeadsOrTails {
    private static Random random = new Random();
    private static int numberOfThrows = random.nextInt() & Integer.MAX_VALUE;
    private static int headsCount;
    private static int tailsCount;

    public static void tossCoin(int numberOfTimes){
        int heads = 0;
        for (int i=0;i<numberOfTimes;i++){
            if (random.nextInt(2)== 0){
                heads++;
            }
        }
        headsCount = heads;
        tailsCount = numberOfTimes - heads;
    }

    public static void outputTossResults(int headsCount,int tailsCount){
        System.out.println("Out of " + numberOfThrows + " throws, the eagle fell "
                + headsCount + " times, tails - " + tailsCount);
    }

    public static void main(String[] args) {
        tossCoin(numberOfThrows);
        outputTossResults(headsCount,tailsCount);
    }
}
