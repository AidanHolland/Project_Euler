package project_euler;


public class Project_Euler 
{  
    public static void main(String[] args) 
    {
        Question1 q1 = new Question1();
        System.out.println("The answer to question 1 is:");
        System.out.println(q1.sumStuff());
        System.out.println("The answer to question 2 is:");
        Question2 q2 = new Question2();
        System.out.println(q2.addFib());
    }   
}
