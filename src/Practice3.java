
public class Practice3 {
	public static void main(String[] args) {
		int result;
		int r1 = new java.util.Random().nextInt(10);
		int r2 = new java.util.Random().nextInt(10);
		System.out.println("乱数を2つ生成しました。");

		try {
			System.out.println(r1+","+r2);
			result = r1/r2;
			System.out.println("除算の結果:"+result);
		}catch(ArithmeticException e) {
			System.out.println("0で除算しているためArithmeticExceptionが発生しました。");
		}finally {
			System.out.println("加算の結果:"+(r1+r2));
			System.out.println("減算の結果:"+(r1-r2));
			System.out.println("乗算の結果:"+(r1*r2));
		}
	}

}
