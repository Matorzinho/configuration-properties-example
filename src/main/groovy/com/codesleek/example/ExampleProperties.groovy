package com.codesleek.example

import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.NotBlank
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import javax.validation.Valid
import javax.validation.constraints.Max
import javax.validation.constraints.Min

/**
 * Created by douglascarvalho on 08/06/2017.
 */
@Component
@ConfigurationProperties
class ExampleProperties {

    @Length(min = 5, max = 10)
    private String foo

    @Min(10L)
    @Max(20L)
    private int bar

    @Valid
    private final Test test = new Test()

    String getFoo() {
        return foo
    }

    int getBar() {
        return bar
    }

    void setFoo(String foo) {
        this.foo = foo
    }

    void setBar(int bar) {
        this.bar = bar
    }

    Test getTest() {
        return test
    }

    static class Test {
        @NotBlank
        private String greeting

        String getGreeting() {
            return greeting
        }

        void setGreeting(String greeting) {
            this.greeting = greeting
        }
    }


}
