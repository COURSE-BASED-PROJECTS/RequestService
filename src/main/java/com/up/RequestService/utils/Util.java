package com.up.RequestService.utils;

public class Util {
    public static String timeConverter(Long rawSeconds) {
        long seconds = rawSeconds % 60;
        long hours = rawSeconds / 60;
        long minutes = hours % 60;
        hours = hours / 60;

        String timeDuring = "";
        if (hours != 0) {
            timeDuring += hours + " giờ ";
        }
        if (minutes != 0) {
            timeDuring += minutes + " phút ";
        }
        timeDuring += seconds + " giây";

        return timeDuring;
    }
}
