public class Problem8 {
    // s - string
    // firstChar - first symbol of string
    // isDigit - checks is the first symbol is digit
    // restDigits - checks is string is digit starting from the second symbol till the end
    // return - returns boolean value
    public static boolean isAllDigits(String s){
        if (s.isEmpty()){
            return true;
        }else {
            char firstChar = s.charAt(0);
            boolean isDigit = Character.isDigit(firstChar);
            boolean restDigits = isAllDigits(s.substring(1));
            return isDigit && restDigits;
        }
    }
}
