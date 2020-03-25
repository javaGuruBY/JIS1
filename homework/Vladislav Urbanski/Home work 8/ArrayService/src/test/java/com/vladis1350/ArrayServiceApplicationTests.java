package com.vladis1350;

public class ArrayServiceApplicationTests {
	public static void main(String[] args) throws Exception {
		ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
		arrayServiceTest.createShouldReturnEmptyArrayGiveSize();
		arrayServiceTest.sumShouldReturnSumElementsArray();
		arrayServiceTest.avgShouldReturnAVGElementsArray();
	}
}
