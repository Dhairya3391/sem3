import java.util.*;
class post
{
	int prec(char c)
	{
	
		if(c=='+'||c=='-')
		{
			return 1;
		}
	    if(c=='*'||c=='/'||c=='%')
		{
			return 2;
		}
		if(c=='^')
		{
			return 3;
		}
		else 
		{
			return 0;
		}
	}

	public static void main(String args[])
	{
	 Stack<Character> st = new Stack<Character>();
		StringBuffer str=new StringBuffer("a*b/c^d+e-f");
		StringBuffer postfix=new StringBuffer("");
		str.append(")");
		st.push('(');
		post p1=new post();
		for(int i=0;i<str.length();i++)
		{
			char next=str.charAt(i);
			if(next >= 'a' && next<= 'z'||next >= 'A' && next<= 'Z')
			{
				postfix.append(next);
			}
			if(next=='(')
			{
				st.push('(');
			}
			if(next==')')
			{
				while(st.peek()!='(')
				{
					postfix.append(st.pop());
				}
				st.pop();
			}
			if(next=='+'||next=='-'||next=='/'||next=='*')
			{
				while(!st.isEmpty() && p1.prec(next)<=p1.prec(st.peek()))
				{
					postfix.append(st.pop());
				}
				st.push(next);

			}
		}
		System.out.println(postfix);

	}
}