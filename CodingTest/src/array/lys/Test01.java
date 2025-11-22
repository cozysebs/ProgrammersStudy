package array.lys;
import java.util.Arrays;

public class Test01 {

    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
        int[] box = {};     // {5,2,6,3}, {6}, {1,5,2,6,3,7,4}
        int[] answer = new int[commands.length];


        int i = 0;
        while(i<commands.length){
            box = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            for(int j=1;j<box.length;j++){
                if(box[j-1]>box[j]) {
                    int temp = box[j-1];
                    box[j-1] = box[j];
                    box[j] = temp;
                }
                for(int k=1; k<box.length; k++){
                    if(box[k-1]>box[k]) {
                        int temp = box[k-1];
                        box[k-1] = box[k];
                        box[k] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(box));
            answer[i] = box[commands[i][2]-1];
            i++;
        }

        System.out.println(Arrays.toString(answer));
    }
}
