package BaseTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Anotatoin {

    @BeforeTest                                      // аннотация  перед тестом
    public void first() {
        System.out.println("Действие перед тестом");
    }
    @AfterTest                                        // аннотация после теста
    public void second() {
        System.out.println("Действие после теста");
    }
    @BeforeMethod                                   // анотация перед методом
    public void third() {
        System.out.println("Действие перед методом");
    }
    @AfterMethod                                       // аннотация после метода
    public void four() {
        System.out.println("Действие после медода");


    }
}