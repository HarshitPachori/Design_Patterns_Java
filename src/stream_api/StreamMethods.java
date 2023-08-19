package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
  public static void main(String[] args) {

    // filter (Predicate) -> boolean valued function
    // i -> i > 10

    // map (Function)
    // perform operation on each element

    List<String> names = List.of("Harshit", "Aman", "Bablu", "Shruti", "Ram", "Shyam", "Rahul", "Anubhav", "Ankit");
    List<String> collectedNames = names.stream().filter((i) -> i.startsWith("A")).collect(Collectors.toList());
    System.out.println("Collected Names: " + collectedNames);

    List<Integer> numbers = List.of(23, 4, 2, 5, 7, 4);
    List<Integer> collectedNumbers = numbers.stream().map((i) -> i * i).collect(Collectors.toList());
    System.out.println("Collected Numbers: " + collectedNumbers);

    collectedNumbers.forEach(System.out::println);

    // sorted
    numbers.stream().sorted().forEach(System.out::println);
  }
}
