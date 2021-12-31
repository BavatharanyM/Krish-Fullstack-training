public class StaticDemo01{
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


//staic block 
static{
count = count + 30;
System.out.println("2nd static block : " + count);
}

public StaticDemo01(){
System.out.println("constructor " + count);
}

public static void main(String[] args){}
}
