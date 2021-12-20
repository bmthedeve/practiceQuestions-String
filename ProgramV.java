import java.util.*;

public class ProgramV{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Bucket b = new Bucket("1234",5,6);
		System.out.println(transfer("4321",b));
		System.out.println(countChars("Hahaha",'a',b));
		System.out.println(reverse("Hello"));
	}
	
	public static int transfer(String str, Bucket bkt){
		bkt.setData(str);
		return Integer.parseInt(bkt.getData());
	}

	public static int countChars(String str, char c, Bucket bkt){
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==c) count++;
		}
		bkt.setCounter(count);
		return count;
	}	

	public static String reverse(String str){
		StringBuilder sb = new StringBuilder(str);
		return (sb.reverse()).toString();
	}
}

class Bucket{
	private String data;
	private int counter;
	private int value;
	
	public Bucket(String data, int counter, int value){
		this.data = data;
		this.counter = counter;
		this.value = value;
	}
	
	public String getData(){
		return data;
	}
	public int getCounter(){
		return counter;
	}
	public int getValue(){
		return value;
	}
	public void setData(String data){
		this.data = data;
	}
	public void setCounter(int counter){
		this.counter = counter;
	}
	public void setValue(int value){
		this.value = value;
	}

	@Override
	public String toString(){
		return "Bucket [data = "+data+",counter = "+counter+",value = "+value+"]";
	}
}