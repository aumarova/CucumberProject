package org.example.step_defs;

import com.google.common.flogger.FluentLogger;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.models.Book;
import org.example.models.BookStore;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookStoreSteps {

    private static final FluentLogger logger = FluentLogger.forEnclosingClass();
    private static BookStore bookStore = new BookStore();

    private static int actualNumberOfBooks;

    @After(value="@bookstore")
    public void afterScenario() {
        // clean up the data
        bookStore = new BookStore();
    }

    @Given("I have the following books in the store by list")
    public void i_have_the_following_books_in_the_store_by_list(List<Book> bookList) {
        // Arrange
        bookStore.addAllBooks(bookList);
        logger.atInfo().log("addAllBooks: %s", bookList);
    }

    @When("I search for books by author {string}")
    public void i_search_for_books_by_author(String authorName) {
        // Act
        final List<Book> searchResult = bookStore.booksByAuthor(authorName);
        logger.atInfo().log("booksByAuthor: %s", authorName);
        actualNumberOfBooks = searchResult.size();
    }

    @Then("I find {int} books")
    public void i_find_books(int expectedNumberOfBooks) {
        // Assert
        logger.atInfo().log("expected result: %s", expectedNumberOfBooks);
        assertEquals(actualNumberOfBooks, expectedNumberOfBooks);
    }

    @When("I search for books by title pattern {string}")
    public void iSearchForBooksByTitlePattern(String titlePattern) {
        // Act
        final List<Book> searchResult = bookStore.booksByNamePattern(titlePattern);
        logger.atInfo().log("booksByNamePattern: %s", titlePattern);
        actualNumberOfBooks = searchResult.size();
    }
}
