package pt.ual.pp.lab6;

import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class StudentRecord {
    private final String number;
    private final String name;
    private final int grade;

    public StudentRecord(final String number, final String name, final int grade) {
        this.number = number;
        this.name = name;
        this.grade = grade;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return getNumber() + " " + getGrade();
    }
}

class PrintConsumer implements Consumer<StudentRecord> {
    @Override
    public void accept(final StudentRecord studentRecord) {
        System.out.println(studentRecord.getNumber() + " " + studentRecord.getGrade());
    }
}

class PrintPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        return i < 10;
    }
}

public class App {
    public static void main(String[] args) {
        List<StudentRecord> studentRecords = Arrays.asList(
                new StudentRecord("1", "Alice", 14),
                new StudentRecord("2", "Trudy", 17),
                new StudentRecord("3", "Bob", 8),
                new StudentRecord("4", "Anna", 12),
                new StudentRecord("5", "James", 15)
        );


        //Task 2 C)

        /*Iterator<StudentRecord> iterator = studentRecords.iterator();
        while(iterator.hasNext()){
            StudentRecord studentRecord = iterator.next();
            new PrintConsumer().accept(studentRecord);
        }*/
        
        //studentRecords.forEach(s -> System.out.println(s.getNumber() + " " + s.getGrade()));

        studentRecords.forEach(System.out::println);


        //Task 2 D)

        for(StudentRecord student: studentRecords){
            if(new PrintPredicate().test(student.getGrade())){
                System.out.println(student.getNumber() + " " + student.getName());
            }
        }


    }
}








