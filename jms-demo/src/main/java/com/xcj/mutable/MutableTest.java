package com.xcj.mutable;

public class MutableTest
{
    public static void main(String[] args){
        String a = "a";
        MutableTest test = new MutableTest();
        test.setString(a);
        System.out.println(a);
    }
    
    private void setString(String a){
        a="bc";
    }
}
