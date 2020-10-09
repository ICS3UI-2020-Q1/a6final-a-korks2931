import java.util.Scanner;
/**
 *This program will find how many answers the student got correct.
 * @author Sevde 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
     // variable to store 5 
     final int ANSWER_NUMS = 5; 
     // make an array to put the correct answers in 
     String[] correctAnswers = new String [ANSWER_NUMS];
     // tell the user to enter in the correct answers 
     System.out.println ("Please enter the answers to the test ");


     // make a for loop for it to go through the array
     for (int i = 0; i < ANSWER_NUMS; i++){
       correctAnswers[i] = input.nextLine();
     }


     //make another array for the answers of the student 
     String[] studentAnswers = new String [ANSWER_NUMS];

     // ask the user to enter the student answers 
     System.out.println("Please enter the student answers ");
     
     // make a for loop for these answers to go through
     for(int i = 0; i < ANSWER_NUMS; i++ ){
       studentAnswers[i] = input.nextLine();
     
     }
      // make an accumulator that starts at 0
      int rightAnswers = 0;
      // make a for loop to find which answers were correct
     for(int i= 0;i < ANSWER_NUMS; i++ ){
       // make a variable name for the student answers
       String answersStudent = studentAnswers[i];
       // make a variable name for correct answers
       String answersCorrect = correctAnswers[i];
       // make an if statement to figure out which answers were the same/correct
       if( answersStudent.equals (answersCorrect)){
         // add one each correct answer
        rightAnswers = 1 + rightAnswers; 
          
          
       }  
     }
     // tell the user their score 
     System.out.println ("Score: " + rightAnswers);
          
    

      




    
  }
}
