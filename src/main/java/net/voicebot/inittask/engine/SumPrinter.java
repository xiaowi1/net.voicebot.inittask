package net.voicebot.inittask.engine;

import java.math.BigDecimal;
import java.util.Map;

public class SumPrinter {
    public void print(Map<String, BigDecimal> workingmap) {
        System.out.println(workingmap.entrySet());
    }
}
