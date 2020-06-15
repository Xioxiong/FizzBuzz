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
    @Test
    public void should_return_Fizz_given_3(){
        //given
        int num =3;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"Fizz");
    }

    @Test
    public void should_return_Buzz_given_5_(){
        //given
        int num =5;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"Buzz");
    }
}
