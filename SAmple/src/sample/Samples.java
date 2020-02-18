package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Samples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String x="fgd"; char y ; String z =""; for(int i=x.length()-1;i>=0;i--) {
		 * 
		 * y=x.charAt(i); z=z+x.charAt(i); System.out.println(z);
		 * 
		 * }
		 */

		// Reversimg the words

		/*
		 * String x1 = "iam the king"; String rev = "";
		 * 
		 * String[] ar = x1.split(" "); for (int i = 0; i <= ar.length - 1; i++) {
		 * String word = ar[i]; String revword = ""; for (int j = word.length() - 1; j
		 * >= 0; j--) { revword = revword + word.charAt(j); } rev = rev + revword + " ";
		 * System.out.println(rev);
		 * 
		 * }
		 */

		// reversing no
		/*
		 * int i=1234; int j; int d = 0; while(i>0) { j=i%10; i=i/10; d=d*10+j;
		 * System.out.println(d);
		 * 
		 * }
		 */

		// occurences in a string
		/*
		 * String x="kkinhff"; for(int i=0;i<=x.length()-1;i++) { int count = 1; for(int
		 * j=i+1;j<=x.length()-1;j++) {
		 * 
		 * if(x.charAt(i)==x.charAt(j)) { count=count+1;
		 * System.out.println(x.charAt(i)+""+count); } } }
		 */
		// Remove occurances in String
		/*
		 * String x="kkinhff"; StringBuffer str=new StringBuffer(x); for(int
		 * i=0;i<=str.length()-1;i++) { int count = 1;
		 * 
		 * 
		 * if(str.charAt(i)==str.charAt(i+1)) { str.deleteCharAt(i+1);
		 * 
		 * } } System.out.println(str);
		 */

		/*
		 * String x = "kki nhff"; char[] a = x.toCharArray(); char[] b = new
		 * char[a.length]; int j = 0; for (int i = 1; i < a.length - 1; i++) { // If
		 * current character S[i] // is different from S[j] if (a[j] != a[i]) { j++;
		 * a[j] = a[i]; } } System.out.println(Arrays.copyOfRange(a, 0, j + 1));
		 */

		// ARRAYDECLARATION
		/*
		 * ArrayList<String> arv = new ArrayList<String>(); arv.add("");
		 */

		// hASHMAP DECLARATION
		/*
		 * Map<String, String> m = new HashMap<String, String>(); m.put("King", "Kong");
		 * m.put("Kin", "Kon"); for (Map.Entry ma : m.entrySet()) { ma.getKey(); }
		 */

		// PRIMENO
		/*
		 * Scanner sc =new Scanner(System.in); int x=Integer.parseInt(sc.nextLine());
		 * if(x%2==0) { System.out.println("no is prime"); } else {
		 * System.out.println("no is notprime"); }
		 */

		// print prime no

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter the no"); int
		 * x = Integer.parseInt(sc.nextLine()); for(int i=2;i<=x;i++) { if(i%2==0) {
		 * System.out.println("prime no "+i); } else {
		 * System.out.println("not prime no "+i); } }
		 */
		
		//remove duplicates from Array
		int[] x= {1,2,3,2};
		int[] y=new int[x.length];
		int j=0;
		for(int i=0;i<x.length-1;i++) {
			if(x[i]!=x[i+1]) {
				
				y[j++]=x[i];	
			}
			
		}
		for(int z=1;z<y.length-1;z++) {
			System.out.print(y[z]);
		}

	}

}
