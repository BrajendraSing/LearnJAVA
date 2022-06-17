# String Class in Java


##### Create an empty String
```java
  String s = new String();
```


##### Create a String initialized by an array of characters
```java
char chars[] = { 'a', 'b', 'c' };
String s = new String(chars);
System.out.println(chars);           //<!--Output : abc --> 
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
  System.out.println(s);         //<!--Output : cde -->
```

##### Create a string with string constructor
```java
    String s = new String("Brajendra Singh");
    System.out.println(s);                   //<!--Output : Brajendra Singh
```

##### Create a string by assigning the value
```java
      String name = "Brajendra Singh";
      System.out.println(name);                   //<!--Output : Brajendra Singh
      
 ```

##### You can construct a String object that contains the same character sequence as another String object using this constructor:
```java
String(String strObj);
```

###### Example
```java
        String name = "Brajendra Singh";
        String name2 = new String(name);
        
        System.out.println(name);                 //<!--Output : Brajendra Singh -->
        System.out.println(name2);                //<!--Output : Brajendra Singh -->
```


## String Length
```java
        String s = new String("Brajendra Singh");
        System.out.println(s.length());              //<!--Output : 15 -->         
 ```
