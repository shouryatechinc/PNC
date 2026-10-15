package com.java;

import java.util.Stack;

public class StairCaseProblem {
	
	//Input: n = 4, k = 2
	//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]

	//You are climbing a staircase. It takes n steps to reach the top.
	//
	//Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
	static Stack<Stack<Integer>> ans = new Stack<Stack<Integer>>();
	static Stack<Integer> temp = new Stack<Integer>();
	
	public static void makeCombUtil(int n, int left,int k) {
		if(k==0) {
			ans.add(temp);
			for(int i=0;i<temp.size();i++) {
				System.out.print(temp.get(i)+" ");
			}
			System.out.println();
			return;
		}
		for(int i=left;i<=n;i++) {
			temp.add(i);
			makeCombUtil(n, i+1, k-1);
			temp.remove(temp.size()-1);
		}
	}
	
	public static Stack<Stack<Integer>> makeComb(int n,int k){
		makeCombUtil(n,1, k);
		return ans;
	}
	
	public static void main(String[] args) {
		makeComb(4,2);
	}
}
