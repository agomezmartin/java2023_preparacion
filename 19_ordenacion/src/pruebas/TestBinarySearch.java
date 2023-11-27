package pruebas;

import java.util.Arrays;
import java.util.Comparator;

public class TestBinarySearch {

	public static void main(String[] args) {
		int[] n= {7,1,8,3,2};
		String [] m= {"abc","ab","xys","v"};
		Comparator<String> cmp=(a,b)->Integer.compare(a.length(), b.length());
		String [] x=m;
		Arrays.sort(x,cmp);
		
		System.out.println(Arrays.binarySearch(n, 3));//impredecible
		System.out.println(Arrays.binarySearch(n, 11));//impredecible
		System.out.println(Arrays.binarySearch(x, "ab",cmp));//1
		System.out.println(Arrays.binarySearch(m, "myclass",cmp));//-5
		

	}

}
