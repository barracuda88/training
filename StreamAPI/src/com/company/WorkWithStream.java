package com.company;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class WorkWithStream {
    public static double searchingAvr(int[] numbers){
        double avr= Arrays.stream(numbers).average().getAsDouble();
        return avr;

    }
    public static long countingZero(int[] numbers){
        long count=Arrays.stream(numbers).filter(x->x==0).count();
        return count;
    }
    public static long countingNumbersGreaterThanZero(int[] numbers){
        long count=Arrays.stream(numbers).filter(x->x>0).count();
        return count;
    }
    public static int [] multipleNumber(int[] numbers){
        int[] new_numbers=Arrays.stream(numbers).map(x->x*2).toArray();
        return new_numbers;
    }
    public static void searchingMinIndex(int[] numbers){
        IntStream.range(0, numbers.length).reduce((a, b) -> numbers[a] > numbers[b] ? b : a)
                .ifPresent(x -> System.out.println("Minimal number is "+numbers[x]+ " with index "+x));
    }

}
