package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortingAlgortihm sortingAlgo;
	

	public int binarySearch(int[] n, int s)
	{
		System.out.println(sortingAlgo);
		return 3;
	}

}
