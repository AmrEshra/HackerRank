
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_Test {
	
    public static void main(String[] args) {
        
        Regex_Test tester = new Regex_Test();
        tester.checker("[(ac)*(ca)*]|[(bd)*(db)*]");
    
    }
    
    public void checker(String Regex_Pattern){
        
//        String Test_String = "acdbddbbbbaaac";
    	String Test_String = "acacca";
        Pattern p = Pattern.compile(Regex_Pattern);
        Matcher m = p.matcher(Test_String);
        System.out.println(m.find());
    }  

}



 
    

