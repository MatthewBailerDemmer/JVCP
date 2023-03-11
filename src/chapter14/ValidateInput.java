package chapter14;

public class ValidateInput {
    public static boolean validateFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }
    public static boolean validateAddress(String adress){
        return adress.matches(
                "\\d+\\s+([a-zA-Z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+ |[a-zA-z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateZip(String zip){
        return zip.matches("\\s{5}");
    }
    public static boolean validatePhone(String phone){
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}