package com.practice.Programmers;

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
}
