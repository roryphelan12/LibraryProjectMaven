package softwareinstitute.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareinstitute.DVD;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DVDStep {

        private String name;
        private String actualAnswer;

    DVD DVD1 = new DVD("Christopher Nolan", 2021, "Tennet");
    DVD DVD2 = new DVD("Christopher Nolan", 2021, "Mars");
        @Given("The DVD is called Tennet")
        public void the_dvd_is_called_tennet() {
            name = DVD1.getName();

        }
    @Given("The DVD is called Mars")
    public void the_dvd_is_called_Mars() {
        name = "Mars";

    }

        @When("I ask whether name is Tennet")
        public void i_ask_whether_name_is_tennet() {
            actualAnswer = IsTheNameTennet.isItTennet(name);
        }

        @Then("I should be told {string}")
        public void i_should_be_told_yes(String expectedAnswer) {
            assertEquals(expectedAnswer,actualAnswer,"The names don't match");
        }




    }




