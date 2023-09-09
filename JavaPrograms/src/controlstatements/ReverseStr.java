package controlstatements;

public class ReverseStr {

	public static void main(String[] args) {
		String s="neha indukuri";
		String reversed = " ";
		for(int i=s.length()-1;i>=0;i--)
		{
			reversed=reversed+s.charAt(i);
			
		}
		System.out.println("Reversed String:"+reversed);	

	}

}
