package softwareinstitute.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareinstitute.Book;
import softwareinstitute.DVD;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookIndexStep {

    Book Book = new Book(123,4,"tolkien");

    private int index;
    private int actualAnswer;


    @Given("The book has an index of 123")
    public void Book_has_index_123() {
        index = Book.getIndex();
        
    }

    @When("I ask whether the book has an index 123")
    public void i_Ask_Whether_TheBook_Has_An_Index_123() {
        actualAnswer = IsTheBookIndexGiven.isIndexGiven(index);
    }

    @Then("I should be told {string}")
    public void i_should_be_told_yes(int expectedAnswer) {
        assertEquals(expectedAnswer,actualAnswer,"The names don't match");
    }


    @When("I ask whether the book has an index of {int}")
    public void iAskWhetherTheBookHasAnIndexOf(int arg0) {
    }
}
