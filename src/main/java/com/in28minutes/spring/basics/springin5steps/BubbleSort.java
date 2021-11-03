package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortingAlgortihm{

	public int[] sort(int[] n)
	{
		//Bubble Sort logic
		return n;
	}

}
