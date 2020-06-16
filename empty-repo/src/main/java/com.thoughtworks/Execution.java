package com.thoughtworks;

public class Execution {
    int x = 0;
    int y = 0;
    StringBuilder result = new StringBuilder();

    public String move(String command,String direction) {
        if("N".equals(direction)){
            if("M".equals(command)){
                y +=1;
            }else if("L".equals(command)){
                direction = "W";
            }else{
                direction = "E";
            }
        }
        result.append(x);
        result.append(y);
        result.append(direction);
        return result.toString();
    }


}
