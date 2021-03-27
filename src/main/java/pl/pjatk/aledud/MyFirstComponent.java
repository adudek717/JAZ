package pl.pjatk.aledud;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyFirstComponent {

    public MyFirstComponent(ApplicationContext applicationContext) {
        System.out.println("Hello from MyFirstComponent");

        //MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);
        //System.out.println(applicationContext.getDisplayName());
        //mySecondComponent.HelloFromSecond();
    }

    public void helloFromFirst(){
        System.out.println("Hello from method 111111");
    }

}
