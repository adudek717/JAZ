package pl.pjatk.aledud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MySecondComponent {

//    public MySecondComponent(MyClassOne myClassOne, List<String> anotherDefaultData) {
//        System.out.println("Hello from MySecondComponent");
//        myClassOne.soutMe();
//
//        System.out.println(anotherDefaultData);
//    }
    public MySecondComponent(
            MyClassOne myClassOne,
            List<String> anotherDefaultData,
            MyClassOne mySecondClassOne,
            @Value("${my.custom.property}") String someName,
            @Value("${my.radom:my default radom}") String someRadom
    ) {
        MyClassOne mySeondClassOne = new MyClassOne(20, "second class one", 20.11f);
        System.out.println("Hello from my second class");
        myClassOne.soutMe();

        System.out.println(myClassOne.getSomeRadom());
        System.out.println(myClassOne.getName());
        System.out.println(myClassOne.getSomeText());
    }

    public void helloFromSecond(){
        System.out.println("Hello from method 2222222");
    }
}

