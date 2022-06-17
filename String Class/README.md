# String Class in Java


##### To create an empty String
```java
  String s = new String();
```


##### To create a String initialized by an array of characters
```java
char chars[] = { 'a', 'b', 'c' };
String s = new String(chars);
```

##### You can specify a subrange of a character array as an initializer using the following constructor:
```java
String(char chars[ ], int startIndex, int numChars);
```
###### Example 
 `<p>Here, startIndex specifies the index at which the subrange begins, and numChars specifies
the number of characters to use. Here is an example:</p>`
```java
char chars[] = { 'a', 'b', 'c', 'd', 
```

`<p>This is a paragraph</p>`

