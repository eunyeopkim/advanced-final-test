package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오 >> ");

		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String operation = scanner.next();
		int result = 0;

		if ("+".equals(operation)) {
			Add r = new Add();
			result = r.calculate(a, b);
		} else if ("-".equals(operation)) {
			Sub r = new Sub();
			result = r.calculate(a, b);
		} else if ("*".equals(operation)) {
			Mul r = new Mul();
			result = r.calculate(a, b);
		} else if ("/".equals(operation)) {
			Div r = new Div();
			result = r.calculate(a, b);
		}

		System.out.println(result);

	}

}
