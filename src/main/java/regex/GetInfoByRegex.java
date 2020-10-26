package regex;


import regex.series.RegexSeriesEnum;
import java.util.List;
import java.util.regex.Pattern;

public class GetInfoByRegex {

    public static boolean judgeRegex(String msg, RegexSeriesEnum regexSeriesEnum){
        String finalRegex = ".*"+regexSeriesEnum.getValue().returnRegex()+".*";
        boolean matches = Pattern.matches(finalRegex, msg);
        return matches;
    }

    public static Object getFirstInfoFromRegex(String msg, RegexSeriesEnum regexSeriesEnum){



        return null;
    }


    public static List<Object> getAllInfoFromRegex(String msg, RegexSeriesEnum regexSeriesEnum){

        return null;
    }


}
