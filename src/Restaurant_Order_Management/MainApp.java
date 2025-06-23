package Restaurant_Order_Management;

public class MainApp {
    public static void main(String[] args) {
        // Sipariş durumu
        OrderContext orderContext = new OrderContext();

        // Strateji: Tava veya Izgara
        CookingStrategy strategy = new FryStrategy(); // istersen GrillStrategy()
        Chef chef = new Chef(strategy);

        // Zincir kurulumu
        Waiter waiter = new Waiter();
        Delivery delivery = new Delivery();

        waiter.setNext(chef);
        chef.setNext(delivery);

        // Sipariş akışı başlat
        String order = "Chicken Wings";
        orderContext.showStatus();
        waiter.handle(order, orderContext);
        orderContext.showStatus();
        orderContext.nextStep(); // tekrar çalıştırırsan: zaten teslim edildi
        orderContext.showStatus();
    }
}
