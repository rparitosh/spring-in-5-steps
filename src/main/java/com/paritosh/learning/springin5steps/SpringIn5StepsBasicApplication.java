package com.paritosh.learning.springin5steps;

import com.paritosh.learning.springin5steps.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {


//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithmImpl());
//		int result = binarySearch.search(new int[] {2,4,5});
//		System.out.println("Search result = " + result);
//

		ApplicationContext context = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);

		BinarySearchImpl binarySearch = context.getBean(BinarySearchImpl.class);



//		int result = binarySearch.search(new int[] {});
//		System.out.println("Search result = " + result);
	}

}
