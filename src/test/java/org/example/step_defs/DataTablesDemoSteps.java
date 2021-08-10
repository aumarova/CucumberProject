package org.example.step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class DataTablesDemoSteps {

    @Given("these Users:")
    public void these_users(DataTable dataTable) {

        System.out.printf("Print out the raw datatable: \n%s", dataTable);

        System.out.println("Conversion to the List of lists:");
        List<List<String>> listOfLists = dataTable.asLists();
        System.out.println(listOfLists + "\n");

        System.out.println("Conversion to the List of lists  with providing a type:");
        List<List<Object>> listOfLists2 = dataTable.asLists(String.class);
        System.out.println(listOfLists2 + "\n");

        System.out.println("Conversion to the List of Maps:");
        List<Map<String, String>> listOfMaps = dataTable.asMaps();
        System.out.println(listOfMaps + "\n");

        System.out.println("Conversion to the Map:");
        Map<String, String> map = dataTable.asMap(String.class, String.class);
        System.out.println(map + "\n");

        System.out.println("Transposed DataTable: \n");
        DataTable transposedDataTable = dataTable.transpose();
        System.out.println(transposedDataTable);

    }

    @When("registered on the sign up page")
    public void registered_on_the_sign_up_page() {

    }

    @Then("saved in database")
    public void saved_in_database() {

    }

}
