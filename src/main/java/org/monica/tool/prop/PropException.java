package org.monica.tool.prop;

public class PropException extends RuntimeException {

	private static final long serialVersionUID = 8406717080507060728L;

	public PropException() {
		super();
	}

	public PropException(String message) {
		super(message);
	}

	public PropException(Throwable cause) {
		super(cause);
	}

	public PropException(String message, Throwable cause) {
		super(message, cause);
	}

}
