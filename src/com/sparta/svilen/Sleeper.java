package com.sparta.svilen;

import java.util.concurrent.TimeUnit;

public class Sleeper {
    public static void sleep(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException ignored) { }
    }
}
