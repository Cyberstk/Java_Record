package bb;

public class UsePalindrome  {    
	public static void main(String[] args) {     
		String str1 = "123456789";     
		String str2 = Palindrome.reverse(str1); 
		int i1 = Integer.parseInt(str1); 
		int i2 = Integer.parseInt(str2);  
		System.out.println("两字符串 " + str1 + " 和 " + str2); 
		System.out.println("连接结果： " + str1 + str2); 
		int i3=i1+i2;  
		System.out.println("对应整数相加结果："+i3);
	}
}
