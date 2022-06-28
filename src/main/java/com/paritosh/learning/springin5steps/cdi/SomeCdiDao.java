package com.paritosh.learning.springin5steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int[] getData() {
        return new int[]{1,3,5};
    }
}
