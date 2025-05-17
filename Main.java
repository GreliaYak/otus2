import java.util.Random;

public class Main {

    public static void main(String... args) {

        int[] array = generate(5);

        int max = getMinMax(true, array);
        int min = getMinMax(false, array);
        float avg = getAverage(array);

        System.out.println(" Min" + min);
        System.out.println("Max" + max);
        System.out.println("Avg"+ avg);
    }

    public static int[] generate(int size) {

        // задача- создать программу для генерации чисел и найти большее\меньшее число и среднее
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(20);
        }
        return array;
    }
    // ЗАДАЧА - минимум максимум число

    public static int getMinMax(boolean isMax, int[] array) {

        int result = isMax ? -10000 : 10000;
        for (int num : array) {

            if (isMax) {
                if (result < num) {
                    result = num;
                }
            } else {
                if (result > num) {
                    result = num;
                }
            }
        }
        return result;
    }

        // cреднее значение

        public static float getAverage (int [] array){
            int sum = 0;

            for (int num: array){
                sum = sum + num;
            }
            return sum/(float)array.length;
        }



}



