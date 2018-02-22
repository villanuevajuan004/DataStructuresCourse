import java.io.*;

public class Example {

	public static int factorial(int x)
	{
		if(x == 1)
			return 1;
		else
			return x * factorial(x - 1);
	}
	
	
	public static int fibonacci(int x)
	{
		if(x == 0)
			return 0;
		else
			if(x == 1)
				return 1;
			else
				return fibonacci(x - 1) + fibonacci(x - 2);
	}
	
	
	public static int pascal(int n, int k)
	{
		if(k == 0 || k == n)
			return 1;
		else
			return pascal(n - 1, k - 1) + pascal(n - 1, k);
	}
	
	
	public static int fibonacci_array(int n)
	{
		int[] serie = new int[n + 1];
		
		serie[0] = 0;
		serie[1] = 1;
		
		for(int i = 2; i <= n; i++)
			serie[i] = serie[i - 1] + serie[i - 2];
		
		return serie[n];
	}
	
	public static int multiplicacion(int n, int x)
	{
		if(x == 1)
			return n;
		else
			return n + multiplicacion(n, x - 1);
	}
		
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ));
		
		try
		{
			int n = Integer.parseInt( br.readLine() );
			int x = Integer.parseInt( br.readLine() );
			
			int result = multiplicacion(n, x);
			bw.write("Multiplicacion: " + result + "\n");
			
			result = factorial(n);
			bw.write("Factorial: " + result + "\n");
			
			result = fibonacci(n);
			bw.write("Fibonacci: " + result + "\n");
			
			result = fibonacci_array(n);
			bw.write("Fibonacci_: " + result + "\n");
			
			bw.flush();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
