Here are 100 practical coding questions focusing on Java 8 features:

### Lambda Expressions

1. Write a lambda expression to sort a list of strings by their length.
2. Use a lambda expression to filter a list of integers to only include even numbers.
3. Create a lambda expression that converts a list of strings to uppercase.
4. Implement a lambda expression to concatenate a list of strings with a delimiter.
5. Write a lambda expression to calculate the sum of a list of integers.
6. Use a lambda expression to find the longest string in a list.
7. Write a lambda expression to reverse each string in a list.
8. Implement a lambda expression to find the first non-repeated character in a string.
9. Use a lambda expression to count the occurrences of each word in a list of strings.
10. Write a lambda expression to square each number in a list of integers.

### Streams

1. Use streams to filter a list of integers to only include odd numbers.
2. Write a stream operation to find the maximum value in a list of integers.
3. Use streams to sort a list of strings alphabetically.
4. Write a stream operation to count the number of distinct elements in a list.
5. Use streams to concatenate a list of strings into a single string.
6. Write a stream operation to find the average of a list of integers.
7. Use streams to group a list of strings by their length.
8. Write a stream operation to partition a list of integers into even and odd numbers.
9. Use streams to create a map from a list of strings where the key is the string and the value is its length.
10. Write a stream operation to flatten a list of lists into a single list.

### Optional

1. Write a method that returns an Optional<String> and use it to handle a possible null value.
2. Use Optional to provide a default value if a value is not present.
3. Write a method that returns an Optional<Integer> and use it to handle the absence of a value.
4. Use Optional to throw an exception if a value is not present.
5. Write a method that returns an Optional<Double> and use it to filter a value based on a condition.
6. Use Optional to transform a value if it is present.
7. Write a method that returns an Optional<List<String>> and use it to handle an empty list.
8. Use Optional to chain multiple operations on a possible null value.
9. Write a method that returns an Optional<Map<String, Integer>> and use it to handle a possible empty map.
10. Use Optional to combine two Optional values if both are present.

### General Java 8 Features

1. Write a default method in an interface and implement it in a class.
2. Use a static method in an interface and call it from a class.
3. Create a functional interface and use it with a lambda expression.
4. Write a method reference to a static method.
5. Write a method reference to an instance method.
6. Use a constructor reference to create a new instance of a class.
7. Write a lambda expression to iterate over a list and print each element.
8. Use a lambda expression to create a comparator for sorting objects.
9. Write a lambda expression to filter a map based on its keys.
10. Use a lambda expression to convert a list of objects to a list of their properties.

### Date and Time API

1. Create a LocalDate instance representing today's date.
2. Create a LocalTime instance representing the current time.
3. Create a LocalDateTime instance representing the current date and time.
4. Write a method to format a LocalDate instance using DateTimeFormatter.
5. Write a method to parse a date string into a LocalDate instance using DateTimeFormatter.
6. Use LocalDate to add and subtract days from a given date.
7. Use LocalTime to add and subtract hours from a given time.
8. Use LocalDateTime to add and subtract months from a given date and time.
9. Write a method to compare two LocalDate instances and determine which is earlier.
10. Write a method to find the difference in days between two LocalDate instances.

### Advanced Topics

1. Use streams to read a file line by line and print each line.
2. Use streams to filter lines in a file that contain a specific word.
3. Write a method to count the number of lines in a file using streams.
4. Use streams to find the longest line in a file.
5. Write a method to find the most common word in a file using streams.
6. Use streams to read numbers from a file and calculate their sum.
7. Write a method to write a list of strings to a file using streams.
8. Use streams to process a large file and filter lines based on a condition.
9. Write a method to merge the contents of two files into a single file using streams.
10. Use streams to sort the lines of a file alphabetically and write them to a new file.

### CompletableFuture

1. Create a CompletableFuture and complete it with a value.
2. Chain multiple CompletableFuture calls to perform a sequence of operations.
3. Write a method to handle exceptions in a CompletableFuture.
4. Use CompletableFuture to run a task asynchronously and return a result.
5. Write a method to combine the results of two CompletableFutures.
6. Use CompletableFuture to perform a task with a timeout.
7. Write a method to execute a task asynchronously and handle the result using thenApply().
8. Use CompletableFuture to execute a task and handle the result using thenAccept().
9. Write a method to run multiple tasks asynchronously and wait for all of them to complete.
10. Use CompletableFuture to run a task asynchronously and handle the result using thenCompose().

### Miscellaneous

1. Use a lambda expression to implement a Runnable and start a new thread.
2. Write a lambda expression to filter a map based on its values.
3. Use a lambda expression to find the sum of all values in a map.
4. Write a method to use a lambda expression with a custom functional interface.
5. Use a lambda expression to sort a list of objects by multiple properties.
6. Write a method to handle null values in a stream using Optional.
7. Use a lambda expression to count the number of words in a string.
8. Write a lambda expression to find the factorial of a number.
9. Use a lambda expression to reverse the words in a sentence.
10. Write a lambda expression to find the longest word in a sentence.

### Collections API

1. Use the forEach() method to iterate over a list and print each element.
2. Write a method to sort a list of strings in reverse order using the Collections API.
3. Use the removeIf() method to remove all even numbers from a list.
4. Write a method to replace all occurrences of a value in a list using the replaceAll() method.
5. Use the computeIfAbsent() method to create a new entry in a map if it is absent.
6. Write a method to merge two maps using the merge() method.
7. Use the computeIfPresent() method to update a value in a map if it is present.
8. Write a method to create a new map from a list of objects using the toMap() method.
9. Use the replaceAll() method to convert all keys in a map to uppercase.
10. Write a method to create a synchronized map using the Collections API.

### Performance and Optimization

1. Use streams to parallelize the processing of a list and measure the performance improvement.
2. Write a method to optimize the performance of a stream operation using parallelStream().
3. Use the Fork/Join framework to parallelize the processing of a large array.
4. Write a method to measure the performance of a lambda expression compared to a traditional loop.
5. Use the Collectors.toMap() method to optimize the creation of a map from a list.
6. Write a method to use the Collectors.groupingBy() method to optimize the grouping of elements in a list.
7. Use the Collectors.joining() method to optimize the concatenation of strings in a list.
8. Write a method to use the Collectors.reducing() method to optimize the reduction of elements in a list.
9. Use the Collectors.mapping() method to optimize the mapping of elements in a list.
10. Write a method to use the Collectors.collectingAndThen() method to optimize the post-processing of a collection.
