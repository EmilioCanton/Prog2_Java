package principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
 * Class Room - a room in an adventure game.
 *
 * This class is the main class of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  The exits are labelled north, 
 * east, south, west.  For each direction, the room stores a reference
 * to the neighboring room, or null if there is no exit in that direction.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

public class Room 
{
    
    private final String description;
    Map<String,Room> saidas = new HashMap<>();
    String [] itens = new String[4];
    int maxiten = 0;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description
     */
    public Room(String description) 
    {
        this.description = description;
    }

    /**
     * Define the exits of this room.  Every direction either leads
     * to another room or is null (no exit there).
     */
    public void setExits(Room north, Room east, Room south, Room west, Room up, Room down)
    {
        saidas.put( "north", north);
        saidas.put( "east", east);
        saidas.put( "south", south);
        saidas.put( "west", west);
        saidas.put( "up", up);
        saidas.put( "down", down);
    }
    public String mostraSaidas(){
        String todassaidas = "";
        for(String key: saidas.keySet()){
            todassaidas = todassaidas + key + " ";
        }
        
        return todassaidas;
    }
    public void addItem(String itemad){
        if (maxiten<4){
            itens[maxiten] = itemad;
            maxiten ++;
        }     
    }
    
    /**
     * Return the description of the room (the one that was defined
     * in the constructor).
     */
    public String getDescription()
    {
        return description;
    }
    
    public String getItens(){
        String todositens = "";
        for(String item: itens){
            if (item != null){
                todositens = todositens + item + "  ";
            } 
        }
        return todositens;
    }

}
