package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
  public static void main(String[] args) {
    System.out.println("hello");
    // Q 1. Create a list and filter all even numbers from the list
    // List.of() it makes unmodifiable list (in mutable)
    List<Integer> list = List.of(2, 4, 50, 21, 22, 67);
    System.out.println(list);

    List<Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(21);
    list2.add(52);
    list2.add(5);
    list2.add(92);

    // without stream
    List<Integer> listEven = new ArrayList<>();
    for (int i : list) {
      if (i % 2 == 0)
        listEven.add(i);
    }
    System.out.println(listEven);

    // using stream api
    // predicate is boolean valued fucntion
    List<Integer> collectedList = list.stream().filter((i) -> i % 2 == 0).collect(Collectors.toList());
    System.out.println(collectedList);

    List<Integer> collectedList2 = list2.stream().filter((i) -> i > 50).collect(Collectors.toList());
    System.out.println(collectedList2);
  }
}
