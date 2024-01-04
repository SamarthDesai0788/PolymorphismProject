package basic;

public class DemoPoly {
	public void add (int a, int b) {
	System.out.println("The Added value is: "+ (a+b));
	}
	public int add(int a, int b, int c){
	return a+b+c;
	}
	public static void main(String[] as){
	DemoPoly dp=new DemoPoly();
	dp. add (20,30);
	System. out. println(dp. add (20,20,20));
	
	}

}
