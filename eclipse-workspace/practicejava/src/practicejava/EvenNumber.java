package practicejava;

public class EvenNumber 
{

	public static void main(String[] args)
	{
		/*System.out.println("Even numbers:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }
		*/
		for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number");
            }
	}

	}
}
