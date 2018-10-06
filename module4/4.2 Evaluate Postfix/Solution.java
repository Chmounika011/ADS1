import java.util.Scanner;
//package week1;

import java.util.Stack;

 class Postfixeval
{
	public int evalution(String exp)
	{
		Stack<Integer> s=new Stack<Integer>();
		char []c=exp.toCharArray();
		int n=c.length;
		for(int i=0;i<n;i++)
		{
			char ch=c[i];
			if(isOperator(ch))
			{
				switch(ch)
				{
				  case '+': 
					  s.push(s.pop() + s.pop());
				  			break;
                  case '*':
                	  s.push(s.pop() * s.pop());     
                  			break;
                  case '-':
                	  s.push(-s.pop() + s.pop());   
                  			break;
                  case '/':
                	  s.push(1 / s.pop() * s.pop());
                  			break;
				}
			} 
			else if(Character.isDigit(ch)) 
			{
               
                s.push(0);
                while (Character.isDigit(c[i]))
                    s.push(10 * s.pop() + (c[i++] - '0'));
            }
        }
		if (!s.isEmpty()) 
            return s.pop();
        else
            return 0;
    }


		
	private boolean isOperator(char ch) 
	{
		// TODO Auto-generated method stub
		 return ch == '*' || ch == '/' || ch == '+' || ch == '-';
	}
}

public class Solution {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String exp;
		exp=sc.nextLine();
		Postfixeval s=new Postfixeval();
		System.out.println(s.evalution(exp));
		
		
	}

}
