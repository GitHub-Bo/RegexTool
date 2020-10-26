package regex.series;

import regex.context.DecimalRegexContext;
import regex.context.IntegerRegexContext;
import regex.context.RegexContext;

public enum RegexSeriesEnum {

    //数字的常用正则表达式；
    INTEGER(new IntegerRegexContext()),
    DECIMAL(new DecimalRegexContext());


    //时间戳的常用表达式；



    //特殊字符的常用表达式；



    //自定义的正则表达式；


    private RegexContext value;
    private RegexSeriesEnum(RegexContext value){
        this.value = value;
    }

    public RegexContext getValue() {
        return value;
    }

    public void setValue(RegexContext value) {
        this.value = value;
    }
}
