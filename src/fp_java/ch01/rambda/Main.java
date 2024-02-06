package fp_java.ch01.rambda;

public class Main {

	public static void main(String[] args) {
		// ( ) -> code
		// param -> code
		// abs class
		Computable computer = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		int addResult = computer.add(10, 20);
		System.out.println(addResult);

		// 람다
		Computable lambdaComputer = (int num1, int num2) -> num1 + num2;
		System.out.println(lambdaComputer.add(10, 20));

		// 람다 실생활
		Computable lambdaComputer2 = (num1, num2) -> num1 + num2;
		System.out.println(lambdaComputer2.add(30, 10));

		// 람다 여러줄 코딩
		Computable lambdaComputer3 = (num1, num2) -> {
			System.out.println(">" + num1);
			System.out.println(">" + num2);
			return num1 + num2;
		};
		System.out.println(lambdaComputer3.add(30, 10));
		lambdaComputer3.printMessage();

		// abs class
		Printable printer = new Printable() {
			@Override
			public void print() {
				System.out.println("출력합니다");
			}
		};
		printer.print();

		// 람다
		Printable printer2 = () -> System.out.println("출력합니다22");
		printer2.print();

		Printable printer3 = () -> {
			System.out.println("출력합니다33");
			return;
		};
		printer3.print();

	}
}
