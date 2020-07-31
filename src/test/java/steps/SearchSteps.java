package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.ProductSearchPage;

public class SearchSteps {
    @Given("^I open argos page$")
    public void iOpenArgosPage() {
        ProductSearchPage.openURL();
    }

    @When("^I search for a product (.*)$")
    public void iSearchForAProduct(String productName) {
        ProductSearchPage.searchProduct(productName);
    }

    @And("^I select a random product from the list$")
    public void iSelectARandomProductFromTheList() {
        ProductSearchPage.selectRandomProductInList();
    }

    @And("^I click on Add to cart$")
    public void iClickOnAddToCart() throws InterruptedException {
        ProductSearchPage.clickAddToCart();
    }

    @Then("^I verify the product value with quantity (.*)$")
    public void iVerifyTheProductValueWithQuantity(Integer quantity) {
        ProductSearchPage.verifyProductPriceWithQuantity(quantity);
    }
}
