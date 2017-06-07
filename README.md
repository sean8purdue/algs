## Overview

<IMG SRC="http://algs4.cs.princeton.edu/cover.png"  align=right hspace=25 width=100 alt = "Algorithms 4/e textbook">

This repository is intended to practice general data structure and algorithms in Java by Guo Li. The Readme file is copied from the original repository. Thanks to Prof. Robert Sedgewick and Prof. Kevin Wayne and all code workers to make such good learning material for public!

This <a href = "https://github.com/kevin-wayne/algs4">public repository</a>
contains the Java <a href = "http://algs4.cs.princeton.edu/code/">source code</a>
for the algorithms and clients in the textbook
<a href = "http://amzn.to/13VNJi7">Algorithms, 4th Edition</a> by Robert Sedgewick and Kevin Wayne.
This is the official version&mdash;it is actively maintained and updated by the authors.
The programs are organized in the package <code>edu.princeton.cs.algs4</code>.
If you need only the class files (and not the source code), you can use
<a href = "http://algs4.cs.princeton.edu/code/algs4.jar">algs4.jar</a> instead.

<br>

## 1 Fundamentals

### 1.Binary Search  
1.1 Define mid = lo + (hi - lo) /2  
1.2 if key < a[mid] , hi = mid -1;
else if key > a[mid], lo = mid + 1;
else return mid;  
1.3 while (lo <= hi) Note: <= There is still a range to search

**bug**1: if , else if, else.   
If the first (if statement satisfied, the below else 
if statement shoul not be executed. But if you Write i
n the format like this: If expre1; if expre 2; else), 
the second if statement will always be executed!!

**bug** 2: hi = array.length - 1;

### 2.Java parameter transfer  
2.1 parameter t is a new reference variable contains the same address of argument. That's also say t and time point to the same object.  
`t == time, true `  
 `t.equals(time), true`  
 
 Understanding in c: t和time并非同一个引用，此处引用的意思我想是指在内存中是不是同一个time类的变量，或者说time类型的指针。
t和time在内存中处于不同的位置, both in stack，time属于对象opt，the actual object is stored in heap。
而t属于函数 void objectMethod的Frame里，当调用结束后，t会消失。下面例子中的t1，t2，皆属于opt.swap方法中的参数，当调用时处在opt.swapFrame里，调用结束后消失。
 

 2.2 change the value of t can change argument time value

### 3. Fix Capacity Array Based Stack 
3.1 `private int size = 0;`  
<-- holds index of **next available** cell in the items array

3.2 Test Private Method in JavaPrivate method can be used in the self class, not in outer class

3.3 Iterator Implement  
Test1: 

```java        
for (Object sj : si)
   StdOut.println(sj);
```
  
Test2: 
 
```java

        Iterator<String> i = si.iterator();
        while (i.hasNext()) {
            String is = i.next();
            StdOut.println(is);
        }
```  
3.4 Resized Array, Question: avoid loitering ???

```java
    public Item pop() {
        Item item =  ar[--N];
        ar[N] = null; // avoid loitering ???

        if (N > 0 && N == ar.length/4) 
        	resize(ar.length/2);
        return item;
    }
```
  ` `
   // avoid loitering ???

## 2 Sort

2.

## 3 Searching

3.

## 4 Graphs

4.

## 5 Strings

5.



## Copyright

Copyright &copy; 2000&ndash;2017 by Robert Sedgewick and Kevin Wayne.

## License

This code is released under GPLv3.

## Contribute to this repository

This <a href = "http://algs4.cs.princeton.edu/code/wishlist.txt">wishlist.txt</a>
contains a list of algorithms and data structures that we would
like to add to the repository. Indeed, several of the algorithms and
data structures in this repository were contributed by others. If interested, please
follow the same style as the code in the repository and thoroughly test your
code before contacting us.

## Support for other programming languages

Some of the code in this repository has been translated to other languages:
<ul>
<li><a href = "https://github.com/garyaiki/Scala-Algorithms">Scala</a> by Gary Struthers
<li><a href = "https://github.com/nguyenqthai/Algs4Net">.NET</a> by Quoc Thai
</ul>


## Credits

Thanks to Peter Korgan for Maven and Gradle support.

Thanks to Prof. Robert Sedgewick and Prof. Kevin Wayne.