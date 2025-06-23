package Restaurant_Order_Management;

 class GrillStrategy implements CookingStrategy {
    public void cook(String order) {
        System.out.println( order + " is grilled.");
    }
}

 class FryStrategy implements CookingStrategy {
    public void cook(String order) {
        System.out.println(order + " is fried.");
    }
}
