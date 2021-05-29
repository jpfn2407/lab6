package pt.ual.pp.lab6;


import java.util.Arrays;
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

    public static List<String> filterStrings(List<String> strings, Predicate<String> predicate) {
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
//        System.out.println(strings);
//
//        System.out.println("Filtered:");
//        filterStrings(strings, s -> s.charAt(0) == 'A').forEach(System.out::println);
//        filterStrings(strings, string -> string.length() > 10).forEach(System.out::println);
//        filterStrings(strings, string -> string.split(" ").length > 8).forEach(System.out::println);

//        *Strings* com todas as palavras com 3 ou mais letras;
//        filterStrings(strings,
//                string -> filterStrings(Arrays.asList(string.split(" ")), s -> s.length() < 3).size() == 0)
//                .forEach(System.out::println);
//        *Strings* com um número par de letras `w` minúsculas.
        filterStrings(strings, string ->
                (string.length() - string.replace("w", "").length()) % 2 == 0 &&
                (string.length() - string.replace("w", "").length()) != 0)
                .forEach(System.out::println);

//        int countWs = 0;
//        for(final var string : strings) {
//            for(final var word : string.split(" ")) {
//                if(word.indexOf('w') != -1) {
//                    countWs++;
//                }
//            }
//        }
//        return countWs != 0 && countWs % 2 == 0;
    }
}
