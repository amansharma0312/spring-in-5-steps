package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) 
	{
		//Without Spring Framework
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSort());
		//int result = binarySearch.binarySearch(new int[]{12, 3, 4}, 5);
		//System.out.println(result);
		ApplicationContext appCont = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = appCont.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{12, 3, 4}, 5);
		System.out.println(result);
	}

}
