package pl.pjatk.aledud;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyThirdComponent {

    public MyThirdComponent(ApplicationContext applicationContext){
        MyFirstComponent myFirstComponent = applicationContext.getBean("myFirstComponent", MyFirstComponent.class);
        MySecondComponent mySecondComponent = applicationContext.getBean("mySecondComponent", MySecondComponent.class);

        myFirstComponent.helloFromFirst();
        mySecondComponent.helloFromSecond();
    }
}
