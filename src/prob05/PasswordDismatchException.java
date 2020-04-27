package prob05;

public class PasswordDismatchException extends Exception {
	public PasswordDismatchException() {
		super("비밀번호가 틀렸습니다.");
	}

	public PasswordDismatchException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
}
