import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.annotation.FindBy;
import io.qameta.htmlelements.element.HtmlElement;

public interface MainPage extends WebPage {

    @FindBy("//span[contains(@class, 'Link ListingCarsFilters-module__actionCollapse')]")
    HtmlElement AllParams();

    @FindBy("//span[contains(@class, 'Button__text')][.='Компания']/parent::span/parent::button")
    HtmlElement CompanyBtn();

    @FindBy("//input[@name='has_video']")
    HtmlElement HasVideoCheckbox();

    @FindBy("//input[contains(@class, 'TextInput__control')][@name='price_from']")
    HtmlElement PriceInput();

    @FindBy("//div[contains(@class, 'MMMFilter-module__MMMFilter')]" +
            "/child::div[contains(@class, 'MMMFilter-module__MMMFilter__item')][1]")
    HtmlElement MarkChoose();

    @FindBy("//div[contains(@class,'ListingPopularMMM-module__container PageListing-module__popularMMM')]" +
            "//a[contains(., 'Nissan')]")
    HtmlElement markNissanInPopup();

    @FindBy("//span[contains(@class, 'ButtonWithLoader__content')][contains(.,'Показать')]/parent::span/parent::button")
    HtmlElement ShowBtn();

}
