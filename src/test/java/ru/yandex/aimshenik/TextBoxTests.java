package ru.yandex.aimshenik;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
//    @BeforeAll
//    static void beforeAll(){
//        Configuration.browserSize="1920x1080";
//    }
    @Test
    void successTest(){

        open("https://demoqa.com/text-box");
        $("#userName").setValue("Anatoly");
        $("#userEmail").setValue("ichi111@yandex.ru");
        $("#currentAddress").setValue("Tiraspol");
        $("#permanentAddress").setValue("at Work");


        $("#submit").scrollTo().click();

        $("#output").shouldBe(visible);

        $("#name").shouldHave(text("Anatoly"));
        $("#email").shouldHave(text("ichi111@yandex.ru"));
        $("#output #currentAddress").shouldHave(text("Tiraspol"));
        $("#output").$("#permanentAddress").shouldHave(text("at Work"));

    }
}
