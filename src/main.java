
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1styrGroupB
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        App app = new App();
        
        while (true)
        {
            
//          Display menu
          
            switch(app.choice())
            {
//              Add card
                case "1":
                    app.addCard();
                    break;
                    
                    
//              Edit card 
                case "2":
                    app.editCard();
                    break;
                    
                 
//              Remove card
                case "3":
                    app.removeCard();
                    break;
                    
                    
                    
//              View card
                case "4":
                    app.viewCard();
                    break;
                    
//              Try again if invalid choice   
                default:
                    System.out.println("Your choice is invalid. Try Again");
                   
                    
            }
        }
    }
    
}
