package project_euler;

public class Question1 
{
int t = 3;
int f = 5;
int cap = 1000;
 
 boolean isDividedBy3Or5(int input)
 {
   int result = input % 3;
   int result2 = input % 5;
   
   if(result == 0 || result2 == 0)
   {
       return true;
   }
     
   return false;  
 }
 
 
 int sumStuff()
 {
     int totalSum = 0;
     
     for (int i = 0; i < cap; i++)
     {
         if(isDividedBy3Or5(i) == true)
         {
             totalSum += i;
         }
     }
     
    return totalSum; 
 }  
 
 
}
