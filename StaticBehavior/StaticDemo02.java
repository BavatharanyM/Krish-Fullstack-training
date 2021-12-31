public class StaticDemo02{
public static int count ;


//static block
static{
System.out.println("1st static block : " +count);

}

//instance or non static block
{
count = count +5 ;
System.out.println("1st non static block : " + count);

}


//static block 
static{
count = count + 30;
System.out.println("2nd static block : " + count);
}

public StaticDemo02(){
System.out.println("constructor " + count);
}

//static block 
static{
new StaticDemo02();
System.out.println("3rd static block : " + count);
}


public static void main(String[] args){}
}