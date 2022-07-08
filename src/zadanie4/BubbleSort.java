package zadanie4;

import java.util.*;

public class BubbleSort {
	
	static int size = 75000;
	private volatile long time = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort main = new BubbleSort();
		System.out.println("Time for: " + size + " show in miliseconds");
		System.out.println("For int:");
		for(int i=0; i<30; i++) 
		{
			Integer [] inty = new Integer[size];
			main.adding_int(inty, size);
			System.out.println(main.BubbleSort_int(inty));
		}
		System.out.println("For float:");
		for(int i=0; i<30; i++) 
		{
			Float [] floaty = new Float[size];
			main.adding_float(floaty, size);
			System.out.println(main.BubbleSort_float(floaty));
		}
		System.out.println("For char:");
		for(int i=0; i<30; i++) 
		{
			Character [] chary = new Character[size];
			main.adding_char(chary, size);
			System.out.println(main.BubbleSort_char(chary));
		}	
	}
	
	public long BubbleSort_int(Integer[] array)
	{
		long Start, Stop;
		time = 0;
		Start = System.currentTimeMillis();
		int size = array.length;
		for (int pass = 1; pass < size; ++pass) 
		{
			for (int left = 0; left < (size - pass); ++left) 
			{
				int right = left + 1;
				Integer value = array[left];
				if (value.compareTo(array[right]) > 0)
					swap_int(array, left, right);
			}
		}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
	
	public long BubbleSort_float(Float[] array)
	{
		long Start, Stop;
		time = 0;
		Start = System.currentTimeMillis();
		int size = array.length;
		for (int pass = 1; pass < size; ++pass) 
		{
			for (int left = 0; left < (size - pass); ++left) 
			{
				int right = left + 1;
				Float value = array[left];
				if (value.compareTo(array[right]) > 0)
					swap_float(array, left, right);
			}
		}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
	
	public long BubbleSort_char(Character[] array)
	{
		long Start, Stop;
		time = 0;
		Start = System.currentTimeMillis();
		int size = array.length;
		for (int pass = 1; pass < size; ++pass) 
		{
			for (int left = 0; left < (size - pass); ++left) 
			{
				int right = left + 1;
				Character value = array[left];
				if (value.compareTo(array[right]) > 0)
					swap_char(array, left, right);
			}
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
	
	private void swap_int(Integer[] list, int left, int right) 
	{
		int temp = list[left];
		list[left] = list[right];
		list[right] = temp;
	}
	
	private void swap_float(Float[] list, int left, int right) 
	{
		float temp = list[left];
		list[left] = list[right];
		list[right] = temp;
	}
	
	private void swap_char(Character[] list, int left, int right) 
	{
		char temp = list[left];
		list[left] = list[right];
		list[right] = temp;
	}

}
