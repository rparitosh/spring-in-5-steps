package com.paritosh.learning.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithmImpl implements SortAlgorithm {
    @Override
    public int[] sort(int[] numbers){
        System.out.println("Bubble sort algorithm called");
        return numbers;
    }
}
