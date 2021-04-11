package Mobile;

import java.util.Scanner;

public class Mobile {
	
	int[][] mobileArray = {{'a','b','c'}, {'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r'},{'s','t','u','v'},{'w','x','y','z'}};
	public int mobi(int x, int y)
	{
		return mobileArray[x-1][y-1];
	}

	public static void main(String[] args) {
		int size;
		Scanner scanObj=new Scanner(System.in);
		size = scanObj.nextInt();
		int[] input = new int[size];
		for (int i=0; i < size; i++)
			input[i]=scanObj.nextInt();
		for (int i=0; i<size; i+=2)
		{
			int a=input[i];
			int b= input[i+1];
			Mobile mobileObj = new Mobile();
			char req= (char)(mobileObj.mobi(a,b));
			System.out.println(req+" T");
		}
		

	}

}
