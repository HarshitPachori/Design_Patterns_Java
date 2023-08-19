package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

  public static void main(String[] args) {

    // Stream API - Collection process
    // collection / group of objects / arrays
    // how to make stream ojects below are different methods

    // 1. Blank Stream
    Stream<Object> emptyStream = Stream.empty();
    emptyStream.forEach((i) -> System.out.println(i));

    // 2. Array, Object, Collection
    String names[] = { "Harshit", "Ram", "Shyam", "Sonam", "Radhika" };
    Stream<String> streamNames = Stream.of(names);
    streamNames.forEach((i) -> System.out.println(i));

    // 3. Builder pattern
    Stream<Object> streamBuilder = Stream.builder().build();
    streamBuilder.forEach(System.out::println);

    // 4.
    IntStream stream = Arrays.stream(new int[] { 1, 2, 3, 4 });
    stream.forEach((i) -> System.out.println(i));

    // 5. List,Set
    List<Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(21);
    list2.add(52);
    list2.add(5);
    list2.add(92);
    list2.forEach((i) -> System.out.println(i));
  }
}
