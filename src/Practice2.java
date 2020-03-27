
public class Practice2 {
	public static void main(String[] args) {
		int array[] = new int[10];
		for(int i = 0;i < 10;i++) {
			array[i] = i+2;
		}
		int a = new java.util.Random().nextInt(16);
		try {
			System.out.println("配列の" + a + "番目を参照します。");
			System.out.println(a + "番目の中身は"+array[a]+"です。");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(a + "番目はインデックス範囲外のため、参照することができません。");
		}
	}

}
