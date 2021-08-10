@bookstore @regression
Feature: Book Store

  @ignore
  Scenario: Correct non-zero number of books found by author by list
    Given I have the following books in the store by list
      | title                                | author      |
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
    When I search for books by author "Erik Larson"
    Then I find 2 books

  @smoke
  Scenario: Correct non-zero number of books found by title pattern by list
    Given I have the following books in the store by list
      | title                                | author      |
      | The Devil in the White City          | Erik Larson |
      | The Lion, the Witch and the Wardrobe | C.S. Lewis  |
      | In the Garden of Beasts              | Erik Larson |
      | Beasts                               | John Doe    |
    When I search for books by title pattern "Beast"
    Then I find 2 books