For second laboratory I have 2 classes, Box and Queue, in which I implemented 
the conditions for basic level and advanced level.
Mainly in this lab I had to familiarize with object constructors and Queue.
In PHP it's better to have one constructor in one class, even if it's possible 
to make more than one to work. In Box.php I created a program where I instantiated 
3 objects of Box type (which have the following instance variables -> height, width and length),
via its constructor in 3 different ways: without parameters (all the instance variables 
have default value 1), with 1 parameter (all the instance variables have same value), 
with 3 parameters (for each instance variable).In same file I Implemented two methods 
for surface area and volume calculation of the box.

In Queue.php file I created a class Queue and instantiated 2 objects of this type
(fruitCollection and colorCollection). Each queue have as state the number of elements 
from it and can be created via constructor with parameter(maximum size as value).Also, 
I have push() and pop() methods through which I can add values to objects and extract 
the last element from it. In same file there are isFull() and isEmpty() methods.
All the results are printed in browser.
