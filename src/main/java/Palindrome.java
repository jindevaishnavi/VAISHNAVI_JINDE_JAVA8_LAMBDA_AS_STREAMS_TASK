import java.util.*;
import java.util.stream.Collectors;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" "+"strings :");
		ArrayList<String> sl = new ArrayList<String>();
		sc.nextLine();
		for(int i = 0;i < n;i++){ 
			String s = sc.nextLine();
			sl.add(s);
		}

		System.out.println("The strings that are palindromes from the given list are :");
		ArrayList<String> res_list = isPalindrome(sl);
		for(int i = 0;i < res_list.size();i++){
			System.out.println(res_list.get(i));
		}
	}
	private static ArrayList<String> isPalindrome(ArrayList<String> s) {
		ArrayList<String> palin_list = (ArrayList<String>) s.stream().filter(i->i.equals(reverseString(i))).collect(Collectors.toList());

		return palin_list; 
	}
	public static String reverseString(String s){
		String reverse_str = "";
		char c[] = s.toCharArray();
		int n = s.length(), j = n -1;
		for(int i = 0;i < n/2;i++){
			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;
			j--;
		}
		reverse_str = String.valueOf(c);
		return reverse_str;

	}

}
/*OUPUT
 * Enter the number of strings:
4
Enter 4 strings :
naman
madam
jo
oyo
The strings that are palindromes from the given list are :
naman
madam
oyo

 * */
 