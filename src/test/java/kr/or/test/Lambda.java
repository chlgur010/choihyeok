package kr.or.test;

import java.util.function.IntSupplier;

public class Lambda {
	public static int method(int x, int y) {
		/*IntSupplier supplier = () -> {
		//일반 메서드로 변경 어떻게 하는가?
			//x = x* 10;
			int result = x + y;
			return result;
		};*/
		IntSupplier supplier = new IntSupplier() {
			@Override
			public int getAsInt() {
				int result = x + y;
				return result;
			}
		};
		int result = supplier.getAsInt();
		return result;
	}
	public static void main(String[] args) {
		System.out.println(method(3,5));

	}

}