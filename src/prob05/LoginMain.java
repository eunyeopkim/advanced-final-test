package prob05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LoginMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<User> joinUsers = new ArrayList<User>();
		joinUsers.add(new User( "john", "1234"));
		joinUsers.add(new User( "e", "4321"));
		joinUsers.add(new User( "j", "1111"));
		
		
		System.out.println("아이디를 입력하시오 : ");
		String id = scanner.nextLine();
		
		System.out.println("비밀번호를 입력하시오 : ");
		String password = scanner.nextLine();
		

		User tempUser = new User(id,password);		// 임시 User를 만들어서 원본과 비교하자.
		
		try {
			login(joinUsers, tempUser);
			System.out.println("로그인 성공");
		} catch (UserNotFoundException e) {

			System.out.println( e );
		} catch (PasswordDismatchException e) {
			
			System.out.println( e );
		}
		

	}
	
	public static void login(List<User> users, User user ) throws UserNotFoundException, PasswordDismatchException {
		if( !users.contains(user) ){
			throw new UserNotFoundException();
		}
		
		User savedUser = users.get( users.indexOf( user ) );
		
		if( !savedUser.getPassword().equals( user.getPassword()) ){
			throw new PasswordDismatchException();
		}
	}
}
