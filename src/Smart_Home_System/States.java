package Smart_Home_System;


     class OnState implements DeviceState {
        public void turnOn() {
            System.out.println("Already on.");
        }

        public void turnOff() {
            System.out.println("Closing.");
        }
    }

     class OffState implements DeviceState {
        public void turnOn() {
            System.out.println("Opening.");
        }

        public void turnOff() {
            System.out.println("Already off.");
        }
    }


