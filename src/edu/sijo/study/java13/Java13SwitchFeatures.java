package edu.sijo.study.java13;

public class Java13SwitchFeatures {
    private static final String SUBSCRIBER = "SUBSCRIBER";
    private static final String FREE_TRIAL = "FREE_TRIAL";

    public static void main(String[] args) {
        System.out.println(switchTestOld("FREE_TRIAL"));
        System.out.println(switchTest("SUBSCRIBER"));
    }
    static String switchTestOld(String status) {
        String value = "";
        switch (status) {
            case SUBSCRIBER:
                value = "SUBSCRIBER";
                break;
            case FREE_TRIAL:
                value = "FREE_TRIAL";
                break;
            default:
                value = "";
        }
        return status;
    }

    static boolean switchTest(String status){
        boolean result = switch (status) {
            case SUBSCRIBER -> true;
            case FREE_TRIAL -> false;
            default -> throw new IllegalArgumentException("something is murky!");
        };
        return result;
    }
}
