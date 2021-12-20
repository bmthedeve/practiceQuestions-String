import java.util.*;

public class ProgramIV{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a senten. with spaces b/w words");
		String s1 = sc.nextLine();
		System.out.println("Enter a senten. with spaces b/w words");
		String s2 = sc.nextLine();
		System.out.println("gonna check whether it is Digit");
		String s3 = sc.nextLine();
		System.out.println("Enter a string to reverse");
		String s = sc.nextLine();

		System.out.println(concatAdd(s1,s2));
		System.out.println(reverse(s));
		System.out.println(paddingIndex(s1,s2));
		System.out.println(isDigit(s3));
	}

	public static String concatAdd(String s1, String s2){
		return s1.replaceAll("\\s","")+s2.replaceAll("\\s","");
	}

	public static String reverse(String s){
		char arr[] = s.toCharArray();
		char arr2[] = new char[arr.length];

		int j = 0;
		for(int i=arr.length-1;i>=0;i--){
			arr2[j] = arr[i];
			j++;
		}
		return new String(arr2);
	}

	protected static int paddingIndex(String s1, String s2){
		if(s1.contains(s2)){
			return s1.indexOf(s2.charAt(0));
		}
		else return 0;
	}

	public static boolean isDigit(String s){
		try{
			Integer.parseInt(s);
			return true;
		}
		catch(NumberFormatException ne){
			return false;
		}
	}
}