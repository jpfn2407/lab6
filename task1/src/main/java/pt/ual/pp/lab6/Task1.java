package pt.ual.pp.lab6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static boolean filter(String s) {
        return s.charAt(0) == 'A';
    }

    public static List<String> filterStrings(List<String> strings){
        ArrayList<String> result = new ArrayList<>();
//        Iterator<String> iterator = strings.iterator();
//        while(iterator.hasNext()) {
//            String string = iterator.next();
//            if(filter(string)) {
//                result.add(string);
//            }
//        }
        for(final var string : strings) {
            if(filter(string)) {
                result.add(string);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "As the asteroid hurtled toward earth, Becky was upset her dentist appointment had been canceled.",
                "Malls are great places to shop; I can find everything I need under one roof.",
                "The blue parrot drove by the hitchhiking mongoose.",
                "It was a really good Monday for being a Saturday.",
                "The sudden rainstorm washed crocodiles into the ocean."
        );
        System.out.println(strings);

        System.out.println("Filtered:");
        List<String> filtered = filterStrings(strings);
        System.out.println(filtered);
    }
}
