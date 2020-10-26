package series;

import org.junit.Test;
import regex.GetInfoByRegex;
import regex.series.RegexSeriesEnum;

public class GetInfoByRegexTest {

    @Test
    public void judgeIntegerRegex(){
        String randomStr = "1231342Dfashgf_adsgfa";
        boolean b = GetInfoByRegex.judgeRegex(randomStr,RegexSeriesEnum.INTEGER);
        System.out.println(b);
    }


}
