package ex;
import java.util.Scanner;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021118  鄭曉玫
 */

public class ex02_105021118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入度數 : ");
		float n = scn.nextFloat();
	
		if(120>=n){
			float a1 =(float)( n*2.10);
			float a2 =(float)( n*2.10);
			System.out.println(a1);
			System.out.println(a2);
		}else{
			if(121<=n && n<=330){
				float a1 = (float)(n-120);
				float a2 = (float)(n-120);
				System.out.println((a1*3.20)+252);
				System.out.println((a2*2.68)+252);				
			}else{
				if(331<=n && n<=500){
					float a1 = (float)(n-330);
					float a2 = (float)(n-330);
					System.out.println((a1*4.39)+924);
					System.out.println((a2*3.61)+814.8);				
				}else{
					if(501<=n && n<=700){
						float a1 = (float)(n-500);
						float a2 = (float)(n-500);
						System.out.println((a1*4.97)+1670.3);
						System.out.println((a2*4.01)+1428.5);			
					}else{
						if(n>=701){
							float a1 = (float)(n-700);
							float a2 = (float)(n-700);
							System.out.println((a1*5.63)+2664.3);
							System.out.println((a2*4.50)+2230.5);			
						}
					}
				}
			}
		}
			
		
			
		
	}

}
