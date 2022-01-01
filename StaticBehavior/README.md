Report of the behavior of the static block ,non static block and construcor in java.

In this StaticDemo02 class, there are 
1. a static block
2. non static block
3. static block
4. constructor .
They are in this order in the class respectively.

First , the static blocks are declared and initialized in the order they appear in the class.
Then , the non-static block are declared and initialized.
Finally, the constructor.

But , There is no any object instantiated,it means that,there is no constructor call with new keyword.
Therefore, The non static block and constructor are not initialized here.

So ,we get the out put from:
1st static block :count is 0
then the 2nd static block :count is 30

output
1st static block : 0
2nd static block : 30


In the StaticDemo01 class, there are 
1. a static block
2. non static block
3. static block which create new inistance
4. static block 
5. constructor
They are in this order in the class respectively.

As per the inialization order the out is:
1st static block : 0
1st non static block : 5
constructor 5
3rd static block : 5
2nd static block : 35

In the 2nd static block,we call a new instance:
It calls,non static bloack then calls constroctor enternally.

So ,we get the out put from 1at staick block :count is 0
then the 2nd static block,it calls new instance, as next,the non static block and constructor are inialized.

1. in non staic block is first,thre ,the count variable is inialized as 5.
2. then constructor,it prints count value as 5 
3. finally,print statemnet of thestatic block.count is still 5.

After complete the 2nd static block,it comes to 3rd static block.There is no more static block.



