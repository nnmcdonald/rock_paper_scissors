////////////////////////////////////////////////////////////////////////////
//
// Nathaniel McDonald
// Februrary 2, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DESCRIPTION: This program lets two people play rock paper scissors against each other.
// 
// INPUTS:  Player 1's choice of rock paper or scissors and player 2's choice.
//    
//
// OUTPUTS: The winner and the players' choices. For example "Rock smashes scissors, Player 1 wins!"  
//   
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import javax.swing.JOptionPane;
  
  public class RockPaperScissors
  {
    public static void main(String[] args)
    {
      //Prompts player 1 to choose rock paper or scissors.
      String playerOne = 
        JOptionPane.showInputDialog("Player 1, please enter either R for rock, P for paper, or S for scissors." 
                                      + "Then pass to Player 2");
        String choiceOne = playerOne.substring(0);
       
       //Determines if player 1 entered either R,P, or S ignoring the case.
      if (choiceOne.equalsIgnoreCase("R"));
      else if (choiceOne.equalsIgnoreCase("P"));
      else if (choiceOne.equalsIgnoreCase("S"));
      else
      {
       do
       {
        //If the player did not enter R, P, or S they receive an error message until R, P, or S is entered.
         playerOne =
            JOptionPane.showInputDialog(null, "Please choose R, P, or S");
            choiceOne = playerOne.substring(0);
       }
        while (!(choiceOne.equalsIgnoreCase("R")) 
                  && !(choiceOne.equalsIgnoreCase("P"))
                  && !(choiceOne.equalsIgnoreCase("S")));
        }
      
      //Prompts player 2 to choose rock paper or scissors.
      String playerTwo =
       JOptionPane.showInputDialog("Player 2, please enter either R for rock, P for paper, or S for scissors."); 
      String choiceTwo = playerTwo.substring(0);
      
      //Determines if player 2 entered R, P, or S ignoring case.
      if (choiceTwo.equalsIgnoreCase("R"));
      else if (choiceTwo.equalsIgnoreCase("P"));
      else if (choiceTwo.equalsIgnoreCase("S"));
      else
      {
       do
       { 
       //If the player did not enter R, P, or S they receive an error message until R, P, or S is entered.
         playerTwo =
            JOptionPane.showInputDialog("Please choose R, P, or S");
            choiceTwo = playerTwo.substring(0);
            
       }
        while (!(choiceTwo.equalsIgnoreCase("R")) 
                 && !(choiceTwo.equalsIgnoreCase("P")) 
                 && !(choiceTwo.equalsIgnoreCase("S")));
        }
      
      //Displays the outcome using player 1 and player 2's choices.
      if (choiceOne.equalsIgnoreCase(choiceTwo))
          JOptionPane.showMessageDialog(null, "The game is a tie! Please play again.");
      else if (choiceOne.equalsIgnoreCase("R") && choiceTwo.equalsIgnoreCase("S"))
                 JOptionPane.showMessageDialog(null, "Rock Breaks Scissors, Player 1 wins!");
      else if (choiceOne.equalsIgnoreCase("P") && choiceTwo.equalsIgnoreCase("R"))
                 JOptionPane.showMessageDialog(null, "Paper Covers Rock, Player 1 wins!");
      else if (choiceOne.equalsIgnoreCase("S") && choiceTwo.equalsIgnoreCase("P"))
                 JOptionPane.showMessageDialog(null, "Scissors Cuts Paper, Player 1 wins!");
      else if (choiceTwo.equalsIgnoreCase("R") && choiceOne.equalsIgnoreCase("S"))
         JOptionPane.showMessageDialog(null, "Rock Breaks Scissors, Player 2 wins!");
      else if (choiceTwo.equalsIgnoreCase("P") && choiceOne.equalsIgnoreCase("R"))
         JOptionPane.showMessageDialog(null, "Paper Covers Rock, Player 2 wins!");
      else 
        JOptionPane.showMessageDialog(null, "Scissors Cuts Paper, Player 2 wins!");
      
      
    }
    
  }
