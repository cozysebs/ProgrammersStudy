package array.lsh;

import java.util.Arrays;

public class ex_1122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] box = {};     // {5,2,6,3}, {6}, {1,5,2,6,3,7,4}
        int[] answer = new int[commands.length];
        for(int z=0; z<commands.length;z++) {
        	box = Arrays.copyOfRange(array, commands[z][0]-1, commands[z][1]);
        	System.out.println(Arrays.toString(box));
	        int i = 0;
	        
	        while(i<box.length){
	            
	            for(int j=1;j<box.length;j++){
	            	for(int k=1; k<box.length; k++){
		                if(box[k-1]>box[k]) {
		                    int temp = box[k-1];
		                    box[k-1] = box[k];
		                    box[k] = temp;
		                }
	            	}
	            	i++;
	            }
//	            i++;
	        }
	        System.out.println(Arrays.toString(box));
            answer[z] = box[commands[z][2]-1];
        }

	}

}
