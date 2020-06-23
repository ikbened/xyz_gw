package com.abc.xyz.helper;

import java.util.concurrent.TimeUnit;

public class Tester {
    public static void gwSleep(String reason, int dur){
        Integer secs = 0;

        while (secs < dur) {
            System.out.println(reason + ": " + secs + "/" + dur + " seconds");
            Integer sleep = Math.min(5, dur - secs);
            secs = secs + sleep;
            try {
                TimeUnit.SECONDS.sleep(sleep);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
