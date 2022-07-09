public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return "invalid value";
        }

        int hours = minutes / 60;
        int mins = minutes % 60;

        return leadingZero(hours) + "h " + leadingZero(mins) + "m " + leadingZero(seconds) + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "invalid value";
        }

        int min = seconds / 60;
        int secs = seconds % 60;

        return getDurationString(min, secs);
    }

    public static String leadingZero (int num) {

        if (num < 10) {
            return "0" + num;
        }

        return "" + num;
    }
}
