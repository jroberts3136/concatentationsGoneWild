package com.company;

public class Main {

    public static void main(String[] args) {
        String t1 = cat(68, 108);
        System.out.println(t1);

        String t2 = cat(35, 59);
        System.out.println(t2);
    }

    public static String cat(int i, int f){
        StringBuffer charCat = new StringBuffer();
        int start;
        int end = f;

        for (start = i; start <= end; start++){
            charCat.append((char)start);
        }
        return charCat.toString();
    }
}
