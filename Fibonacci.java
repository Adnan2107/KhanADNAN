
public class Fibonacci extends Thread {

	private Fiborev fs;
	
	public Fibonacci()
	{
		super();

	}

	public Fibonacci(Fiborev fs)
	{
		super();
		this.fs=fs;

	}

	public void run()
	{
		fs.fiboo();
	}
	

}

