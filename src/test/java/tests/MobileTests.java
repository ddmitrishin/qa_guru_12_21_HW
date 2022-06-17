package tests;

import com.codeborne.selenide.CollectionCondition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MobileTests extends TestBase {
    @Test
    void searchTest() {
        $(AppiumBy.id("org.wikipedia.alpha:id/search_container")).click();

        $(AppiumBy.id("org.wikipedia.alpha:id/search_src_text")).sendKeys("BrowserStack");

        $$(AppiumBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(CollectionCondition.sizeGreaterThan(0));
    }
}
