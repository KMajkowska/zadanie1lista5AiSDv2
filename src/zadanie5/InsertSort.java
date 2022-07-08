package zadanie5;

import java.util.*;

public class InsertSort {
	
	static int size = 75000;
	private volatile long time = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertSort main = new InsertSort();
		System.out.println("Time for: " + size + " show in miliseconds");
		System.out.println("For int:");
		for(int i=0; i<30; i++) 
		{
			Integer [] inty = new Integer[size];
			main.adding_int(inty, size);
			System.out.println(main.InsertSort_int(inty));
		}
		System.out.println("For float:");
		for(int i=0; i<30; i++) 
		{
			Float [] floaty = new Float[size];
			main.adding_float(floaty, size);
			System.out.println(main.InsertSort_float(floaty));
		}
		System.out.println("For char:");
		for(int i=0; i<30; i++) 
		{
			Character [] chary = new Character[size];
			main.adding_char(chary, size);
			System.out.println(main.InsertSort_char(chary));
		}
	}
	
	public long InsertSort_int(Integer[] array)
	{
		long Start, Stop;
		time = 0;
		Start = System.currentTimeMillis();
		for (int i = 1; i < array.length; ++i) 
		{
			Integer value = array[i],temp;
			int j; 
			for (j = i; j > 0 && (value < (temp=array[j - 1])); --j) 
				array[j] = temp;
			array[j] = value;
		}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
	
	public long InsertSort_float(Float[] array)
	{
		long Start, Stop;
		time = 0;
		Start = System.currentTimeMillis();
		for (int i = 1; i < array.length; ++i) {
			Float value = array[i],temp;
			int j; 
			for (j = i; j > 0 && (value < (temp=array[j - 1])); --j)
				array[j] = temp;
			array[j] = value;
		}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
	
	public long InsertSort_char(Character[] array)
	{
		long Start, Stop;
		time = 0;
		Start = System.currentTimeMillis();
		for (int i = 1; i < array.length; ++i) {
			Character value = array[i],temp;
			int j; 
			for (j = i; j > 0 && (value < (temp=array[j - 1])); --j)
				array[j] = temp;
			array[j] = value;
		}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
		
	private void adding_int (Integer [] array, int n)
	{
		Random g = new Random();
		for(int i=0; i<n; i++)
		{
			array[i] = Math.abs(g.nextInt(50));
		}
	}
	
	private void adding_float (Float [] array, int n)
	{
		Random g = new Random();
		for(int i=0; i<n; i++)
		{
			array[i] = g.nextFloat()*1000;
		}
	}
	
	private void adding_char (Character [] array, int n)
	{
		Random g = new Random();
		for(int i=0; i<n; i++)
		{
			array[i] = (char)(g.nextInt(122-97)+97);
		}
	}
	
	public void display_int(Integer [] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println('\n');
	}
	
	public void display_float(Float [] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
	
	public void display_char(Character [] array)
	{
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}

}
