
public class Practice5 {

	public static void main(String[] args) {
		int result,num1,num2;
		int r1 = new java.util.Random().nextInt(10);
		int r2 = new java.util.Random().nextInt(10);
		System.out.println("乱数を2つ生成しました。");

		try {
			//System.out.println(r1+","+r2);
			result = r1/r2;
			System.out.println("除算の結果:"+result);
		}catch(ArithmeticException e) {
			System.out.println("0で除算しているためArithmeticExceptionが発生しました。");
		}finally {
			System.out.println("加算の結果:"+(r1+r2));
			System.out.println("減算の結果:"+(r1-r2));
			System.out.println("乗算の結果:"+(r1*r2));
		}
		System.out.println("クイズです。上記の結果になる2つの乱数は何でしょう?");
		System.out.print("dividendの値:");
		num1 = new java.util.Scanner(System.in).nextInt();
		System.out.print("divisorの値:");
		num2 = new java.util.Scanner(System.in).nextInt();
		if(r1 == num1 && r2 == num2) {
			System.out.println("正解!");
		} else {
			System.out.println("不正解!");
		}
	}

}
