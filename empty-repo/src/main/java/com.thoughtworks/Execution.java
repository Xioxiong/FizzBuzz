package com.thoughtworks;

import java.util.List;

public class Execution {

    public String move(String command,String direction,int ax,int ay) {
        int x = ax;
        int y = ay;
        StringBuilder result = new StringBuilder();
        String ort = direction;

        if("N".equals(direction)){
            if("M".equals(command)){
                y +=1;
            }else if("L".equals(command)){
                ort = "W";
            }else{
                ort = "E";
            }
        }
        if("S".equals(direction)){
            if("M".equals(command)){
                y -= 1;
            }else if("L".equals(command)){
                ort = "E";
            }else {
                ort = "W";
            }
        }
        if("W".equals(direction)){
            if ("M".equals(command)) {
                x -=1;
            }else if("L".equals(command)){
                ort = "S";
            }else {
                ort = "N";
            }
        }
        if("E".equals(direction)){
            if ("M".equals(command)) {
                x +=1;
            }else if("L".equals(command)){
                ort = "N";
            }else {
                ort = "S";
            }
        }
        result.append(x);
        result.append(",");
        result.append(y);
        result.append(",");
        result.append(ort);
        return result.toString();
    }
    public String mutilConnand(List<String> list, String direction){
        String result = "";
        int x = 0;
        int y = 0;
        String ort = direction;
        for(String i:list){
           result= move(i,ort,x,y);
           String a[] = result.split(",");
           x = Integer.valueOf(a[0]);
           y = Integer.valueOf(a[1]);
           ort = a[2];
        }
        return result;
    }
}
