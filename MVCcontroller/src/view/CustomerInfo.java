package view;
import exception.NoSuchException ;
import controller.*;
import java.util.Scanner;

public class CustomerInfo {

	public static void main(String[] args) throws NoSuchException {
		// TODO Auto-generated method stub
		
		String y ="y";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer number: ");
		
		while(y.equalsIgnoreCase("y"))
		{
		
		int custNo = sc.nextInt();
		Customer cust = Customer.getNameAndAddress(custNo);
		
		// in the previous one it was getting output from IO so it was easy to just get message and try catch the error. Now because there is an additional layer, have to check if 
		// null or not - depending on that throw exception: force throw cant directly get it.
		
		if(cust.equals(null))
		{
			throw new NoSuchException(custNo);
		}
		else
		{
		System.out.println("\n"+ "  **** " + cust.toString()+"\n");
		}
		
		System.out.println("go again?: ");
		y = sc.next();
		}
		
		sc.close();
	}
	
	
}
