package fp_java.ch01.rambda;

@FunctionalInterface
public interface Computable {
	public int add(int num1, int num2);
	/**
	 * default 키워드를 메서드 앞에 붙이면
	 * 인터페이스를 구현가능
	 * implements class 에서 overriding 이 가능하다
	 * overriding을 하지 않으면 기본 코드가 동작된다
	 */
	default public void printMessage() {
		System.out.println("기본 메시지입니다");
	}
}
