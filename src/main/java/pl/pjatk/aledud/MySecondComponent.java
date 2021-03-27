package pl.pjatk.aledud;

import org.springframework.stereotype.Component;

@Component
public class MySecondComponent {

    public MySecondComponent() {
        System.out.println("Hello from MySecondComponent");
    }

    public void helloFromSecond(){
        System.out.println("Hello from method 2222222");
    }
}

