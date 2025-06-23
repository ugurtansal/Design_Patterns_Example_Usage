package Software_Update_System;

public interface UpdateVisitor {
    void visit(StandardModule module);
    void visit(PremiumModule module);
}
