package pl.pjatk.aledud;

import org.springframework.beans.factory.annotation.Value;

public class MyClassOne {
    private int id;
    private String name;
    private float number;
    @Value("${my.custom.property}") private String someText;
    @Value("${my.radom:my default value}") private String someRadom;

    public MyClassOne(int id, String name, float number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public String getSomeRadom() {
        return someRadom;
    }

    public void setSomeRadom(String someRadom) {
        this.someRadom = someRadom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getNumber() {
        return number;
    }

    public String getSomeText() {
        return someText;
    }

    public void setSomeText(String someText) {
        this.someText = someText;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public void soutMe() {
        System.out.println("hello from MyClassONe");
    }
}
