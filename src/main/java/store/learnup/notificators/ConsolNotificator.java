package store.learnup.notificators;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import store.learnup.services.Notificator;


@Service
@Profile("local")
public class ConsolNotificator extends Notificator {

    public void send(String toAddress, String subject, String message) {
        System.out.println();
        System.out.println("Внимание. Новое уведомление.");
        System.out.println("Получатель=" + toAddress);
        System.out.println("Тема=" + subject);
        System.out.println("Сообщение=" + message);
    }
}
