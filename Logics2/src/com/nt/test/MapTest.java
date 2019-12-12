package com.nt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MapTest {
	public static void main(String[] args) {
		
			int[] s= {1,34,75,86,5,87,65,5,5,86,54,98};
			Arrays.sort(s);
			for(int i=0;i<s.length;i++) {
				boolean isUnique=false;
				for(int j=0;j<i;j++) {
					if(s[i]==s[j]) {
						isUnique=true;
						break;
					}
				}
				if(!isUnique)
					System.out.println(s[i]);
			}
			
					
	}
	}
	

	
	


