package com.interview.questionsolution;

public class Test {
    public static void main(String[] args) {

        String extractedX = getMiddleGtid("0-4207-185801940,2-4207-589,2-4207-789");

        System.out.println(extractedX);
    }
    public static String getMiddleGtid(String gtid) {
        String[] parts = gtid.split(",");
        for (String part : parts) {
            String[] subParts = part.split("-");
            if (subParts.length >= 2) {
                return subParts[1];
            }
        }
        return null;
    }
}
