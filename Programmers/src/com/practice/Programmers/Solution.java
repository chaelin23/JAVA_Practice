package com.practice.Programmers;

import java.util.Scanner;

public class Solution {
	
	public String waterMelon(int n) {
		String answer = "";
        
        if(n > 0 && n <= 10000) {
            for(int i = 0; i < n/2; i++) {
                answer += "¼ö¹Ú";
            }
        
            if(n%2 == 1) answer += "¼ö";
        }
        
        return answer;
	}
	
	public void stars() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 0; i < b; i++) {
			for(int j = 0; j < a; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
