
public class Practice1 {
	public static void main(String[] args) {
		int divisor = new java.util.Random().nextInt(6);
		int dividend = new java.util.Random().nextInt(6);
		int result;

		System.out.println("乱数を2つ生成しました。");
		try {
			System.out.println(divisor+","+dividend);
			result =  divisor/dividend;
			System.out.println("除算の結果:" + result);
		} catch(ArithmeticException e) {
			System.out.println("0で除算しているためArithmeticExceptionが発生しました。");
		}
	}
}
