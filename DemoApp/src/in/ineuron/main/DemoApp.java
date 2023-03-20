package in.ineuron.main;

public class DemoApp {

	public static void main(String[] args) {
		
		int [] a = {10,20,30,40};
		for (int ele :a)
		{
			System.out.println(ele);
		}
		
		String name = "dhoni";
		int count = name.toUpperCase().length();
		System.out.println("the length of the String is :" + count);
	
		StringBuffer sb=new StringBuffer("IrfanPathan");
		int length = sb.append("IND").reverse().length();
		System.out.println(length);
	}
	

}
