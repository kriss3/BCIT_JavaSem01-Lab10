
/**
 * Write a description of class Card here.
 * 
 * @author Krzysztof Szczurowski
 * @version 1.1
 * @since 12/02/2015      
 * @see https://learn.bcit.ca/d2l/le/content/331960/viewContent/2135678/View
 */
public class Card
{
    private String suit;
    private String description;
    
    public Card()
    {
        
    }
    
    public String getSuit()
    {   
        return this.suit;
    }
    
    public void setSuit(String value)
    {
        this.suit = value;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setDescription(String value)
    {
        this.description = value;
    }
}
