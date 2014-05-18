package main.java.com.angela.bdd.cucumber;

/**
 * Created by Angela on 5/18/2014.
 */
public class Hello{

    private final String greeting;

    public Hello(String greeting) {
        this.greeting=greeting;
    }

    public String sayHi(){
        return greeting + " World";
    }

}