public class StringMethods {
    public static void main(String[] args){
        String name = "Infinix Note 50S 5G";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf(0));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.replace("I","i"));
    }
}