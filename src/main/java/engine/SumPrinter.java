package engine;

import java.math.BigDecimal;
import java.util.Map;

public class SumPrinter {
    public static void print(Map<String, BigDecimal> workingmap) {
        System.out.println(workingmap.entrySet());
    }
}
