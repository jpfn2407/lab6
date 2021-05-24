package pt.ual.pp.lab6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//class FilterPredicate implements Predicate<String> {
//    @Override
//    public boolean test(final String s) {
//        return s.charAt(0) == 'A';
//    }
//}

public class Task1 {
//
//    public static boolean filter(String s) {
//        return s.charAt(0) == 'A';
//    }

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate){
//        List<String> result = new ArrayList<>();
//        for(final var string : strings) {
////            if(filter(string)) {
//            if(new FilterPredicate().test(string)) {
//                result.add(string);
//            }
//        }
//        return result;
//        return strings.stream().filter((string) -> string.charAt(0) == 'A').collect(Collectors.toList());
        return strings.stream().filter(string -> predicate.test(string)).collect(Collectors.toList());
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
        List<String> filtered = filterStrings(strings,  s -> s.charAt(0) == 'A');
        System.out.println(filtered);

//        filterStrings(strings, string -> string.length() > 10);
//        filterStrings(strings, string -> string.split(" ").length > 8);
    }
}
