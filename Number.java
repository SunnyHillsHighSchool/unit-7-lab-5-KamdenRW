//Add Number.java code from lab 4

//write the Number class
//use the handout and
//sample runner code
//to guide you

//header for Number class
public class Number
{
//private instance variable (must be an Integer)
private int num;
//constructor
public Number()
{
  num = 0;
}

public Number(int n)
{
  num = n;
}
//getter method
public int getNum()
{
  return num;
}

//setter method
public void setNum(int n)
{
  num = n;
}

//isOdd method
public boolean isOdd() {

if ( num % 2 == 0 ) {
   return false;
  }
else {
    return true;
  }
}

 

//isPerfect method
public boolean isPerfect()
{
int a = 0; 

  for (int i = 1; i < num; i++) { 
            
   if (num % i == 0) { 
        a += i; 
    } 
  } 
 //System.out.println("a="+a);
    if (num == a)
    {
      return true;
    }
    return false;
}


//toString
public String toString()
{
  return ""+num;
}
}