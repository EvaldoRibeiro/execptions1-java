package model.excepctions;

public class DomainExcepction extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DomainExcepction(String msg) {
		super(msg);
	}
	
}
