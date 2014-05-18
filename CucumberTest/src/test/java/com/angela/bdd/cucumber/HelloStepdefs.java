package test.java.com.angela.bdd.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.com.angela.bdd.cucumber.Hello;

import static org.junit.Assert.assertEquals;

/**
 * Created by Angela on 5/18/2014.
 */
public class HelloStepdefs {
    private Hello hello;
    private String hi;

    @Given("^I have a greeting application with \"([^\"]*)\"$")
    public void I_have_a_greeting_application_with(String arg1) {
        // Express the Regexp above with the code you wish you had
        hello = new Hello(arg1);
    }

    @When("^I ask it to say hi$")
    public void I_ask_it_to_say_hi() {
        // Express the Regexp above with the code you wish you had
        hi = hello.sayHi();
    }

    @Then("^I receive \"([^\"]*)\"$")
    public void I_receive(String arg1) {
        // Express the Regexp above with the code you wish you had
        assertEquals(arg1, hi);
    }

}

