## Constructor chaining
### Using `this()` to Call Another Constructor in the Same Class:
Within a class, one constructor can call another constructor using the `this()` keyword followed by arguments (if any).
This must be the first statement in the constructor body.
It allows for different constructors within the same class to perform common initialization logic.
Example:
```java
class MyClass {
    private int x;
    private int y;

    // Constructor with parameters
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor overloading with default values
    public MyClass() {
        this(0, 0); // Calls the parameterized constructor
    }
}
```
### Using `super()` to Call a Constructor in the Superclass:
Subclass constructors can call constructors from their superclass using the super() keyword.
This must be the first statement in the constructor body.
It allows subclass constructors to initialize inherited members or invoke superclass-specific initialization logic.
Example:

```java
Copy code
class Parent {
    private int x;

    // Superclass constructor
    public Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    private int y;

    // Subclass constructor
    public Child(int x, int y) {
        super(x); // Calls the superclass constructor
        this.y = y;
    }
}
```
### Chaining Constructors:
Constructors can be chained by combining this() and super() calls.
This allows for complex initialization scenarios where both superclass and subclass constructors are involved.
Example:

```java
Copy code
class Parent {
    private int x;

    public Parent(int x) {
        this.x = x;
    }
}

class Child extends Parent {
    private int y;

    public Child() {
        this(0); // Calls Child(int) constructor
    }

    public Child(int x) {
        super(x); // Calls Parent(int) constructor
        this.y = 0; // Additional initialization for Child
    }
}
```
Constructor chaining is a powerful feature in Java that promotes code reusability and maintainability by allowing constructors to delegate initialization tasks to each other within the same class hierarchy.
