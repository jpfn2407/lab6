package pt.ual.pp.lab6;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person{
    private String id;
    private String name;
    private int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return getId()
                + "=Person(" + getId()
                + "," + getName()
                + "," + getAge()
                + ")";
    }
}


@SuppressWarnings("ALL")
public class App {
    public static void main( String[] args ) {
        List<Person> people = Arrays.asList(
                new Person("1", "Alice", 28),
                new Person("2", "Trudy", 32),
                new Person("3", "Anna", 24),
                new Person("4", "Bob", 40),
                new Person("5", "James", 18)
        );

        //Task 3 A)

        System.out.println(
                people.stream()
                .filter(person -> person.getAge() > ( (people.stream()
                        .mapToInt(Person::getAge)
                        .sum() ) / people.size() ) )
                .count()
        );

        //Task 3 B)

        System.out.println(
                Math.sqrt(people.stream().mapToDouble(person ->
                                Math.pow(person.getAge() - (people.stream().
                                                mapToInt(Person::getAge)
                                                .sum()
                                                /people.size())
                                        ,2)).sum()
                        /people.size())
        );

        //Task 3 C)

        Map<String, Person> personMap = people.stream().collect(Collectors.toMap(p -> p.getId(), p -> p));
        personMap.values().forEach(System.out::println);
        //personMap.forEach((k,v) -> System.out.println(v));

        /*personHashMap.entrySet().forEach(e -> System.out.println((e.getKey()
                + "=Person(" + e.getValue().getId()
                + "," + e.getValue().getName()
                + "," + e.getValue().getAge()
                + ")")));*/

        /*people.stream().forEach(person -> personHashMap.put(person.getId(), person));*/

        /*for(Map.Entry<String, Person> pessoa : personHashMap.entrySet()){
            Person objPessoa = pessoa.getValue();
            System.out.println(pessoa.getKey()
                    + "=Person(" + objPessoa.getId()
                    + "," + objPessoa.getName()
                    + "," + objPessoa.getAge()
                    + ")");
        }*/



    }
}
