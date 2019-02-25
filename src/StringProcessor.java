public class StringProcessor {
    private String string;

    StringProcessor() {
        string = "";
    }

    StringProcessor(String s) {
        string = s;
    }

    public void setString(String s) { string = s; }
    public String getString() { return string; }

    public int wordCount() {
        return 0;
    }

    public int uppercaseCount() {
        return 0;
    }

    public int digitCount() {
        return 0;
    }

    public int digitWordCount() {
        return 0;
    }

    public String getNoSpaceString() {
        return "";
    }

    public String getNoVowelString() {
        return "";
    }

    public String getNoDigitWordString() {
        return "";
    }
}
