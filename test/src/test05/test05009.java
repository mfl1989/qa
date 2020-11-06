package test05;
import java.util.Scanner;
public class test05009 {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 System.out.println("suzu");
			 int group = sc.nextInt();
			 int[][] s = new int[group][];
			 for (int i = 0; i < s.length; i++) {
			 s[i] = new int[i + 1];
			 for (int j = 0; j <=i; j++) {
			 if (j == 0 || j == i) {
			 s[i][j] = 1;
			 } else {
			 s[i][j] = s[i - 1][j] + s[i - 1][j - 1];
			 }
			 System.out.print(s[i][j]);
			 }
			 System.out.println();
			 }
			 }
			 }