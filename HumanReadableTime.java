public class HumanReadableTime {
    public static String makeReadable(int seconds){
        int minutes = seconds/60;
        seconds = seconds%60;
        int hours = minutes/60;
        minutes = minutes%60;
        return (hours<10 ? "0"+hours:hours) + ":" + (minutes<10 ? "0"+minutes:minutes) + ":" + (seconds<10 ? "0"+seconds:seconds);
    }
    public static void main(String[] args) {
        System.out.println(HumanReadableTime.makeReadable(90));
    }
    /*
    if(seconds < 60) return "00:00:"+seconds;
        else if(seconds < 3600){
            return "00:" + minutes + ":" + seconds%60;
        }
    */
}
