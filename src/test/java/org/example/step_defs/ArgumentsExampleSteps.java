package org.example.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArgumentsExampleSteps {

    @Given("I have {string} dollars in my account")
    public void i_have_dollars_in_my_account(String amount) {

        Integer amountNum = Integer.valueOf(amount);

        String text = String.format("I have %s dollars", amountNum);
        System.out.println(text);
    }

    @When("^I withdraw \"([^\"]*)\" dollars$")
    public void i_withdraw_dollars(String withdrawAmount) {
        String text = String.format("I try to withdraw %s dollars", withdrawAmount);
        System.out.println(text);
    }

    @Then("I get system message {string}")
    public void i_get_system_message(String errorMessage) {
        String text = String.format("I get the following message: %s", errorMessage);
        System.out.println(text);
    }

    @Given("I have {double} dollars in my account")
    public void i_have_dollars_in_my_account(Double accountBalance) {
        System.out.println("I have " + accountBalance + " dollars in my account");
    }

    @When("I withdraw {int} dollars")
    public void i_withdraw_dollars(Integer withdrawAmount) {
        System.out.println("I withdraw " + withdrawAmount + " dollars");
    }

    @Then("I get the money withdrawn")
    public void i_get_the_money_withdrawn() {
        System.out.println("I get the money cashed out");
    }

    @Then("the account balance should not be {double}")
    public void the_account_balance_should_not_be(Double accountBalance) {
        System.out.println(accountBalance + "$ is not on my balance anymore :(((");
    }
}
