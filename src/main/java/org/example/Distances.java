package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Создание матрицы метрополитена
 */

public class Distances {
    private static final Logger logger = LogManager.getLogger();
    static int[][] matrix;

    /**
     * Инициалиация матрицы
     */
    public static void init(){
        logger.info("Создание матрицы метро");
        int[] distance1 = {3, 3, 2, 3, 3, 3, 2, 3, 2, 2, 2, 5, 2, 3, 4, 2, 3, 2, 0};
        int[] distance2 = {3, 2, 3, 3, 3, 4, 2, 4, 2, 3, 2, 2, 2, 2, 3, 4, 3, 0};
        int[] distance3 = {4, 4, 4, 4, 3, 3, 5, 3, 3, 3, 4, 0};
        int[] distance4 = {3, 2, 2, 3, 3, 3, 2, 0};
        int[] distance5 = {3, 3, 3, 2, 3, 3, 2, 3, 3, 3, 3, 3, 2, 3};


        // Определяем размер общего массива
        int totalLength = distance1.length + distance2.length + distance3.length + distance4.length + distance5.length;

        // Создаем общий массив
        int[] mergedArray = new int[totalLength];

        // Копируем значения из каждого массива в общий массив
        int currentIndex = 0;
        System.arraycopy(distance1, 0, mergedArray, currentIndex, distance1.length);
        currentIndex += distance1.length;

        System.arraycopy(distance2, 0, mergedArray, currentIndex, distance2.length);
        currentIndex += distance2.length;

        System.arraycopy(distance3, 0, mergedArray, currentIndex, distance3.length);
        currentIndex += distance3.length;

        System.arraycopy(distance4, 0, mergedArray, currentIndex, distance4.length);
        currentIndex += distance4.length;

        System.arraycopy(distance5, 0, mergedArray, currentIndex, distance5.length);


        int[][] matrix1 = new int[72][72];

        for (int i = 1; i < 72; i++) {
            matrix1[i][i - 1] = mergedArray[i - 1];
            matrix1[i - 1][i] = mergedArray[i - 1];
        }

        matrix1[9][42] = 1;
        matrix1[42][9] = 1;
        matrix1[43][52] = 1;
        matrix1[52][43] = 1;
        matrix1[41][27] = 1;
        matrix1[27][41] = 1;
        matrix1[12][29] = 1;
        matrix1[29][12] = 1;
        matrix1[11][64] = 1;
        matrix1[64][11] = 1;
        matrix1[10][50] = 1;
        matrix1[50][10] = 1;
        matrix1[28][49] = 1;
        matrix1[49][28] = 1;
        matrix1[63][49] = 1;
        matrix1[49][63] = 1;
        matrix1[28][63] = 1;
        matrix1[63][28] = 1;

        matrix = matrix1;
    }
}