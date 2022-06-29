package guru.qa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestForm {

    @BeforeAll
    static void openSitePage() {
        System.out.println("### @BeforeAll");
        Selenide.open("https://demoqa.com/automation-practice-form");
        // open site page
    }

    @AfterAll
    static void closeSitePage() {
        System.out.println("### @AfterAll");
        WebDriverRunner.closeWindow();
        // close site page
    }


    @Test
    void assertTest() {
        Assertions.assertTrue(2<3);
    }


}
