package honux.calendar;
import java.util.Scanner; 
public class sum {

	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("�� ���ڸ� �Է��ϼ���.");
		 s1= scanner.next();
		 s2= scanner.next();
		// System.out.println(s1+ "," +s2);
		 a = Integer.parseInt(s1);
		 b = Integer.parseInt(s2);
		// System.out.println(a+ "," +b);
		 System.out.printf("%d��%d�� ���� %d�Դϴ�",a,b,a+b);
		 scanner.close();
		 

	}

}
