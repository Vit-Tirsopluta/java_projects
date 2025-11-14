package lab1;
import java.util.Random;

public class lab1 {

    public static void main(String[] args) {
                System.out.println("\n-------task 1----------\n");
        double y1,  y2, x = 0, x_end = 5.2, step = 0.4;
        while(x <= x_end){
            System.out.print("x = " + x + "; ");
            y1 = (Math.pow(x,2) + 5*x -1)/(x + 1);
            System.out.println("y = "+y1);
            x = x + step;
        }

        System.out.println("\n-------task 2----------\n");
            x = 9;
            x_end = 15;
            step = 0.5;

            for(double i = x; i <= x_end; i+=step){
                System.out.print("x = " + i + "; ");
                if(i < 11){
                y2 = Math.pow(Math.cos(i + 1), 2);
                System.out.println("y = "+y2);
            }
            else {
                y2 = Math.cos(Math.pow((i + 1), 2));
                System.out.println("y = "+y2);
            }
        }
        System.out.println("\n-------task 3----------\n");
        
        int N = 10;
        int[][] array = new int[N][N];
        Random rand = new Random();
        int maxSum = 0;
        int index = 0;
    
        for(int i = 0; i<N; i++){
            int rowSum = 0;
            for(int j = 0; j < N; j++){
                array[i][j] = rand.nextInt(30) - 15;
                System.out.print(array[i][j] + " ");
                if(array[i][j] > 0){
                rowSum += array[i][j];
                }
            }
            if(rowSum > maxSum){
                maxSum = rowSum;
                index = i + 1;
            }
            System.out.print("\n");
        }

        System.out.println("Найбільша сума в рядку " + index + " = " + maxSum);
    }
}