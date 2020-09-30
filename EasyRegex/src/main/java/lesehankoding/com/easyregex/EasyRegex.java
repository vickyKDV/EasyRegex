package lesehankoding.com.easyregex;

import android.text.InputFilter;
import android.widget.EditText;
public class EasyRegex {

        public enum regStyle {
            charPattern,
            charNoWhiteSpacePattern,
            numberPattern,
            emailPattern
        }


        public static String getRegexType(regStyle regex) {
            String style = "";
            switch (regex) {
                //Valid Char Only
                case charPattern :
                    style = "[a-zA-Z ]+";
                    break;
                //Valid Char Only
                case charNoWhiteSpacePattern:
                    style = "[a-zA-Z]+";
                    break;
                //Valid Number Only
                case numberPattern :
                    style = "[0-9]+";
                    break;
                //Valid Email Format
                case emailPattern :
                    style = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
                    break;
            }
            return style;
        }

        public static void setEasyCharRegex(EditText editText){
            editText.setFilters(new InputFilter[] {(cs, start, end, spanned, dStart, dEnd) -> {
                if(cs.equals("")){ // for backspace
                    return cs;
                }
                if(cs.toString().matches("[a-zA-Z ]+")){
                    return cs;
                }
                return "";
            }});
        }

        public static void setEasyRegex(EditText editText,regStyle regex){
            editText.setFilters(new InputFilter[] {(cs, start, end, spanned, dStart, dEnd) -> {
                if(cs.equals("")){ // for backspace
                    return cs;
                }
                if(cs.toString().matches(getRegexType(regex))){
                    return cs;
                }
                return "";
            }});
        }

        public static void setEasyRegex(EditText editText,String customRegex){
            editText.setFilters(new InputFilter[] {(cs, start, end, spanned, dStart, dEnd) -> {
                if(cs.equals("")){ // for backspace
                    return cs;
                }
                if(cs.toString().matches(customRegex)){
                    return cs;
                }
                return "";
            }});
        }

        public static void setEasyNumberRegex(EditText editText){
            editText.setFilters(new InputFilter[] {(cs, start, end, spanned, dStart, dEnd) -> {
                if(cs.equals("")){ // for backspace
                    return cs;
                }
                if(cs.toString().matches("[0-9]+")){
                    return cs;
                }
                return "";
            }});
        }

}
