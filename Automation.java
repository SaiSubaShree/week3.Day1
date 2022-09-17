package org.system;

public class Automation extends MultipleLaunguage
{
	public void java() {
		System.out.println("The java is called from Launguage interface");
		
	}
	@Override
	public void Selenium() {
		System.out.println("The Selenium Method is called from Testool");
		}
	public void ruby()
	{
	System.out.println("The ruby is called from Multiple Laungaue");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation access= new Automation();
		access.java();
		access.Selenium();
		access.ruby();
		access.python();
		
		
	}
	
	
	

}
