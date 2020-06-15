package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void should_return_String_given_number() {
        //given
        int num = 1;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"1");
    }
    
}
