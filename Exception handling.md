
## 1. Checked vs Unchecked Exceptions
   - **Checked Exceptions:**
     - Checked exceptions are subclasses of `Exception` (excluding `RuntimeException` and its subclasses).
     - They must be either caught using a `try-catch` block or declared in the method's `throws` clause.
     - *Example:* `IOException`, `SQLException`.
   
   - **Unchecked Exceptions:**
     - Unchecked exceptions are subclasses of `RuntimeException`.
     - They do not require explicit handling (caught or declared).
     - *Examples:* `NullPointerException`, `ArrayIndexOutOfBoundsException`.

## 2. Purpose of the `finally` Block
   - The `finally` block ensures that certain code is executed, whether an exception occurs or not.
   - Commonly used for cleanup operations (e.g., closing resources like files or database connections).
   - It guarantees the execution of critical code even if an exception is thrown.

## 3. Custom Exceptions in Java
   - Custom exceptions are user-defined exception classes that extend `Exception` or its subclasses.
   - They are useful when the standard Java exceptions do not capture the specific nature of a problem.
   - *Example:*
     ```java
     class CustomException extends Exception {
         CustomException(String message) {
             super(message);
         }
     }
     ```

## 4. `throws` Clause vs `throw` Keyword
   - The `throws` clause is used in method declarations to indicate the exceptions that might be thrown.
   - *Example:* `void myMethod() throws CustomException { }`
   - The `throw` keyword is used to explicitly throw an exception within the code.
   - *Example:* `throw new CustomException("This is a custom exception");`

## 5. `try-with-resources` Statement
   - `try-with-resources` simplifies resource management by automatically closing resources (like `AutoCloseable` objects) after the try block.
   - *Example:*
     ```java
     try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
         // Code to read from the file
     } catch (IOException e) {
         // Handle the exception
     }
     ```

## 6. `Error` Class vs `Exception` Class
   - `Error` is used to represent serious, unrecoverable errors that are typically system-related.
   - *Example:* `OutOfMemoryError`, `StackOverflowError`.
   - `Exception` is used for less severe, recoverable issues that the program might encounter during execution.

## 7. `getCause()` Method
   - The `getCause()` method in the `Throwable` class returns the cause of the exception or `null` if the cause is nonexistent or unknown.
   - Useful for diagnosing the root cause of an exception when exceptions are chained.
   - *Example:*
     ```java
     try {
         // Some code that may throw an exception
     } catch (Exception e) {
         Throwable cause = e.getCause();
         // Further analysis or handling based on the cause
     }
     ```

## 8. Multiple Catch Blocks
   - Multiple catch blocks allow handling different types of exceptions in separate blocks.
   - They are processed in order, and the first matching block is executed.
   - *Example:*
     ```java
     try {
         // Code that may throw either NullPointerException or ArrayIndexOutOfBoundsException
     } catch (NullPointerException e) {
         // Handle NullPointerException
     } catch (ArrayIndexOutOfBoundsException e) {
         // Handle ArrayIndexOutOfBoundsException
     }
     ```

## 9. Exception Chaining
   - Exception chaining involves throwing a new exception while capturing the original exception as the cause.
   - Useful for preserving information about the root cause of an exception.
   - *Example:*
     ```java
     try {
         // Code that may throw an exception
     } catch (Exception originalException) {
         throw new CustomException("A custom exception occurred", originalException);
     }
     ```

## 10. Best Practices for Exception Handling
   - Be specific in exception catching; avoid catching generic `Exception` unless necessary.
   - Document exceptions thrown by methods using the `throws` clause.
   - Use custom exceptions for application-specific errors.
   - Keep exception handling code concise and focused on error recovery.
   - Log exceptions with relevant information for debugging.
