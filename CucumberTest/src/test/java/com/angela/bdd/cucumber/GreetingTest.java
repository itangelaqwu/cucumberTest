package test.java.com.angela.bdd.cucumber;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Angela on 5/18/2014.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(features = "CucumberTest/src/test/resources")
public class GreetingTest {
}