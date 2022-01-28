package Assessment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regulaexp 
{
public static void main(String[] args) 
{
	String pattern = "[a-z]+";
	String check = "Regular Expression";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
