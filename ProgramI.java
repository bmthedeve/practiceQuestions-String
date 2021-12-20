import java.util.*;

public class ProgramI{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single/double digit number");
		String str = sc.next();
		
		if(str.matches("[0-9]")) System.out.println(str);
		
		else if(str.matches("[0-9][0-9]")) {
			char arr[] = str.toCharArray();
			String s1 = arr[0]+"";
			String s2 = arr[1]+"";
			System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		}
		
		else System.out.println("Wrong digit");

	}
}