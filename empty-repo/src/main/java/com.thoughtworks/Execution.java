package com.thoughtworks;

public class Execution {


    public String move(String command,String direction) {
        int x = 0;
        int y = 0;
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
        result.append(y);
        result.append(ort);
        return result.toString();
    }


}
