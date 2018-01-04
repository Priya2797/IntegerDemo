import java.io.*;
import java.util.*;

class IntegerDemo

{

public static void main(String args[])

	{

System.out.println("Enter the number:");

Scanner sc = new Scanner(System.in);
int num=sc.nextInt();
	if(num <0)

	{
	System.out.println("NEGATIVE");

	}
	else if(num>0)

	{
	System.out.println("POSITIVE");
	}


	else

	{
	System.out.println("ZERO");

	}
	}

}