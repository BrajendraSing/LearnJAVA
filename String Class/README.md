# String Class in Java


##### Create an empty String
```java
  String s = new String();
```


##### Create a String initialized by an array of characters
```java
char chars[] = { 'a', 'b', 'c' };
String s = new String(chars);
System.out.println(s);           // Output : abc 
```

##### You can specify a subrange of a character array as an initializer using the following constructor:
```java
String(char chars[ ], int startIndex, int numChars);
```
###### Example 
 `Here, startIndex specifies the index at which the subrange begins, and numChars specifies
the number of characters to use. Here is an example:`
```java
  char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
  String s = new String(chars, 2, 3);
  System.out.println(s);         // Output : cde 
```

##### Create a string with string constructor
```java
    String s = new String("Brajendra Singh");
    System.out.println(s);                   // Output : Brajendra Singh
```

##### Create a string by assigning the value
```java
      String name = "Brajendra Singh";
      System.out.println(name);                   // Output : Brajendra Singh
      
 ```

##### You can construct a String object that contains the same character sequence as another String object using this constructor:
```java
String(String strObj);
```

###### Example
```java
        String name = "Brajendra Singh";
        String name2 = new String(name);
        
        System.out.println(name);                 // Output : Brajendra Singh 
        System.out.println(name2);                // Output : Brajendra Singh 
```


## String Length
```java
        String s = new String("Brajendra Singh");
        System.out.println(s.length());              // Output : 15         
 ```
 
 
 
 ## String Concatenation
 ```java
String age = "23";
String s = "He is " + age + " years old.";
System.out.println(s);                          // Output : He is 23 years old.
```

###### Using concatenation to prevent long lines.
```java
 String longStr = "This could have been " +
 "a very long line that would have " +
 "wrapped around. But string concatenation " +
 "prevents this.";
 System.out.println(longStr);
```

### String Concatenation with Other Data Types
```java
int age = 23;
String s = "He is " + age + " years old.";
System.out.println(s);                  // Output : He is 23 years old.
```

## String Conversion and toString( )
 `When Java converts data into its string representation during concatenation, it does so by
calling one of the overloaded versions of the string conversion method valueOf( ) defined
by String. valueOf( ) is overloaded for all the primitive types and for type Object. For the
primitive types, valueOf( ) returns a string that contains the human-readable equivalent
of the value with which it is called. For objects, valueOf( ) calls the toString( ) method on the
object.`

```java
class Box {
    int height;
    int width;
    Box(int height, int width)
    {
        this.height = height;
        this.width = width;
    }
    
    public String toString()
    {
        return "The Height of the box is : " + height + ", Width of the box is : " + width;
    }
    
    public static void main(String[] args) {
       Box obj = new Box(10, 20);
       System.out.println(obj);               //Output : The Height of the box is : 10, Width of the box is : 20
    }
}

```
###### If you don't override the toString() method in this class then __System.out.println(obj);__ print the address of the object not the value
