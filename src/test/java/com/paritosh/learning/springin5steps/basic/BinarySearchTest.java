package com.paritosh.learning.springin5steps.basic;

import com.paritosh.learning.springin5steps.SpringIn5StepsBasicApplication;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario(){
        int result = binarySearch.search(new int[]{});
        assertEquals(3,result);
    }
}
