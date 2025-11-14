package mkr1;
public class mkr1_2 {
    public static void main(String[] args) {
        int[][] arr = {
            {1, -5, 4, 8, -2},
            {-10, 20, 3, 5},
            {5, 6, 7, 1},
            {-2, -8, -1, -5},
            {100, -200, 300}
        };

        int MaxSum = Integer.MIN_VALUE;

        for (int[] row : arr) {
            int RowSum = 0;

            for (int number : row) {
                if (number > 0) {
                    RowSum += number;
                }
            }

            System.out.println("Сума додатних елементів рядка: " + RowSum);

            if (RowSum > MaxSum) {
                MaxSum = RowSum;
            }
        }

        System.out.println("\n-------------------------------------");
        System.out.println("Найбільше значення серед цих сум: " + MaxSum);
    }
}