package lab_6;
//lab 6
import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class SearchingTest {
    @Test
    public void SearchFio(){
        open("https://www.google.ru/");
        $x("//textarea[@name='q']").setValue("Плохих Александр Сергеевич").pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
    }
}