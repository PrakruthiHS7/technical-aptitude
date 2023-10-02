//4.count the even and odd in array
public class CountEvenOdd
{
 static int arr[]={2,4,6,1,3};
 static int evencount=0,oddcount=0;
public static void main(String args[])
{	
for(int i=0; i<arr.length; i++)
{
    if(arr[i]%2==0)
    {
     evencount++;
    }
   else
  {
  oddcount++;
  }  
}
System.out.println("Even count: " +evencount);
System.out.println("Even count: " +oddcount);
}
}