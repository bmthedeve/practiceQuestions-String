import java.util.*;

public class ProgramII{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence that has a word that starts like c_m...");
		String str = sc.nextLine();
		
		String arr[] = str.split(" ");
		for(int i=0;i<arr.length;i++){
			if(arr[i].matches("[c][a-z][m][a-z]*[A-Z]*")) System.out.println(arr[i].toLowerCase());
		}
		

	}
}