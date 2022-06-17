# String Class in Java
---

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

---
## String Length
```java
        String s = new String("Brajendra Singh");
        System.out.println(s.length());              // Output : 15         
 ```
 
 
 ---
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
---
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
###### If you don't override the toString() method in this class then ***` System.out.println(obj);`*** print the address of the object not the value

---

## Character Extraction


### To extract a single character from a String
```java
char charAt(int where);
```
```java
String name = "Brajendra Singh";
char ch = name.charAt(5);
System.out.println(ch);                             // Output : n
```

### To extract more than one character at a time
```java
void getChars(int sourceStart, int sourceEnd, char target[ ], int targetStart);
```

```java
        String name = "Brajendra singh";
        int start = 2;
        int end = 11;
        char ch[] = new char[end - start];
        name.getChars(start, end, ch, 0);
        System.out.println(ch);                     // Output : ajendra s

```
### There is an alternative to getChars( )
```java
public byte[] getBytes()  
public byte[] getBytes(Charset charset)  
public byte[] getBytes(String charsetName)throws UnsupportedEncodingException  
```

```java
String name = "Brajendra singh";
        byte b[] = name.getBytes();
        for(byte x : b)
        {
            System.out.print(x + " ");
        }
                                        // Output : 66 114 97 106 101 110 100 114 97 32 115 105 110 103 104
```

### Converting String into character array
 ```java
char[ ] toCharArray( )
 ```
 
 ```java
        String name = "Brajendra singh";
        char ch[] = name.toCharArray();
        for(char c : ch)
        {
            System.out.print(c + " ");
        }                                        // Output : B r a j e n d r a   s i n g h 
 ```
 
 ---
 
 ## String Comparison
 ### equals( ) and equalsIgnoreCase( )
 ```java
 boolean equals(Object str);
 boolean equalsIgnoreCase(Object str);
 ```
 ```java
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Good-bye";
        String s4 = "HELLO";
        
        System.out.println(s1.equals(s2));                     // Output : true
        System.out.println(s1.equals(s3));                    // Output : false
        System.out.println(s1.equals(s4));                   // Output : false
        System.out.println(s1.equalsIgnoreCase(s4));        // Output : true
 ```
 
 ### startsWith( ) and endsWith( )
 ```java
        String s = "Java with Brajendra";
        System.out.println(s.endsWith("dra"));                // Output : true
        System.out.println(s.startsWith("Java"));            // Output : true
        System.out.println(s.startsWith("java"));            // Output : false
 
 ```
 
 ### equals( ) Versus ==
 'the equals( ) method compares the characters inside a String object'
<br>
'The == operator compares two object references to see whether they refer to the same instance'

```java
        String s = "Java with Brajendra";
        String s1 = new String(s);
        String s2 = "Java with Brajendra";
        
        System.out.println(s == s2);                         // Output : true
        System.out.println(s.equals(s2));                   // Output : true
        
        System.out.println(s == s1);                      // Output : false
        System.out.println(s.equals(s1));                // Output : true
        
 ```
