public class StaticDemo02{
public static int count ;
  
  //constructor
public StaticDemo02(){  
  System.out.println("first line constructor " + count);
}

  //instance or non static block
{
count = count +5 ;
System.out.println("1st non static block : " + count);

}
  
//static block
static{
System.out.println("1st static block : " +count);

}


//static block 
static{
System.out.println("2nd static block : " + count);
}

  //non static block
{
count = count + 30;
System.out.println("3rd static block : " + count);
}


public static void main(String[] args){
StaticDemo02 staticDemo02 = new StaticDemo02() ;
}
}
