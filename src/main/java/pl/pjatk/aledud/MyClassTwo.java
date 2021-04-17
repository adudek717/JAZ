package pl.pjatk.aledud;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
public class MyClassTwo {


    @Bean
    public MyClassOne myClassOne(MyClassOne mySecondClassOne) {
        System.out.println("myClassOne bean created");
        mySecondClassOne.setName("ChangedVvalue");
        return new MyClassOne(0, "Test", 1.337f);
    }

    @Bean
    public MyClassOne mySecondClassOne() {
        return new MyClassOne(1000, "test", 10f);
    }


    @Bean
    public List<String> defaultData() {
        System.out.println("defaultData List<String> created");
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    public List<String> anotherDefaultData() {
        System.out.println("anotherDefaultData List<String> created");
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    @ConditionalOnProperty(
            value="my.zadanieDomowe",
            havingValue = "true",
            matchIfMissing = false)
    // ozwiązanie 2 -> Bean tworzy się tylko na podanych niżej profilach
    //@Profile("zadanieDomowe")
    public List<String> zadanieDomoweData() {
        System.out.println("zadanieDomoweData List<String> created - ZAD DOM WORKS 1/2");
        return List.of("1", "2", "3", "4", "5");
    }
}
