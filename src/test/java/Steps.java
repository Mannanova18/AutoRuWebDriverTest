import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class Steps {

    private WebDriver webDriver;

    Steps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open(String url) {
        webDriver.get(url);
    }

    public void shouldSeeUrl(String url) {
        assertThat("Перешли на другую страницу",
                webDriver.getCurrentUrl(),
                containsString(url));
    }

    public MainPage onMainPage() {
        return on(MainPage.class);
    }


    protected <T extends WebPage> T on(Class<T> pageClass) {
        WebPageFactory factory = new WebPageFactory();
        return factory.get(webDriver, pageClass);
    }


}
