package javaapplication1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Acer
 */
public class Logic {
    public static Map avtoZap() {
        Map<String, Double> avto = new HashMap();
        avto.put("КрАЗ 250", 50.0);
        avto.put("КрАЗ 256", 48.0);
        avto.put("КрАЗ 255", 42.0);
        avto.put("КрАЗ 257", 38.0);
        avto.put("ГАЗ 2705", 17.0);
        avto.put("ГАЗ 53", 25.0);
        avto.put("ГАЗ 66", 28.0);
        avto.put("ЗIЛ ММЗ 4502", 37.0);
        avto.put("МАЗ 509", 36.5);
        avto.put("МАЗ 5551", 28.0);
        avto.put("МАЗ 5334", 23.0);
        avto.put("УАЗ 469", 16.0);
        avto.put("УАЗ 452", 17.8);
        avto.put("ЗІЛ 130", 31.0);
        avto.put("ЗІЛ 131", 41.0);
        avto.put("ПАЗ 672", 34.0);
        avto.put("УАЗ 3741", 16.0);
        avto.put("ЛАЗ 5252 8а", 35.0);
        avto.put("Lanos", 9.0);
        return avto;
    }
}
