package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsCarTest {

    Execution execution = new Execution();

    @Test
    public void should_return_01N_when_init_N_given_M() {
        //given
        String commend = "M";
        String direction = "N";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"01N");
    }

    @Test
    public void should_return_00W_when_init_N_given_L() {
        //given
        String commend = "L";
        String direction = "N";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"00W");
    }

    @Test
    public void should_return_00E_when_init_N_given_R() {
        //given
        String commend = "R";
        String direction = "N";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"00E");
    }

    @Test
    public void should_return_0_negavite_1_S_when_init_S_given_M() {
        //given
        String commend = "M";
        String direction = "S";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"0-1S");
    }

    @Test
    public void should_return_0_0_E_when_init_S_given_L() {
        //given
        String commend = "L";
        String direction = "S";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"00E");
    }

    @Test
    public void should_return_0_0_W_when_init_S_given_R() {
        //given
        String commend = "R";
        String direction = "S";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"00W");
    }

    @Test
    public void should_return_negative_1_0_W_when_init_W_given_M() {
        //given
        String commend = "M";
        String direction = "W";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"-10W");
    }

    @Test
    public void should_return_0_0_S_when_init_W_given_L() {
        //given
        String commend = "L";
        String direction = "W";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"00S");
    }

    @Test
    public void should_return_0_0_N_when_init_W_given_R() {
        //given
        String commend = "R";
        String direction = "W";
        //when
        String result = execution.move(commend,direction);
        //then
        assertEquals(result,"00N");
    }
}
