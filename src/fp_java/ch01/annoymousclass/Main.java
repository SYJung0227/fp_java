package fp_java.ch01.annoymousclass;

public class Main {

	//nested class 
	private static class SubMain{
		
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		System.out.println(main.toString());
		
		SubMain subMain = new SubMain();
		System.out.println(subMain.toString());
		
//	  익명 클래스 코드:  이름없는 클래스의 선언
		Computable computer = new Computable() {
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		
		System.out.println(computer.toString());
		
		
	}

}
