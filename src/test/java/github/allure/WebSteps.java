package github.allure;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step ("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com");
    }

    @Step ("Ищем репозиторий {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
    }

    @Step("Переходим в репозиторий {repository}")
    public void goToRepository(String repository){
        $(By.linkText(repository)).click();
    }

    @Step ("Переходим в Issues")
    public void clickOnIssueTab() {
        $(withText("Issues")).click();
    }

    @Step("Проверяем что Issues с номером {number} сцществует")
    public void shouldSeeIssueWithNumber(int number){
        $(withText("#" + number )).should(Condition.exist);
    }
}
