package softwareinstitute.StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DVDStep {

        private String name;
        private String actualAnswer;

        @Given("The DVD is called Tennet")
        public void the_dvd_is_called_tennet() {
            name = "Tennet";

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

