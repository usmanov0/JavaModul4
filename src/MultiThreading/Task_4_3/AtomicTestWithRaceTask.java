package MultiThreading.Task_4_3;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTestWithRaceTask2 {
    AtomicInteger number = new AtomicInteger(1);

    public AtomicInteger changeNUmber() {
        if (number == null) {number.decrementAndGet();}
        return number;
      }}

