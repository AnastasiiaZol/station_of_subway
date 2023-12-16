package org.example;

import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Хнанит матрицу и названия станций
 */
public class Data {
    private static final Logger logger = LogManager.getLogger();
    /**
     * Названия станций
     */
    public static final String[] stationNames = {"Devyatkino", "Grazhdanskiy Prospekt", "Akademicheskaya",
            "Politekhnicheskaya", "Ploshchad Muzhestva", "Lesnaya", "Vyborgskaya", "Ploshchad Lenina",
            "Chernyshevskaya", "Ploshchad Vosstaniya", "Vladimirskaya", "Pushkinskaya",
            "Tekhnologicheskiy Institut1", "Baltiyskaya", "Narvskaya", "Kirovskiy Zavod", "Avtovo",
            "Leninskiy Prospekt", "Prospekt Veteranov",
            "Parnas", "Prospekt Prosvescheniya", "Ozerki", "Udelnaya", "Pionerskaya", "Chernaya Rechka",
            "Petrogradskaya", "Gorkovskaya", "Nevsky Prospekt", "Sennaya Ploshchad",
            "Technologicheskiy Institut2", "Frunzenskaya", "Moskovskiye Vorota", "Elektrosila", "Park Pobedy",
            "Moskovskaya", "Zvezdnaya", "Kupchino",
            "Begovaya", "Novokrestovskaya", "Primorskaya", "Vasileostrovskaya", "Gostiny Dvor",
            "Mayakovskaya", "Alexander Nevsky Square3", "Elizarovskaya", "Lomonosovskaya", "Proletarskaya",
            "Obukhovo", "Rybatskoye",
            "Spasskaya", "Dostoevskaya", "Ligovsky Prospekt", "Alexander Nevsky Square4",
            "Novocherkasskaya", "Ladozhskaya", "Prospekt Bolshevikov", "Dybenko Street",
            "Komendantsky Prospekt", "Staraya Derevnya", "Krestovsky Ostrov", "Chkalovskaya", "Sportivnaya",
            "Admiralteyskaya", "Sadovaya", "Zvenigorodskaya", "Obvodny Canal", "Volkovskaya", "Bukharestskaya",
            "Mezhdunarodnaya", "Prospekt Slavy", "Dunayskaya", "Shushary"};

    public static HashMap<Integer,String> matrix = new HashMap<>(stationNames.length);
    public HashMap<Integer,String> setMatrix(){
        for (int i = 0;i<stationNames.length;i++){
            matrix.put(i, stationNames[i]);
        }
        return matrix;
    }
}