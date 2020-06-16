package com.thoughtworks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class MarsCarTest {

    Logger logger = Logger.getLogger(MarsCarTest.class.getName());
    Execution execution = new Execution();

    @Test
    public void should_return_01N_when_init_N_given_M() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("M");
        String direction = "N";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,1,N");
    }

    @Test
    public void should_return_00W_when_init_N_given_L() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("L");
        String direction = "N";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,W");
    }

    @Test
    public void should_return_00E_when_init_N_given_R() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("R");
        String direction = "N";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,E");
    }

    @Test
    public void should_return_0_negavite_1_S_when_init_S_given_M() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("M");
        String direction = "S";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,-1,S");
    }

    @Test
    public void should_return_0_0_E_when_init_S_given_L() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("L");
        String direction = "S";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,E");
    }

    @Test
    public void should_return_0_0_W_when_init_S_given_R() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("R");
        String direction = "S";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,W");
    }

    @Test
    public void should_return_negative_1_0_W_when_init_W_given_M() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("M");
        String direction = "W";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"-1,0,W");
    }

    @Test
    public void should_return_0_0_S_when_init_W_given_L() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("L");
        String direction = "W";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,S");
    }

    @Test
    public void should_return_0_0_N_when_init_W_given_R() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("R");
        String direction = "W";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,N");
    }

    @Test
    public void should_return_1_0_E_when_init_E_given_M() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("M");
        String direction = "E";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"1,0,E");
    }

    @Test
    public void should_return_0_0_N_when_init_E_given_L() {
        //given
        String commend = "L";
         List<String> list = new ArrayList<String>();
         list.add("L");
        String direction = "E";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,N");
    }

    @Test
    public void should_return_0_0_S_when_init_E_given_R() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("R");
        String direction = "E";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"0,0,S");
    }
    @Test
    public void should_return_position_given_mutliCommand() {
        //given
        List<String> list = new ArrayList<String>();
        list.add("M");
        list.add("L");
        list.add("M");
        list.add("R");
        list.add("M");
        String direction = "N";
        //when
        String result = execution.mutilConnand(list,direction);
        //then
        assertEquals(result,"-1,2,N");
    }
}
