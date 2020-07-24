import java.util.*;
import java.util.stream.Collectors;

public class StartWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of strings:");
			int n = sc.nextInt();
			System.out.println("Enter "+n+" "+"strings :");
			ArrayList<String> sl = new ArrayList<String>();
			sc.nextLine();
			for(int i = 0;i < n;i++){
				String str = sc.nextLine();
				sl.add(str);
			}
			System.out.println("The list of strings starting with 'a' and have exactly 3 letters are :");
			List<String> res_list = resultStrings(sl);
			res_list.forEach(s->System.out.println(s+"\t"));
		}
		public static List<String> resultStrings(List<String>slist) {
			List<String> ans_string_list = slist.stream().filter(s -> s.length() == 3 && s.startsWith("a")).collect(Collectors.toList());
			return ans_string_list;
		

	}

}
/*
 * Enter the number of strings:
4
Enter 4 strings :
air
aero
ape
aim
The list of strings starting with 'a' and have exactly 3 letters are :
air	
ape	
aim	
*/
