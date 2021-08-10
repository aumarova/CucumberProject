package org.example.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CardValidationSteps {

    @Given("Not sixteen digit card number")
    public void not_sixteen_digit_card_number() {
        // Arrange
        System.out.println("User has 1234 5678 9123 card number");
    }

    @When("user submits the request")
    public void user_submits_the_request() {
        // Act
        System.out.println("User inputs the card number and submits");
    }

    @Then("the message advising to check the card number will be provided")
    public void the_message_advising_to_check_the_card_number_will_be_provided() {
        // Assert
        System.out.println("Expected message is displayed");
    }

}
