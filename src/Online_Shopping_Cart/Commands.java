package Online_Shopping_Cart;

import java.util.List;

 class PurchaseCommand implements Command {
    private List<CartItem> items;

    public PurchaseCommand(List<CartItem> items) {
        this.items = items;
    }

    public void execute() {
        System.out.println("Buying...");
        for (CartItem item : items) {
            System.out.println( item.getName() + " is bought.");
        }
    }
}

 class RemoveItemCommand implements Command {
    private List<CartItem> items;
    private CartItem toRemove;

    public RemoveItemCommand(List<CartItem> items, CartItem toRemove) {
        this.items = items;
        this.toRemove = toRemove;
    }

    public void execute() {
        items.remove(toRemove);
        System.out.println( toRemove.getName() + " is removed.");
    }
}

