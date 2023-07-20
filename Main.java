package main;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import mathematics.*;

public class Main {
	
	static int f[] = new int[10];
	
	static void preCompute()
	{
		f[0] = f[1] = 1;
		for(int i=2; i<10; ++i)
			f[i] = f[i-1]*i;
	}
	static boolean isStrong(int x)
	{
		int factSum = 0;
		
		int temp = x;
		while (temp>0)
		{
			factSum += f[temp%10];
			temp /= 0;
		}
		return (factSum == x);
	}

	public static void main(String[] args) {
		
//17th exercise

//		public static void main (String[args])
			preCompute();
			
			int x = 145;
			if(isStrong(x))
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
			x = 534;
			if(isStrong(x))
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");

		
//16th exercise		
//		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(1);numbers.add(2);numbers.add(3);numbers.add(4);
////		numbers.add(5);numbers.add(3);numbers.add(3);numbers.add(3);
////		numbers.add(3);numbers.add(5);numbers.add(5);numbers.add(5);
////		numbers.add(5);numbers.add(3);numbers.add(3);numbers.add(3);
//		
//		int ValueRemove = 3;
//		
//		for(int i=0;i<numbers.size();i++)
//		{
//			if(numbers.get(i)==ValueRemove) 
//				{
//				numbers.remove(i);
//				i--;
////				continue;
//				}
////		int FinalArray = numbers.get(i);
//		}
//		System.out.println(numbers);	
		
//15th exercise
//		
//		int[] array1= {4,9,8,1,7,5};
//		int[] array2= {1,2,3,4,4,4};	
//		Arrays.sort(array1);
//		
////		boolean[] array1bool = new boolean [array1.length];
////		boolean[] array2bool = new boolean [array1.length];
////		
////		boolean duplicate = false;
////		for(int y=0;y<array1.length;y++)
////		{
////			if(array1[y]==array1[y+1])
////			{
////				array1[y+1]=0;
////			}
////		}
//		System.out.println(Arrays.toString(array1));
//		System.out.println(Arrays.toString(array2));
//		System.out.println("\nThe duplicate numbers are: ");
//		
//		for(int i=0; i < array1.length;i++)
//		{
//			int arrloop1 = array1[i];
//			for(int x=0; x < array2.length; x++)
//			{
//				int arrloop2 = array2[x];	
//				if((arrloop1==arrloop2))
//				{
////					if(duplicate)
////					{
//					System.out.print(array1[i]+" ");
//					break;
////					}
////					else
//				}
//			}
//		}
		
//14th exercise		
//
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a Word: ");
//		String words = s.nextLine();
//		
//		int count = 0;
//		
//		String [] stringArr = words.split(" ");
//		String smallest = stringArr[0];
//		for(int x=0; x < stringArr.length;x++)
//		{	
//			if(stringArr[x].length()<=smallest.length())
//			{
//				count = stringArr[x].length();
//				smallest = stringArr[x];
//			}	
//		}		
//		System.out.println("\n \nThe smallest word is: "+smallest+
//							"\nSmallest word number count: "+count);		
		
//13th exercise
//		
//		int[] numbers = {11,18,79,255,16}; 
//		int min = numbers[0];
//		int min2 = numbers[0];
//
//		for (int i=0;i<numbers.length; i++)
//		{
//			if(numbers[i]<min) 
//			{
//			min = numbers[i];
//			}
//		}
//		System.out.println("The minimum number: "+min);
//		for (int x = 0;x<numbers.length;x++)
//		{
//			if((numbers[x]!=min)||(numbers[x]<=min2))
//			{
//				min2 = numbers[x];
//			}
//		} 
//
//		System.out.println("The 2nd minimum number: "+min2);

//		int rankdummy = 1;
//		int Highestrank = 1;
//		//for ranking
//		Arrays.sort(numbers);								//for ranking
//															//for ranking
//		for(int i = 0; i<numbers.length;i++)				//for ranking
//		{													//for ranking
//			if(numbers[i]==numbers[Highestrank-rankdummy])	//for ranking
//			{
//				int finalRank = numbers[i];					//for ranking
//				System.out.println(finalRank);				//for ranking
//			}												//for ranking
//		}													//for ranking
//
		
//12th exercise
//			Scanner s = new Scanner(System.in);
//			
//			System.out.print("Enter a Word: ");
//			String words = s.nextLine();
//			
//			char[] charVowels = {'a','e','i','o','u','a','u'};
//			
//			int arraynumwords = words.length();
//			int Tvowel = 0;
//			char[] charArr = words.toCharArray();
//			
//			for (int i=0;i < arraynumwords; i++) 
//			{
//				char charWord = Character.toLowerCase(charArr[i]);
//				
//				for(int x=0; x < charVowels.length;x++)
//				{
//					if(charWord==charVowels[x])
//					{
//					Tvowel++;
//					break;
//					}
//				}
//			}
//			System.out.print("the number of vowels inside the word is: " +Tvowel);		
		
//11th exercise v2		
//		int sum = 0;
//		int[] num = {94,85,90,78,82};
//
//		for (int i:num) 
//		{
//			sum += i;		
//		}
//		int average = sum/num.length;
//		System.out.println(average);
		
//11th exercise
//		int sum = 0;
//		int[] num = {94,85,90,78,82};
//
//		for (int i=0;i < num.length; i++) 
//		{
//			sum += num[i];		
//		}
//		int average = sum/num.length;
//		System.out.println(average);		
		
//10th exercise
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a number: ");
//		int num = s.nextInt();
//		int result = num%4;
//		
//		if (result==0) 
//		{
//		System.out.println(num+" is a leap year");
//		}
//		else
//		{
//		System.out.println(num+" is not a leap year");			
//		}
		
//9th exercise
//		int sort = 0;
//		
//		int[] num = {0,5,10,3};
//
//		for (int i=0;i<num.length; i++) 
//		{
//			sort = num[i];
////			System.out.println(sort);			
//			if(sort<=num[i])
//			{
//				System.out.println(sort);	
//			}
//		}	
		
		
////8th exercise
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a number: ");
//		int num = s.nextInt();
//		
//		for (int i=num;i>=10; i-=10) 
//		{
//				System.out.println(i);				
//		}		
		
//7th exercise
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a number: ");
//		int num = s.nextInt();
//		
//		for (int i=0;i<=num; i+=10) 
//		{
////			if(i%10==0)
////			{
//				System.out.println(i);				
////			}
//		}
		
////6th exercise
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter a Word: ");
//		String word = s.nextLine();
//		
//		String r = "";
//		
////		String word2 = word.toLowerCase();
//		
//		for (int i=word.length()-1;i>=0; i--) 
//		{
//
//			r = r + word.charAt(i);    			
//		}
//		r = r.substring(0,1).toUpperCase() + r.substring(1); //uppercase first letter
//
//		System.out.print(r);
		
//5th exercise				
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter Number: ");
//		int N = s.nextInt();
//		
//		int result = 1;
//		
//		for (int i=N;i>=1; i--)
//		{
//		result = result*i;
//		System.out.println(result);
//		}
//		System.out.println("The factorial of "+N+" is " +result);
		
//4th exercise
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter Number: ");
//		int N1 = s.nextInt();
//		
//		System.out.print("Enter Number: ");
//		int N2 = s.nextInt();
//		
//		System.out.print("Enter Number: ");
//		int N3 = s.nextInt();
//		
//		int numbers[] = {N1, N2, N3};
//		int max = numbers[0];
//
//		for (int i=0;i<numbers.length; i++)
//		{
//			if(numbers[i]>max)
//				max = numbers[i];
//		}
//		System.out.println();
//		System.out.println("The Maximum number among the 3 numbers given: "+max);

//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter Number: ");
//		int N = s.nextInt();
		
//3rd exercise
//		int sum = 0;
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Enter Number: ");
//		int N = s.nextInt();
		
//		int N = 5;
//		
//		for (int i = 0; i <= N ;i++) 
//		{
//			if((i%2)==0)
//			{
//				sum += i;
//			}
//		}
//		System.out.println("Sum of all even numbers \n"
//						+ "Between 1 to the Given "+N+" = " +sum);
			
//2nd exercise
//		int num1 = 10;
//		int num2 = 2;
//		
//		int result = num1%num2;
//		System.out.println(result);			
		
//		if(result == 1){
//			System.out.println("Number Entered: "+num1);
//			System.out.println("Number Entered is an Odd number");	
//			}
//		else {
//			System.out.println("Number Entered: "+num1);
//			System.out.println("Number Entered is an Even number");	
//		}
//1st exercise			
//		int num1 = 1;
//		int num2 = 1;
//		
//		Arithmetic a = new Arithmetic();
//		int sum =  a.add(num1,num2);
//		
//		System.out.println(num1+" + "+num2+" = "+sum);

	}
}
