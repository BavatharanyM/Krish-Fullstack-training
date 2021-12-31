Report of the behavior of the static block ,non static block and construcor in java.

In this StaticDemo01 class, there are 
1. a static block
2. non static block
3. static block
4. constructor .
They are in this order in the class respectively.

First , the static blocks are declared and initialized in the order they appear in the class.
Then , the non-static block are declared and initialized.
Finally, the constructor.

But , There is no any object instantiated,it means that,there is no constructor claas.with new keyword.
Therefore, The non static block and constructor are not initialized here.
So, the out put is 
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
