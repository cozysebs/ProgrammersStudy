package array.ssh;

import java.util.Arrays;

public class sshTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 코딩테스트 > 알고리즘 고득점 Kit > 정렬 > K번째수
				int[] array = {1, 5, 2, 6, 3, 7, 4};
				int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
				
				int[] answer = new int[commands.length];
				int[] temp = {};
//				int[] arraycopy = Arrays.copyOfRange(array, 2, 5);
//				
//				answer = arraycopy;
//				Arrays.sort(answer);
				
				for(int i=0; i<commands.length; i++) {
					temp = commands[i];
					System.out.println(Arrays.toString(temp));
					
					int[] arraycopy = Arrays.copyOfRange(array, temp[0]-1, temp[1]);
					Arrays.sort(arraycopy);
					System.out.print("카피카피");
					System.out.println(Arrays.toString(arraycopy));
					
					int num1 = arraycopy[temp[2]-1];
					System.out.println((arraycopy[temp[2]-1]));
					
					answer[i] = num1;				
					
				}
				
				
				
				System.out.println(Arrays.toString(answer));

	}

}
