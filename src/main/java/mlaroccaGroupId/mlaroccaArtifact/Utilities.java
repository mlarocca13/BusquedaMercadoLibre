package mlaroccaGroupId.mlaroccaArtifact;

public class Utilities {

	public double getAmount(String valor1)
	{
		double amount2value=Double.parseDouble(valor1);
		return amount2value;
	}
	
	public void sleep(int time) throws InterruptedException{
		Thread.sleep(time);	
	}
	
}
