package bank;

public class AxisBank extends Bankinfo{
	public void deposit(int money)
	{
		int cost=money;
		System.out.println(" The deposit money of axis bankis "+ cost);
	}
	public static void main(String args[])
	{
		AxisBank access= new AxisBank();
		access.deposit(5000);
		Bankinfo bank=new Bankinfo();
		bank.deposit(3000);
		bank.fixed(500000);
		bank.saving();
		
		
		
			}
}
