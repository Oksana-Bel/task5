package github.allure;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AnnotatedStepsTestsAllure {

    private final static String REPOSITORY = "eroshenkoam/allure-example";
    private final static String USER = "eroshenkoam";
    private final static int ISSUE_NUMBER = 68;

    private WebSteps steps = new WebSteps();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void testSearch() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.clickOnIssueTab();
        steps.shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
