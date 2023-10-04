Feature: Google search request

  @Search
  Scenario: Open google and do search
    Given Open link "https://ya.ru/"
    * Wait 2 sec
    * Input search request "hello"
    * Wait 2 sec
    * Press Enter button
    * Wait 5 sec