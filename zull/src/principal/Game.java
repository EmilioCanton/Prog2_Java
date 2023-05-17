package principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kolling and David J. Barnes
 * @version 1.0 (February 2002)
 */

public class  Game 
{
    private Parser parser;
    private Room currentRoom;
        
    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
        Room outside, theatre, pub, lab, office, porao, sotao;
      
        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theatre = new Room("in a lecture theatre");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        porao = new Room("in office porao");
        sotao = new Room("int the office sotao");
        
        // initialise room exits
        lab.setExits(outside, office, null, null, null, null);
        office.setExits(null, null, null, lab, sotao, porao); 
        theatre.setExits(null, null, null, outside, null, null);
        pub.setExits(null, outside, null, null, null, null);
        outside.setExits(null, theatre, lab, pub, null, null);
        porao.setExits(null, null, null, null, office, null);
        sotao.setExits(null, null, null, null, null, office);
        
        outside.addItem("passarinho verde");
        outside.addItem("pedra");
        
        lab.addItem("Computador");
        lab.addItem("Fio desencapado");
        
        office.addItem("Caderno");
        office.addItem("Pacote de folha A4");
        
        theatre.addItem("Giz");
        theatre.addItem("Quadro negro");
        
        pub.addItem("Gelo");
        pub.addItem("Copo");

        porao.addItem("Diário secreto do vandame");
        sotao.addItem("Espelho quebrado");

        
        
        
        
        currentRoom = outside;  // start game outside
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play() 
    {            
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
                
        boolean finished = false;
        while (! finished) {
            Command command;
                        System.out.print("> ");
                        String inputLine = "";
                        
                        BufferedReader reader = 
                            new BufferedReader(new InputStreamReader(System.in));
                        try {
                            inputLine = reader.readLine();
                        }
                        catch(java.io.IOException exc) {
                            System.out.println ("There was an error during reading: "
                                + exc.getMessage());
                        }
                        
                        command = parser.getCommand(inputLine);
			try {
                            finished = processCommand(command);
                        } catch (java.lang.NullPointerException ex){
                            System.err.println("Insira um comando existente:");
                        } 
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to Adventure!");
        System.out.println("Adventure is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
        System.out.println();
        comandoProcurar(currentRoom);
    }

    /**
     * Given a command, process (that is: execute) the command.
     * If this command ends the game, true is returned, otherwise false is
     * returned.
     */
    private boolean processCommand(Command command)
    {
        boolean wantToQuit = false;
/*
        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }
*/
        String commandWord = command.getCommandWord();
        switch (commandWord) {
            case "help": printHelp();
                break;
            case "go": goRoom(command);
                break;
            case "quit": wantToQuit = quit(command);
                break;
            case "procurar": comandoProcurar(currentRoom);
                break;
            case "comer":
                System.out.println("voce comeu e agora nao esta mais com fome");
                break;
            default:
                break;
        }

        return wantToQuit;
    }
    public void comandoProcurar(Room cuurentRoom){
        Room room = cuurentRoom;
        System.out.println("You are " + currentRoom.getDescription());
        System.out.println("Itens encontrados no local:\n" + currentRoom.getItens());
        System.out.print("Exits: ");
        System.out.println(currentRoom.mostraSaidas());

    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        CommandWords palavrasChave = new CommandWords();
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        System.out.println(palavrasChave.mostraPalavras());
    }

    /** 
     * Try to go to one direction. If there is an exit, enter
     * the new room, otherwise print an error message.
     */
    private void goRoom(Command command) 
    {
        if(!command.hasSecondWord()) {
            // if there is no second word, we don't know where to go...
            System.out.println("Go where?");
            return;
        }

        String direction = command.getSecondWord();

        // Try to leave current room.
        Room nextRoom = null;
        if (currentRoom.saidas.containsKey(direction)){
            nextRoom = currentRoom.saidas.get(direction);
        }
        if (nextRoom == null)
            System.out.println("There is no door!");
        else {
            currentRoom = nextRoom;
            comandoProcurar(currentRoom);
        }
    }

    /** 
     * "Quit" was entered. Check the rest of the command to see
     * whether we really quit the game. Return true, if this command
     * quits the game, false otherwise.
     */
    private boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else
            return true;  // signal that we want to quit
    }
}
