# Comparator
Comparator is an interface found in the java.util package that provides a way to compare objects for sorting or ordering purposes. 
This interface is particularly useful when you want to sort objects based on criteria other than their natural ordering, or when 
the natural ordering of the objects is not suitable.
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 35));

        // Sort by name using a Comparator
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });

        System.out.println("Sorted by name:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort by age using a lambda expression
        Collections.sort(people, Comparator.comparingInt(Person::getAge));

        System.out.println("\nSorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
```

# Comparable
Comparable interface is used to define a natural ordering for a class. Classes that implement the Comparable interface can be sorted 
based on this natural ordering. The Comparable interface is found in the java.lang package.

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        // Compare persons based on their age
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", 30));
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 35));

        // Sort the list of people (natural ordering based on age)
        Collections.sort(people);

        System.out.println("Sorted by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
```
