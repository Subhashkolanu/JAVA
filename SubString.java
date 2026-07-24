public class SubString {
    public static void main(String[] args){
        String s1 = "Krishna Yadav";
        String s2 = "Vijay Reddy";
        String s3 = "Charan Naidu";
        String s4 = "Narayana Sarma";
        String first_name = s1.SubString(0,s1.indexOf("s"));
        System.out.println("First name : "+s1.SubString(0,s1.indexOf(" ")));

    }
}
