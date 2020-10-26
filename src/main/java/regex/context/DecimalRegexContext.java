package regex.context;

public class DecimalRegexContext implements RegexContext {

    public String returnRegex() {
        return "\\d+.\\d+";
    }
}
