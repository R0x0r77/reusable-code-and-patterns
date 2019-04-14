package data_structures_test.exceptions;

public class MyStackException extends Exception{

	private static final long serialVersionUID = 1L;
	private String msg;
	
	public MyStackException(String msg) {
		super(msg);
	}
}
