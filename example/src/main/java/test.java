import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kenneth on 2016/8/2.
 */
public class test  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] split = str.split(" ");

        int[][] input = new int[Integer.valueOf(split[0])][Integer.valueOf(split[1])];

        for (int i = 0; i < Integer.valueOf(split[0]); i++) {
            int index = 0;
            if (index < Integer.valueOf(split[1])-1){
                for (int j = 0; j < Integer.valueOf(split[1]); j++) {
                    input[i][j] = scan.nextInt();
                    index ++;
                }
            }else {

            }

        }
        int min = fun(input);
        System.out.println(min);
    }
    public static int fun(int[][] array){
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min){
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
