package Software_Update_System;

import java.util.ArrayList;
import java.util.List;

public class UpdateMediator {
    private List<Observer> observers = new ArrayList<>();
    private boolean isPremiumUser;

    public UpdateMediator(boolean isPremiumUser) {
        this.isPremiumUser = isPremiumUser;
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void performUpdate(Module rootModule) {
        System.out.println("Update process started...\n");
        rootModule.handle(new UpdateExecutor(isPremiumUser));
        notifyAll("Update process completed.");
    }

    private void notifyAll(String msg) {
        for (Observer o : observers) {
            o.notify(msg);
        }
    }
}
