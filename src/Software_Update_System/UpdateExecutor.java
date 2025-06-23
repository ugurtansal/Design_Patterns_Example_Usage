package Software_Update_System;

public class UpdateExecutor implements UpdateVisitor {
    private boolean isPremiumUser;

    public UpdateExecutor(boolean isPremiumUser) {
        this.isPremiumUser = isPremiumUser;
    }

    public void visit(StandardModule module) {
        System.out.println( module.getName() + " module is updating...");
    }

    public void visit(PremiumModule module) {
        if (isPremiumUser) {
            System.out.println( module.getName() + " premium module is updating...");
        } else {
            System.out.println( module.getName() + " module is only for premium users.");
        }
    }
}
