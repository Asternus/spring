package com.project.spring.lesson59;

import com.project.spring.lesson59.entity.Phone;
import com.project.spring.lesson59.entity.PhoneType;
import com.project.spring.lesson59.service.MicroPhoneService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfig.class);
        MicroPhoneService microPhoneService = ctx.getBean(MicroPhoneService.class);

        microPhoneService.createMicroPhonesBeforeStart();
        final Phone byId = microPhoneService.getById(1L);
        final Long id = byId.getId();
        System.out.printf("this is my id%d%n", id);
        System.out.printf("this is my old phone %s%n", byId);

        byId.setName("MyFirstName");
        byId.setPhoneType(PhoneType.LITTLE);

        microPhoneService.update(byId);

        final Phone updatedPhone = microPhoneService.getById(byId.getId());

        System.out.printf("my new phone is %s%n", updatedPhone);

        final boolean delete = microPhoneService.delete(updatedPhone);

        System.out.printf("i delete %s%n", delete);

    }

}
