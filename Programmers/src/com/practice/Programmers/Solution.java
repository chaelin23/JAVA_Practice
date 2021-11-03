package com.practice.Programmers;

import java.util.Scanner;

public class Solution {
	
	public String waterMelon(int n) {
		String answer = "";
        
        if(n > 0 && n <= 10000) {
            for(int i = 0; i < n/2; i++) {
                answer += "수박";
            }
        
            if(n%2 == 1) answer += "수";
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
	
	public String findKim(String[] seoul) {
		String answer = null;
		
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				answer = "김서방은 " +  i + "에 있다";
			}
		}
		
		return answer;
	}
}
