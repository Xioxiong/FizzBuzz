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
    @Test
    public void should_return_Whizz_given_7(){
        //given
        int num =7;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"Whizz");
    }
    @Test
    public void should_return_FizzBuzz_given_15_Buzz(){
        //given
        int num =15;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"FizzBuzz");
    }

    @Test
    public void should_return_Fizz_given_13_Buzz(){
        //given
        int num =13;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"Fizz");
    }
    @Test
    public void should_return_Fizz_given_21_FizzWhizz(){
        //given
        int num =21;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"FizzWhizz");
    }

    @Test
    public void should_return_Fizz_given_35(){
        //given
        int num =35;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"Fizz");
    }

    @Test
    public void should_return_BuzzWhizz_given_70(){
        //given
        int num =70;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_given_105(){
        //given
        int num =105;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"FizzBuzzWhizz");
        assert (result.equals("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_Fizz_given_30(){
        //given
        int num =30;
        //when
        String result = fizzBuzz.say(num);
        //then
        assertEquals(result,"Fizz");
        assert (result.equals("Fizz"));
    }
}
