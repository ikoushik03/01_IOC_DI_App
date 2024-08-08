package in.koushik.beans;

public class Car {
	
	private IEngine eng;
	
	public Car()
	{
		System.out.println("Car Constructor");
	}


	public void setEng(IEngine eng) {
		System.out.println("SetMethod called");
		this.eng = eng;
	}

	public void drive()
	{
		System.out.println("aaya yaha");
		int start = eng.start();
		if(start>=1)
		{
			System.out.println("Journey Started");
		}
		else {
			System.out.println("Engine in trouble");
		}
	}

}
