package edu.sijo.study.java14;

public class Java14SwitchFeatures {
    private static final String SUBSCRIBER = "SUBSCRIBER";
    private static final String FREE_TRIAL = "FREE_TRIAL";
    private static final String MONDAY = "MONDAY";
    private static final String FRIDAY = "FRIDAY";
    private static final String TUESDAY = "TUESDAY";
    private static final String SUNDAY = "SUNDAY";

    public static void main(String[] args) {
        System.out.println(switchDay("MONDAY"));
    }

    static int switchDay(String day){
        int result = 0;
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> result = 6;
            case TUESDAY                -> result = 7;
            default      -> {
                String s = day.toString();
                result = s.length();
                yield result;
            }
        };
        return result;
    }
}
