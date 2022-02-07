package store.learnup.services;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;

@Slf4j
public class Cart {

    public static ArrayList<CartItem> cartItems = new ArrayList<>();

    public void addItem(CartItem cartItem) {
        Items items = new Items();
        Item item = Items.getItemById(cartItem.id);
        if (item == null) {
            log.error("Товар id=" + cartItem.id + " не найден в БД");
        } else if (item.available < cartItem.qty) {
            log.error("Недостаточное количество id=" + cartItem.id);
        } else {
            cartItems.add(cartItem);
            log.info("Добавлен в корзину id=" + cartItem.id + ", количество=" + cartItem.qty);
        }
    }
}