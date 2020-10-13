
import java.util.ArrayList;
import java.util.Collections;
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
public class App {
    Scanner input = new Scanner(System.in);
        
    ArrayList<CatalogCard> cat = new ArrayList<>();
    public String choice(){
        System.out.println();
        System.out.println("       ----Card Catalog Options---      ");
        System.out.println("1 - Add Card");
        System.out.println("2 - Edit Card");
        System.out.println("3 - Remove Card");
        System.out.println("4 - View Card/s");
        System.out.print("What do you want to do: ");
        String choice = input.nextLine();
        
        return choice;
        
    }
    

  
    //Method for adding a new card to ArrayList
    public void addCard(){
        CatalogCard card = new CatalogCard(); // Initialize an object card
        System.out.print("Card ID: ");
        card.setCardID(input.nextLine());
        System.out.print("Book Title: ");
        card.setBookTitle(input.nextLine());
        System.out.print("Book Author: ");
        card.setBookAuthor(input.nextLine());
        System.out.print("Year Published: ");
        card.setYearPublished(input.nextLine());
        System.out.print("Publisher: ");
        card.setPublisher(input.nextLine());
        
        cat.add(card); //Adds the card to the list
        
        System.out.println("New card added successfully");
        
    }
    
   
    
    //Method for editing a card in the list
    public void editCard(){
        if (cat.isEmpty()){
            System.out.println("You have no cards to be edited. Add card first."); //Checks if the list is empty
        } else{
            System.out.println("Enter Card ID to edit: "); // Enters a card ID to be edited
            String cardID = input.nextLine();
            String editedCard = "";
            for(int i=0; i<cat.size(); i++){ //Loops in every element in the list
                 if(cardID.equals(cat.get(i).getCardID())){ //Checks if the entered card ID exixts in the list
                     //Enter new inputs
                    System.out.println("New card ID: ");
                    cat.get(i).setCardID(input.nextLine());
                    System.out.println("New Book Title: ");
                    cat.get(i).setBookTitle(input.nextLine());
                    System.out.println("New Book Author: ");
                    cat.get(i).setBookAuthor(input.nextLine());
                    System.out.println("New Year Published: ");
                    cat.get(i).setYearPublished(input.nextLine());
                    System.out.println("New Publisher: ");
                    cat.get(i).setPublisher(input.nextLine());
                    
                    editedCard = "You've edited the card successfully.";

                }  else{
                     editedCard = "Card ID doesn't exists";
 
                 }
            }
            System.out.println(editedCard);
            
        }
    }
    
    
    
   
    //Method to remove card in the list
    public void removeCard(){
        if(cat.isEmpty()){
            System.out.println("You have no cards to be removed. Add cards first."); //Checks if the list is empty
        } else{
                System.out.print("Enter card ID to be removed: "); //Enters a card ID to be removed
                String cardID = input.nextLine();
                String removedCard = "";
                for(int i=0; i<cat.size(); i++){ //Loops in every element in the list
                     if(cardID.equals(cat.get(i).getCardID())){ //Checks if the entered card ID exists in the list
                        cat.remove(cat.get(i)); //Method to remove the specified card in the list
                        removedCard = "You've deleted the card successfully."; 
                     } else{
                           removedCard = "Card ID doesn't exixts";
                     }
                }
                System.out.println(removedCard);

        }
            
    }
    
    
    
   
    //Method for viewing card/s
    public void viewCard(){
        if(cat.isEmpty()){ //Checks if the list is empty
            System.out.println("You have no cards to be viewed. Add cards first.");
        } else{
            //Asks if one card or all cards is to be viewed
            System.out.println("1 - View one card");
            System.out.println("2 - View all cards");
            System.out.print("Enter your choice: ");
            String choice = input.nextLine();
         
          
         
            if(choice.equals("1")){ //Checks if by view one card
                System.out.print("Enter a card ID to be viewed: ");
                String cardID = input.nextLine();
//                input.nextLine();
                String displayCard = "";

                for(int i=0; i<cat.size(); i++){
                   if(cardID.equals(cat.get(i).getCardID())){ //Checks if the entered card ID exists in the list
                        displayCard = "Card ID: " +  cat.get(i).getCardID() + "\n" +
                                              "Book Title: " + cat.get(i).getBookTitle() + "\n" + 
                                              "Book Author: " + cat.get(i).getBookAuthor() + "\n" +
                                              "Year Published: " + cat.get(i).getYearPublished() + "\n" + 
                                              "Publisher:  " + cat.get(i).getPublisher() + "\n";
                   
                   }  else{
                       displayCard = "Card ID doesn't exist";
                   }
                }
                System.out.println(displayCard); 
                
                
            } else if(choice.equals("2")){ //Checks if view all cards
                    Collections.sort(cat);
                    for(int i=0; i<cat.size(); i++){ //Loops in every element in the list
                        System.out.println("Card ID: " + cat.get(i).getCardID() + "\n" + "Book Title: " + cat.get(i).getBookTitle() + "\n" +
                                "Book Author: " + cat.get(i).getBookAuthor() + "\n" + "Year Published: " + cat.get(i).getYearPublished() + "\n" + "Published: "
                                    + cat.get(i).getPublisher());
                        System.out.println("");
                    }
            }   else{
                        System.out.println("No cards to be viewed.");
                }
              }

            
    }
    
}
