import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {

    @Test
    void selenideSearchTest() {
        open("https://www.ya.ru/");

        $("#text").setValue("Selenide").pressEnter();

        $("#search-result").shouldHave(text("selenide.org"));
    }


    @Test
    void pixelscanConsistencyTest() {
        open("https://pixelscan.net");

        $("#consistency").shouldHave(text("inconsistent"));


    }
}