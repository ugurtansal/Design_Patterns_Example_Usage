package Software_Update_System;

 class StandardModule implements Module {
    private String name;
    private Module next;

    public StandardModule(String name) {
        this.name = name;
    }

    public void accept(UpdateVisitor visitor) {
        visitor.visit(this);
    }

    public void setNext(Module next) {
        this.next = next;
    }

    public void handle(UpdateVisitor visitor) {
        accept(visitor);
        if (next != null) next.handle(visitor);
    }

    public String getName() {
        return name;
    }
}

 class PremiumModule implements Module {
    private String name;
    private Module next;

    public PremiumModule(String name) {
        this.name = name;
    }

    public void accept(UpdateVisitor visitor) {
        visitor.visit(this);
    }

    public void setNext(Module next) {
        this.next = next;
    }

    public void handle(UpdateVisitor visitor) {
        accept(visitor);
        if (next != null) next.handle(visitor);
    }

    public String getName() {
        return name;
    }
}
