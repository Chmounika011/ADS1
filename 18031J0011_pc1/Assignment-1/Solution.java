//package Test;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
		class AddLargeNumbers 
		{
		    
		    public static LinkedList numberToDigits(String number)
		    {
				LinkedList<String> l=new LinkedList<String>();
				int n=l.size();
				for(int i=0;i<n;i++)
				{
				l.add(number);
				
		    }
				return l;
		    }

		    public static String digitsToNumber(LinkedList list) 
		    {
		    	LinkedList<String> l1=new LinkedList<String> ();
		    	l1.addAll(list);
		    	
				return null;

		    }

		    public static LinkedList addLargeNumbers(LinkedList list1, LinkedList list2) 
		    {
		    	LinkedList<String> l1=new LinkedList<String> ();
		    	LinkedList<String> l2=new LinkedList<String> ();
		    	Stack<String> s=new Stack<String>();
		    	Stack<String> s1=new Stack<String>();
		    	l1.addAll(list1);
		    	l2.addAll(list2);
		    	return l1;
		    }
		}

		public class Solution {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String input = sc.nextLine();
		        String p = sc.nextLine();
		        String q = sc.nextLine();
		        switch(input){
		            case "numberToDigits":
		                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
		                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
		                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
		                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
		                break;

		            case "addLargeNumbers":
		                LinkedList pDigits1 = AddLargeNumbers.numberToDigits(p);
		                LinkedList qDigits1 = AddLargeNumbers.numberToDigits(q);
		                LinkedList result = AddLargeNumbers.addLargeNumbers(pDigits1, qDigits1);
		                System.out.println(AddLargeNumbers.digitsToNumber(result));
		                break;
		        }
		    }
		    
		

	}


