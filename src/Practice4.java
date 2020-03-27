
public class Practice4 {

	public static void main(String[] args) {
		String str;
		System.out.print("入力値:");
		str = new java.util.Scanner(System.in).nextLine();//中で話すと、エラー来る
		try {
			int num = Integer.parseInt(str);
			num = num*num;
			System.out.println("結果　:"+num);

		}catch(NumberFormatException e) {//文字を数値に変換失敗したとき

			System.out.println("結果　:"+str);
		}
	}

}
