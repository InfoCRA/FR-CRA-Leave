package fr.infocom.cra.leave.exceptions;

public class LeaveRequestNotFoundException extends RuntimeException{
	
	public LeaveRequestNotFoundException(String string) {
		super(string);
	}
}