package com.ayman;

public class SearchInStrings {

    static boolean search2(String str, char target){

        // if(str.length() == 0) works too
        if(str.isEmpty()) return false;

        for(char i:str.toCharArray()){
            if(i == target) return true;
        }

        return false;
    }
    static boolean search(String str, char target){
        // if(str.length() == 0) works too
        if(str.isEmpty()) return false;

        for (int i = 0; i < str.length(); i++) {

            if(target == str.charAt(i)) return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String name = "Ayman";
        char target = 'e';
        System.out.println(name.toCharArray());
        System.out.println(search2(name,target));
    }



}
