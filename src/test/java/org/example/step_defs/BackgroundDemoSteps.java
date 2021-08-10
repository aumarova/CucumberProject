package org.example.step_defs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundDemoSteps {

    @Given("user is on {string}")
    public void user_is_on(String string) {
        System.out.println("Background step 1");
    }

    @And("user is logged in as {string}")
    public void user_is_logged_in_as(String string) {
        System.out.println("Background step 2");
    }

    @Given("user balance is {int}")
    public void user_balance_is(Integer int1) {
        System.out.println("Check if user has the balance " + int1);

    }

    @When("user deposits {int}")
    public void user_deposits(Integer int1) {
        System.out.println("Action: input deposit amount and click submit button");
    }

    @Then("user balance should be {int}")
    public void user_balance_should_be(Integer int1) {
        System.out.println("Check if user balance increased and equal to " + int1);
    }

    @When("user clicks on transaction")
    public void user_clicks_on_transaction() {

    }

    @Then("user should see all transactions")
    public void user_should_see_all_transactions() {

    }

    @Given("I have ${int} in my account")
    public void i_have_$_in_my_account(Integer int1) {

    }

    @When("I choose to withdraw the fixed amount of ${int} Then I should receive ${int} cash")
    public void i_choose_to_withdraw_the_fixed_amount_of_$_then_i_should_receive_$_cash(Integer int1, Integer int2) {

    }

    @When("I choose to withdraw the fixed amount of ${int} Then I should see an error message")
    public void i_choose_to_withdraw_the_fixed_amount_of_$_then_i_should_see_an_error_message(Integer int1) {

    }

    @When("the balance of my account should be ${int}")
    public void the_balance_of_my_account_should_be(Integer int1) {

    }

    @Given("a User {string} born on August {int}, {int}")
    public void a_user_born_on_august(String string, Integer int1, Integer int2) {

    }
    @Given("a User {string} born on January {int}, {int}")
    public void a_user_born_on_january(String string, Integer int1, Integer int2) {

    }
    @Given("a User {string} born on October {int}, {int}")
    public void a_user_born_on_october(String string, Integer int1, Integer int2) {

    }

}
