package array.ssh;

import java.util.Arrays;

public class sshTest01_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1}, {1,7,3}};
        int[] box = {};
        int[] answer = new int[commands.length];


        for (int i=0; i<commands.length; i++) {
            box = Arrays.copyOfRange(array, commands[i][0]-1,
                    commands[i][1]);    // {5,2,6,3}
            
            int temp;
            int num1 = 0;
            while(num1<=box.length) {
            	for(int j=1;j<box.length;j++){
                    if(box[j-1]>box[j]) {
                        temp = box[j-1];
                        box[j-1] = box[j];
                        box[j] = temp;
                    }
            	}
            	num1++;
            }
            
            answer[i] = box[commands[i][2]-1];
            for (int a : box) {
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }

	}

}
