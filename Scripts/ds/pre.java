import java.util.*;
class pre
{
  int prec (char c)
  {

    if (c == '+' || c == '-')
      {
	return 1;
      }
    if (c == '*' || c == '/' || c == '%')
      {
	return 2;
      }
    if (c == '^')
      {
	return 3;
      }
    else
      {
	return 0;
      }
  }
  public static void main (String args[])
  {
    StringBuffer str = new StringBuffer ("a*b/c^d+e-f");
    String rev = "";
    Stack < Character > st = new Stack < Character > ();
    StringBuffer postfix = new StringBuffer ("");
   
    st.push ('(');
    str.append (")");
    pre p1 = new pre ();
    char col = ')';
    char op = '(';
    for (int i = str.length () - 1; i > 0; i--)
      {
	char next = str.charAt (i);
	if (next == '(')
	  {
	    rev += ')';
	  }
	else if (next == ')')
	  {
	    rev += '(';
	  }
	else
	  {
	    rev += next;
	  }
      }
    for (int j = 0; j < str.length (); j++)
      {
	char next = str.charAt (j);
	if (next >= 'a' && next <= 'z' || next >= 'A' && next <= 'Z')
	  {
	    postfix.append (next);
	  }
	if (next == '(')
	  {
	    st.push ('(');
	  }
	if (next == ')')
	  {
	    while (st.peek () != '(')
	      {
		postfix.append (st.pop ());
	      }
	    st.pop ();
	  }
	if (next == '+' || next == '-' || next == '/' || next == '*')
	  {
	    while (!st.isEmpty () && p1.prec (next) <= p1.prec (st.peek ()))
	      {
		postfix.append (st.pop ());
	      }
	    st.push (next);

	  }
      }
   
    System.out.println (postfix.reverse());
  }
}
