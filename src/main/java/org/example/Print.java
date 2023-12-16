package org.example;

import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Выводит результат пользователю
 */
public class Print {
    private static final Logger logger = LogManager.getLogger();
    HashMap<Integer,String> matrix = new Data().setMatrix();

    private static final int NO_PARENT = -1;

    /**
     * Выводит результат
     * @param startVertex начальная станция
     * @param endVertex конечная станция
     * @param distances расстояния
     * @param parents маршрут
     */
    public static void printSolution(int startVertex, int endVertex, int[] distances, int[] parents, HashMap<Integer, String> matrix) {
        logger.info("Вывод ответа");
        System.out.print("Stations:");

        if (endVertex != startVertex) {
            System.out.print("\n" + Data.stationNames[startVertex] + " -> ");
            System.out.print(Data.stationNames[endVertex]);
            System.out.print("\n" + "Distance:" + "\n");
            System.out.print(distances[endVertex]);
            System.out.print("\n" + "Path:" + "\n");
            printPath(endVertex, parents, Data.stationNames);
        }
    }

    /**
     * Выводит путь
     * @param currentVertex текущая станция
     * @param parents маршрут
     * @param stationNames названия стаций
     */
    private static void printPath(int currentVertex, int[] parents, String[] stationNames) {
        if (currentVertex == NO_PARENT) {
            return;
        }
        printPath(parents[currentVertex], parents, stationNames);
        System.out.print(stationNames[currentVertex] + " ");
    }
}