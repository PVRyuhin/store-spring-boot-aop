package store.learnup.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import store.learnup.annotations.Loggable;

@Service
@Slf4j
public class Store {

    public static Notificator notificator;

    @Autowired
    public Store(Notificator notificator) {
        Store.notificator = notificator;
    }

    @Loggable
    public void start() {
        log.info("Start");

        Items items = new Items();

        items.add(new Item("Ноутбук 17", 45000, 10));
        items.add(new Item("Ноутбук 15", 35000, 20));
        items.add(new Item("Системный блок", 20000, 100));
        items.add(new Item("Монитор", 15000, 50));

        log.info("Ищем товара с id = 1");
        Item item1 = Items.getInfo(1);

        log.info("Ищем товара с id = 5");
        Item item5 = Items.getInfo(5);

        Cart cart = new Cart();
        cart.addItem(new CartItem(1, 10));
        cart.addItem(new CartItem(3, 5));

        Order.order(cart);


        log.info("Stop");
    }
}


