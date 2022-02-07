package store.learnup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import store.learnup.services.Store;

@SpringBootApplication
public class StoreSpringBootAppApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(StoreSpringBootAppApplication.class, args);
        ctx.getBean(Store.class).start();
    }

}
