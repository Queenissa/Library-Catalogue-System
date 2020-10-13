/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1styrGroupB
 */
public class CatalogCard implements Comparable <CatalogCard>  {
    private String cardID;
    private String bookTitle;
    private String bookAuthor;
    private String yearPublished;
    private String publisher;
    
    public String getCardID(){
        return cardID;
    }
    
    public void setCardID(String cardID){
        this.cardID = cardID;
    }
    
    public String getBookTitle(){
        return bookTitle;
    }
    
    public void setBookTitle(String bookTitle){
        this.bookTitle = bookTitle;
    }
    
    public String getBookAuthor(){
        return bookAuthor;
    }
    
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
    
    public String getYearPublished(){
        return yearPublished;
    }
    
    public void setYearPublished(String yearPublished){
        this.yearPublished = yearPublished;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    @Override
    public int compareTo(CatalogCard o) {
       return this.getCardID().compareTo(o.getCardID());
    }
    
}
