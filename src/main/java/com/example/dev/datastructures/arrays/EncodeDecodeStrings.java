package com.example.dev.datastructures.arrays;

import java.util.Arrays;
import java.util.List;

public class EncodeDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String str : strs) {
            builder.append(str.length()).append("/").append(str);
        }
        return builder.toString();
    }

    public List<String> decode(String str) {
        str = str.startsWith("/") ? str.substring(1) : str;
        List<String> result = new java.util.ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int slash = str.indexOf("/", i);
            int size = Integer.parseInt(str.substring(i, slash));
            result.add(str.substring(slash + 1, slash + size + 1));
            i = slash + size + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        EncodeDecodeStrings encodeDecodeStrings = new EncodeDecodeStrings();
        String encoded = encodeDecodeStrings.encode(List.of("neet","code","love","you"));
        System.out.println(encoded);
        System.out.println(encodeDecodeStrings.decode(encoded));

    }

    class Solution {
        public String encode(List<String> strs) {
            StringBuilder strBui=new StringBuilder();
            for(String s1:strs){
                strBui.append(s1+"/");
            }
            System.out.println(strBui.toString());
            return strBui.toString();
        }

        public List<String> decode(String str) {

            if (str.length() < 2) {
                return List.of("");
            }
            return Arrays.asList(str.split("/"));
        }
    }

}
