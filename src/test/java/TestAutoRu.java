import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;


public class TestAutoRu {


    private Steps steps;

    @Rule
    public WdRule driverRule =
            new WdRule();

    @Before
    public void initSteps() {
        steps = new Steps(driverRule.driver());
    }

    @Test
    public void test() throws InterruptedException {
        steps.open("https://auto.ru/cars/all/");

        steps.onMainPage().AllParams().click();

        steps.onMainPage().HasVideoCheckbox().click();

        steps.onMainPage().CompanyBtn().click();

        steps.onMainPage().MarkChoose().click();

        steps.onMainPage().markNissanInPopup().click();

        steps.onMainPage().PriceInput().click();

        steps.onMainPage().PriceInput().sendKeys("1000000");

        steps.onMainPage().ShowBtn().click();

        Thread.sleep(3000);

        steps.shouldSeeUrl("https://auto.ru/moskva/cars/nissan/all/?seller_group=COMMERCIAL&has_video=true&sort=fresh_relevance_1-desc&price_from=1000000");


    }


}
