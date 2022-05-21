public class digitalwatch{
    public static String watch(char[] x) {
        int m = 0, h = 0, d= 1, M = 1, y = 2000;
        String state= "normal";
        String state1 ="time";
        String state2 ="Alarm";
        String state3 ="min";

        for (int i = 0; i <= x.length - 1; i++) {
            switch (state) {
                case "normal" -> {
                    if (x[i] == 'c')
                        state = "update";

                    else if (x[i] == 'b')
                        state = "alarm";

                    else if (x[i] == 'a')
                        if (state1.equals("time"))
                            state1 = "date";
                        else
                            state1 = "time";

                    else return "invalid input";
                }

                case "update" -> {
                    if (x[i] == 'a') {
                        switch (state3) {
                            case "min" -> state3 = "hour";
                            case "hour" -> state3 = "day";
                            case "day" -> state3 = "month";
                            case "month" -> state3 = "year";
                            case "year" -> {
                                state = "normal";
                                state3 = "min";
                            }
                        }
                    } else if (x[i] == 'b') {
                        if (state3.equals("min"))
                            m++;
                        if (m == 61)
                            m = 0;

                        else if (state3.equals("hour"))
                            h++;
                        if (h == 25)
                            h = 0;

                        else if (state3.equals("day"))
                            d++;
                        if (d == 32)
                            d = 1;

                        else if (state3.equals("month"))
                            M++;
                        if (M == 13)
                            M = 1;

                        else if (state3.equals("year"))
                            y++;
                        if (y == 2101)
                            y = 2000;

                    } else if (x[i] == 'd')
                        state = "normal";

                    else return " invalid input";
                }

                case "alarm" -> {
                    if (x[i] == 'a')
                        if (state2.equals("Alarm"))
                            state2 = "chime";
                        else
                            return "invalid input";
                    else if (x[i] == 'd')
                        state = "normal";
                    else return "invalid input";
                }
            }
        }

        return "current date is "+d+"/"+M+"/"+y+" and current time is "+h+":"+m;
    }
    public static void main(String[] args) {
        char[] x = {'a','b','d','c','a','b','b'};
        System.out.println(watch(x));
    }
}

