package com.ecartkp.eMall.exception;

public class ECartException extends RuntimeException {

	private static final long serialVersionUID = 5335306527247496940L;
	private String customMessage;

	/**
	 * @param message
	 */
	public ECartException(String message, Throwable cause) {
		super(message, cause);
		this.customMessage = message;
	}
	
	public ECartException(String message) {
		super(message);
		this.customMessage = message;
	}

	public ECartException(Exception e) {
		super(e);
		this.customMessage = "Exception Occured";
	}
	
	/**
	 * @return the customMessage
	 */
	public String getCustomMessage() {
		return customMessage;
	}

	
}
