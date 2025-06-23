package Software_Update_System;

 interface Observer {
    void notify(String message);
}

 class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void notify(String message) {
        System.out.println( name + ", notification: " + message);
    }
}
