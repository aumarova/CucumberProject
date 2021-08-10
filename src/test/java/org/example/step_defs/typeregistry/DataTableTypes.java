package org.example.step_defs.typeregistry;

import io.cucumber.java.DataTableType;
import org.example.models.Book;

import java.util.Map;

public class DataTableTypes {

    /* DataTable to Object Conversion Handlers */

    // https://cucumber.io/docs/cucumber/configuration/

    @DataTableType
    public Book authorEntry(Map<String, String> entry) {
        return new Book(
                entry.get("title"),
                entry.get("author"));
    }



}
