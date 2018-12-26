import java.util.Scanner;

public class chap1_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("값을 입력하세요!");
		System.out.print("A값 :");
		int A = scanner.nextInt();
		
		System.out.print("B값 :");
		int B = scanner.nextInt();
		
		System.out.println("A+B의 값은 :"+(A+B)+"입니다.");
		scanner.close();
	}
}
