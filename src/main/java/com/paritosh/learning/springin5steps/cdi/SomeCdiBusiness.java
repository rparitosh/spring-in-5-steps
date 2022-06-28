package com.paritosh.learning.springin5steps.cdi;

import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
    @Inject
    private SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao() {
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao) {
        this.someCdiDao = someCdiDao;
    }

    public int findGreatest(){
        int[] numbers = someCdiDao.getData();
        int greatest = Integer.MIN_VALUE;
        for (int i : numbers){
            if (i > greatest){
                greatest = i;
            }
        }
        return  greatest;
    }
}