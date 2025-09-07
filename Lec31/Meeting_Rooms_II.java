package Lec31;

import java.util.*;

public class Meeting_Rooms_II {
	public static void main(String[] args) {
		int[][] intervals = { { 9, 30 }, { 5, 10 }, { 15, 20 }, { 6, 9 }, { 2, 6 }, { 3, 5 } };
//		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
//
//		for (int i = 0; i < intervals.length; i++) {
//			System.out.println(intervals[i][0] + " " + intervals[i][1]);
//		}
		System.out.println(Meeting_Rooms(intervals));
	}
	public static int Meeting_Rooms(int [][]intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		PriorityQueue<int []> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
		pq.add(intervals[0]);
		for (int i = 1; i < intervals.length; i++) {
			if(intervals[i][0]>=pq.peek()[1]) {
				pq.poll();
			}
			pq.add(intervals[i]);
			
		}
		return pq.size();
		
	}
}