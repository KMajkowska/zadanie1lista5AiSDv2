package zadanie4;

import java.util.Random;

public class SelectSort {

	static int size = 75000;
	private volatile long time = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectSort main = new SelectSort();
		System.out.println("Time for: " + size + " show in miliseconds");
		System.out.println("For int:");
		for(int i=0; i<30; i++) 
		{
			Integer [] inty = new Integer[size];
			main.adding_int(inty, size);
			System.out.println(main.SelectSort_int(inty));
		}
		System.out.println("For float:");
		for(int i=0; i<30; i++) 
		{
			Float [] floaty = new Float[size];
			main.adding_float(floaty, size);
			System.out.println(main.SelectSort_float(floaty));
		}
		System.out.println("For char:");
		for(int i=0; i<30; i++) 
		{
			Character [] chary = new Character[size];
			main.adding_char(chary, size);
			System.out.println(main.SelectSort_char(chary));
		}
	}
	
	public long SelectSort_int(Integer [] array) 
	{
		Integer value = null;
		int size = array.length;
		long Start, Stop;
		Start = System.currentTimeMillis();
		for (int slot = 0; slot < size - 1; ++slot) 
		{
			int smallest = slot; // pozycja wartoœci minimalnej
			for (int check = slot + 1; check < size; ++check) 
			{
				value = array[check];
				if (value.compareTo(array[smallest]) < 0)
					smallest = check;
			}
			swap_int(array, smallest, slot);
			}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
	
	public long SelectSort_float(Float [] array) 
	{
		Float value = null;
		int size = array.length;
		long Start, Stop;
		Start = System.currentTimeMillis();
		for (int slot = 0; slot < size - 1; ++slot) 
		{
			int smallest = slot; // pozycja wartoœci minimalnej
			for (int check = slot + 1; check < size; ++check) 
			{
				value = array[check];
				if (value.compareTo(array[smallest]) < 0)
					smallest = check;
			}
			swap_float(array, smallest, slot);
			}
		Stop = System.currentTimeMillis();
		time = Stop - Start;
		return time;
	}
	
	public long SelectSort_char(Character [] array) 
	{
		Character value = null;
		int size = array.length;
		long Start, Stop;
		Start = System.currentTimeMillis();
		for (int slot = 0; slot < size - 1; ++slot) 
		{
			int smallest = slot; // pozycja wartoœci minimalnej
			for (int check = slot + 1; check < size; ++check) 
			{
				value = array[check];
				if (value.compareTo(array[smallest]) < 0)
					smallest = check;
			}
			swap_char(array, smallest, slot);
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
