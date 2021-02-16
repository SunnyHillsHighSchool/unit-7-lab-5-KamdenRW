//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;

public class NumberAnalyzer
{
	private ArrayList<Number> list;

	//write a constructor
  public NumberAnalyzer(int[]n)
  {
    list = new ArrayList< Number>();
    for(int a:n)
    {
    list.add(new Number(a));
    }

  }

  //add method
  //public void add(Number u){
    
  //}


	//write count odds

public int countOdds()
{
  int oddCount = 0;
  for(Number x: list){
    if(x.isOdd()){
      oddCount++;
    }
  }
  return oddCount;
}

	//write count evens

public int countEvens()
{
  int evenCount = 0;
  for(Number y: list){
    if(y.isOdd() == false){         
      evenCount++;
		}
  }
  return evenCount;
}



	//write count perfects
	
public int countPerfects()
{
  int perfectCount = 0;
  for(Number z: list){
    if(z.isPerfect()){         
      perfectCount++;
		}
  }
  return perfectCount;
}

	//write a toString
  public String toString()
{
  return ""+list;
}

}