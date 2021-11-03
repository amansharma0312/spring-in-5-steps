package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSort implements SortingAlgortihm{

	public int[] sort(int[] n)
	{
		//Quick Sort logic
		return n;
	}

}
