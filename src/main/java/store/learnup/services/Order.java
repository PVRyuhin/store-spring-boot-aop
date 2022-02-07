package store.learnup.services;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Order {
    public static void order(Cart cart) {
        StringBuilder msg;
        msg = new StringBuilder("Товары в заказе:\n");
        Items items = new Items();
        for (CartItem cartItem : Cart.cartItems) {
            Item item = Items.getItemById(cartItem.id);
            msg.append("id: ").append(cartItem.id).append(", наименование: ").append(item.name).append(", кол-во: ").append(cartItem.qty).append("\n");
        }

        Store.notificator.send("pvryuhin@mail.ru", "Новый заказ", msg.toString());

    }
}
