package edu.sbcc.cs105;

public class IntegerSign {

    public static String determineSign(int integer) {
        String sign;
        
    	if(integer == 0)sign = "zero";
    	else if(integer < 0)sign = "negative";
    	else sign = "positive";
    	
    	return sign;
    }
    
    public static void main(String[] args) {
        // Put code here to get input from user, then call determineSign
    }

}