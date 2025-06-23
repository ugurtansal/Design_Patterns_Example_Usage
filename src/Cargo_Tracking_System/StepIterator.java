package Cargo_Tracking_System;

import java.util.Iterator;
import java.util.List;

public class StepIterator {
    private String[] steps;

    public StepIterator(String[] steps) {
        this.steps = steps;
    }

    public IStepIterator createIterator() {
        return new Iterator();
    }

    // İç sınıf olarak iterator implementasyonu
    private class Iterator implements IStepIterator {
        private int index = 0;

        public boolean hasNext() {
            return index < steps.length;
        }

        public String next() {
            return hasNext() ? steps[index++] : null;
        }
    }
}

