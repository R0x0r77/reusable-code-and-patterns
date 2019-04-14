package data_structures_test.exceptions;

public class MyRuntimeException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	String msg;
	
	public MyRuntimeException(String msg) {
		super(msg);
	}
}
