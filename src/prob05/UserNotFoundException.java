package prob05;

public class UserNotFoundException extends Exception {
	public UserNotFoundException() {
		super("사용자를 찾을 수 없습니다.");
	}

	public UserNotFoundException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	
}
