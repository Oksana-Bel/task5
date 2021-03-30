package github.allure;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

public class DynamicTest {

    @Test
    public void testDynamic() {
        Allure.label("owner", "Belousova");
        Allure.feature("Работа с разметкой");
        Allure.story("Динамическая разметка");
        Allure.link("BaseURL", "https://github.com");

    }
}
