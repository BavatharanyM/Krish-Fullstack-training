# Report for order of th einialization of the static block ,non static block and construcor in java.

In this **StaticDemo01** class, there are 
1. static block
2. non static block
3. static block
4. constructor .


They are in this order in the class respectively.

But , There is no any object instantiated,it means that,there is no constructor call with new keyword.
Therefore, The non static block and constructor are not initialized here.


So ,we get the out put from:


**output:**

_1st static block : 0

2nd static block : 30_



>So that,The only the staic blockes are inialized based on thir order in the class.


In the next class StaticDemo02,there are
1. construcor
2. non static block
3. static block
4. static block
5. non static block

They are in this order in the class respectively.

and,There is instantiated an object also,it means that,the  constructor is  called with new keyword.

**output**

_1st static block : 0
2nd static block : 0
1st non static block : 5
3rd static block : 35
first line constructor 35_


**Hence:**

first ,The static blocks are initialized in their order

then, non static block are initialized in their order

finally, the construcotor


Lets see onother example for it .

In the **StaticDemo03** class, there are 
1. a static block
2. non static block
3. static block which create new inistance
4. static block 
5. constructor


They are in this order in the class respectively.

As per the inialization order the output is:

1st static block : 0
1st non static block : 5
constructor 5
3rd static block : 5
2nd static block : 35

In the 2nd static block,we call a new instance:
It calls,non static bloack then calls constroctor enternally.

So ,we get the out put from 

1st staick block :count is 0

then the 2nd static block,

it calls new instance,
as next,the non static block and constructor are inialized.

1. in non staic block is first,there ,the count variable is inialized as 5.
2. then constructor,it prints count value as 5 
3. finally,print statemnet of thestatic block.count is still 5.

After complete the 2nd static block,it comes to 3rd static block.There is no more static block.


#### Summery : the order of inialitation


 **1.the static blocks are declared and initialized in the order they appear in the class.**

 **2.the non-static block are declared and initialized.**
 
 **3.the constructor**

