package JDBC.jdbc5.db;

public class DbIntegrityException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public DbIntegrityException (String message) {
		super(message);
	}
}
