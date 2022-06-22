package com.paritosh.learning.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm quickSortAlgorithmImpl;


    public int search(int[] numbers){
        System.out.println("Binary search called");

        numbers = quickSortAlgorithmImpl.sort(numbers);


        return 3;
    }
}
