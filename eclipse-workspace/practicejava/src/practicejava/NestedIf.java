package practicejava;

public class NestedIf 
{

	public static void main(String[] args)
	{
		int a =10;
		int b = 20;
		//if (a < b) 
		if(a>b)
		{
			if (a == b) 
			{
				System.out.println("One");
			}

			else 
			{
				System.out.println("Two");
			}
		} else 
		{
			System.out.println("Three");
		}
	}

}


