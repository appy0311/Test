
package exception;
public class NoSuchException extends Exception {
	
	private int custNo;

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	
	
	public NoSuchException(int custNo)
	{
		super("the customer"+custNo+"doesnt exist");
		this.custNo = custNo;
	}

	
	
}
