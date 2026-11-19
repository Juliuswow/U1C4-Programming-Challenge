public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x.indexOf("Ly") != -1) {
            return true;
            }else if (x.indexOf("ly") != -1){

                return true;
            }else
                return false;
}

    public String conCat(String s1, String s2) {
        if(s1.length()==0 || s2.length()==0){

            return s1 + s2;
        }
        String s2FirstLetter=s2.substring(0,1);


        String s1LastLetter=s1.substring(s1.length()-1);

        if(s2FirstLetter.equals(s1LastLetter)){
            return s1.substring(0,s1.length()-1) + s2; 
        }else{
            return s1 + s2;
        }

    }

    public String withoutX(String s1) {
        String Firstletter=s1.substring(0,1);
        String Lastletter=s1.substring(s1.length()-1);
        if(Firstletter.equals("x") && Lastletter.equals("x")){
            return s1.substring(1,s1.length()-1);
        }
        if(Firstletter.equals("x")){
            return s1.substring(1);
        }
        
        if(Lastletter.equals("x")){
            return s1.substring(0,s1.length()-1);
        }
        return s1;
    }

    public String fizzString(String s1) {
        String Firstletter=s1.substring(0,1);
        String Lastletter=s1.substring(s1.length()-1);
        if(Firstletter.equals("f") && Lastletter.equals("b")){
            return "FizzBuzz";
        }

        if(Firstletter.equals("f")){
            return "Fizz";
        }
        if(Lastletter.equals("b")){

            return "Buzz";
        }
        return s1;

    }

    public String fizzString2(int x) {
        if((x%3)==0 && (x%5)==0){
            return "FizzBuzz";

        }
        if((x%3)==0){
            return "Fizz!";


        }
        if((x%5)==0){
            return "Buzz!";
        }
        return x + "!";
    }

}