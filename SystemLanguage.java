import java.util.Locale;

public class SystemLanguage {
    public static void main(String[] args){
        Locale localeSystem = Locale.getDefault();

        String language = localeSystem.getLanguage();
        String country = localeSystem.getCountry();
        String name = localeSystem.getDisplayName();

        System.out.println("The system language is: " + language);
        System.out.println("The system country is: " + country);
        System.out.println("The system name is: " + name);
    }
}