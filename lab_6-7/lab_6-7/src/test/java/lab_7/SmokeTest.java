package lab_7;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SmokeTest {

    @Test
    public void SmokeTest(){
        open("http://www.admbel.ru/");
    }
}
