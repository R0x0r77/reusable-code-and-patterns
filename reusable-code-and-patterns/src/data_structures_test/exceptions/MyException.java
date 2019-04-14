package data_structures_test.exceptions;

public class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	String msg;
	
	public MyException(String msg) {
		super(msg);
	}
}
