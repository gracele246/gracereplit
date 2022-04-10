{% include navigation.html %}

# Tech Talk Notes
```
** Notes and Plans for Tech Talks and AP Exam Here **
Go to tutorial for any help and also make sure to ask scrum team and other coders as well
Take good notes to make sure to understand topics
Make sure to rewatch any AP videos for practice or to re-learn different topics
Look back at AP CSA Notes for more practice
```
### AP Computer Science Notes: [Notes](https://docs.google.com/document/d/1dFJccMrcsShhnTnlHlOgUr9Pw3E7xz5TUFw5p1UVCMA/edit?usp=sharing)

# ____________________________________________________________________________________________________________________________________________________________________________

## Table of Contents
<table>
    <tr>
        <td><a href="#tt0">TT0</a></td>
        <td><a href="#tt1">TT1</a></td>
        <td><a href="#tt2">TT2</a></td>
        <td><a href="#tt3">TT3</a></td>
        <td><a href="#tt4">TT4</a></td>
        <td><a href="#tt5">TT5</a></td>
        <td><a href="#tt6">TT6</a></td>
        <td><a href="#tt7">TT7</a></td>
        <td><a href="#tt8">TT8</a></td>
        <td><a href="#tt9">TT9</a></td>
        <td><a href="#tt10">TT10</a></td>
    </tr>
</table>

# ____________________________________________________________________________________________________________________________________________________________________________

## TT0

### Imperative vs. Object Oriented Paradigms
Imperative Paradigms are more step-by-step than Object Oriented Paradigms. OOP relies on classes and objects, although the methods have Imperative Paradigms.


### Java Arrays
```java
public static Animal[] animalData() {
	return new Animal[]{
	        new Animal("Lion", 8, "Gold"),
	        new Animal("Pig", 3, "Pink"),
		new Animal("Robin", 7, "Red"),
		new Animal("Cat", 10, "Black"),
		new Animal("Kitty", 1, "Calico"),
		new Animal("Dog", 14, "Brown")
	};
}
```

### Java Dictionaries
```java
private final Map<String, Integer> OPERATORS = new HashMap<>();
    {
        // Map<"token", precedence>
        OPERATORS.put("*", 3);
        OPERATORS.put("/", 3);
        OPERATORS.put("%", 3);
        OPERATORS.put("+", 4);
        OPERATORS.put("-", 4);
    }
```
# ____________________________________________________________________________________________________________________________________________________________________________

## TT1
### Linked Lists
- Data Structures conversation continue with the discussions of Linked Lists. There is an implementation built into Java providing an implementation to help you visualize this Data Structure internally. Stacks and Queues can be built on top of Linked Lists and this implementation and code examples show LinkedList used as nodes in these Data Structures.
- 
### Java Generic `T` and Java Iterable
> `T` is the iterator variable. Iterators are used to retrieve elements one by one. Every class that implements Iterable interface appropriately, can be used in the enhanced For loop (for-each loop). The need to implement the Iterator interface arises while designing custom data structures.

- Linked list are a way of keeping and managing a list of Objects
- ABCD have Data and Next pointer
- E is illustrative of inserting a new Object
- tmp illustrates accessing the Data from the D Object
```
public class LinkedList
{
    private Object opaqueObject;  // opaqueObject means specific type is not known, as LinkedList are not specific to a data type
    private LinkedList prevNode;
    private LinkedList nextNode;

    /**
     *  Constructs a new element with object objValue,
     *  followed by object address
     *
     * @param  opaqueObject  Address of Object
     */
    public LinkedList(Object opaqueObject, LinkedList node)
    {
        this.setObject(opaqueObject);
        this.setPrevNode(node);
        this.setNextNode(null);
    }
```

# ____________________________________________________________________________________________________________________________________________________________________________

## TT2

### Calculator Theory
* In mathematics, an expression or mathematical expression is a finite combination of symbols that is well-formed according to rules that depend on the context.
* In computers, expression can be hard to calculate with precedence rules. In computer math we often convert strings into Reverse Polish Notation 

* After thinking about basic anatomy of an expression and RPN algorithm, we need to think of flow of control to go from terms/tokens, RPN, and ultimately calculate the final result.  In this flow, a Class can be established to manage the Calculator object.  The Constructor can receive an expression and establish a sequence to produce a result.
```java
// Create a 1 argument constructor expecting a mathematical expression
    public Calculator(String expression) {
        // original input
        this.expression = expression;

        // parse expression into terms
        this.termTokenizer();

        // place terms into reverse polish notation
        this.tokensToReversePolishNotation();

        // calculate reverse polish notation
        this.rpnToResult();
    }
```

* A Term tokenizer is used to change the String expression into a series of tokens that constitute distinct elements of a Mathematical expression.

# ____________________________________________________________________________________________________________________________________________________________________________

## TT3

### Selection Sort
As it progresses from index [0] to [n-1], selection sort is a linear sort algorithm. In an inner loop, it runs a second linear loop that compares two items (as shown in the diagram below) and records which is the smallest, then swaps the smallest number to the lowest in the round after cycling to the finish.
![image](https://user-images.githubusercontent.com/73254122/161649682-541a4a90-1061-45b3-8c95-150d95b3b6a2.png)

### Insertion Sort
Another linear technique is insertion sort, which sorts elements from index [0] to index [n-1]. This algorithm's inner loop finds the gap, or insertion point, for the next item and inserts it. The list is partially sorted according to the index of the outer loops after each inner loop.
![image](https://user-images.githubusercontent.com/73254122/161649793-061c212d-4e2d-42b9-946c-3248958f28b1.png)

### Merge Sort
Rather than using a linear insertion or selection sort technique, this algorithm employs a divide and conquer strategy. It may appear complicated at first glance, but it is actually rather simple. It recursively separates the array into two groups until there are only two to compare, swapping if required. Then it pops out of the recursion; notice the cascading and then the inverted assembly in the figure; following that, it uses a sorted comparison to put each separated group back together.

![image](https://user-images.githubusercontent.com/73254122/161650021-64aaf97f-76bd-45bd-94ee-103a40e70ec8.png)


# ____________________________________________________________________________________________________________________________________________________________________________

## TT4

# ____________________________________________________________________________________________________________________________________________________________________________

## TT5

# ____________________________________________________________________________________________________________________________________________________________________________

## TT6

# ____________________________________________________________________________________________________________________________________________________________________________

## TT7

# ____________________________________________________________________________________________________________________________________________________________________________

## TT8

# ____________________________________________________________________________________________________________________________________________________________________________

## TT9

# ____________________________________________________________________________________________________________________________________________________________________________

## TT10

