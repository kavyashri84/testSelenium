package com.xyz.day1;

public class test2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] numbers = new int[4][4];
		//numbers = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		//numbers[0][0]=1;
		int[][] numbers = {{1,2,3},{2,3,4,5},{3,4,5,6},{4,5,6,7,8,6}};

		/*System.out.println(numbers[0][1]);
		System.out.println(numbers[3][3]);
		//System.out.println(numbers[4][4]);
		//System.out.println(numbers[1][4]);
		System.out.println(numbers[1][1]);*/
		for(int r = 0; r < numbers.length; r++)
		{
			System.out.println();
			for(int c = 0; c < numbers[r].length; c++)
			{
				System.out.print("\t"+numbers[r][c]);
			}
		}
	}
	

}
