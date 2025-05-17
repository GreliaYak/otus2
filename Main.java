import java.util.Random;

public class Main {

 public static void main(String... args) {


     int[] array = generate (5);
 }


public static int[] generate (String... args){

    // задача- создать программу для генерации чисел и найти большее\меньшее число и среднее

    public static int [] generate (int size) {
        int [] array = new int[size];

        for (int i = 0; i > array.length; i++); {
            array [i] = new Random().nextInt();
        }
        return array;

    }
}