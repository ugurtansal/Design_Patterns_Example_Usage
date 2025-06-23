package Software_Update_System;

public interface Module {
    void accept(UpdateVisitor visitor);
    void setNext(Module next); //For Chain
    void handle(UpdateVisitor visitor);
}
