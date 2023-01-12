package honux.calendar;
import java.util.Scanner; 
public class sum {

	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 숫자를 입력하세요.");
		 s1= scanner.next();
		 s2= scanner.next();
		// System.out.println(s1+ "," +s2);
		 a = Integer.parseInt(s1);
		 b = Integer.parseInt(s2);
		// System.out.println(a+ "," +b);
		 System.out.printf("%d와%d의 합은 %d입니다",a,b,a+b);
		 scanner.close();
		 

	}

}
