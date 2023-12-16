package org.example;

import java.util.HashMap;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Стартовый метод
 * Запрашивает данные у пользовалеля
 */
public class Main{
    private static final Logger logger = LogManager.getLogger();
    public static HashMap<Integer,String> matrix = new Data().setMatrix();

    /**
     *Узнаем станции у пользователя через консоль
     */
    public static void main(String[] args) {
        logger.info("Запуск приложения");
        Distances.init();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start station:");
        String startStationName = scanner.nextLine();
        System.out.println("Enter the end station:");
        String endStationName = scanner.nextLine();

        int startStation = -1, endStation = -1;
        for (int i = 0; i < Data.stationNames.length; i++) {
            if (Data.stationNames[i].equals(startStationName)) {
                startStation = i;
            }
            if (Data.stationNames[i].equals(endStationName)) {
                endStation = i;
            }
        }

        try {
            if (startStation == -1 || endStation == -1) {
                throw new IllegalArgumentException("One or both stations not found. Please enter valid station names.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Dijkstra.dijkstra(Distances.matrix, startStation, endStation, matrix);
    }
}
