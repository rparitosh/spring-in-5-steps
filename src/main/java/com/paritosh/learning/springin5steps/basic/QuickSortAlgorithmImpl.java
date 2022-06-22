package com.paritosh.learning.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithmImpl implements SortAlgorithm{

    @Override

    public int[] sort(int[] numbers){
        System.out.println("Quick sort algorithm called");
        return numbers;
    }
}
