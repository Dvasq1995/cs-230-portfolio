package com.gamingroom;

import java.util.ArrayList;
import java.util.List;

/**
* A singleton service for the game engine
*/
public class GameService {

   /**
   * A list of the active games
   */
   private static List games = new ArrayList();

   /*
   * Holds the next game identifier
   */
   private static long nextGameId = 1;
  
/*Constructor is private, we have one instance of the object
* to make it a Singleton.
*/
   private static GameService instance = new GameService();
  
   public static GameService getInstance() {
       return instance;
   }
  
/**
   * Construct a new game instance
   *
   * @param name the unique name of the game
   * @return the game instance (new or existing)
   */
   public Game addGame(String name) {

       // a local game instance
       Game game = null;
      
       //to return instance without adding anything else to it.
       for (Game currentGame : games) {
           if (currentGame.getName().equals(name)) {
               return currentGame;
           }
       }
      
       // if not found, make a new game instance and add to list of games
       if (game == null) {
           game = new Game(nextGameId++, name);
           games.add(game);
       }

       // return the new/existing game instance to the caller
       return game;
   }

   /**
   * Returns the game instance at the specified index.
   *


   * Scope is package/local for testing purposes.
   *


   * @param index index position in the list to return
   * @return requested game instance
   */
   Game getGame(int index) {
       return games.get(index);
   }
  
   /**
   * Returns the game instance with the specified id.
   *
   * @param id unique identifier of game to search for
   * @return requested game instance
   */
   public Game getGame(long id) {

       // a local game instance
       Game game = null;

       //Defined list of games
       for (Game currentGame : games) {
           if (currentGame.getId()== id) {
               game = currentGame;
           }
       }
      
       return game;
   }

   /**
   * Returns the game instance with the specified name.
   *
   * @param name unique name of game to search for
   * @return requested game instance
   */
   public Game getGame(String name) {

       // a local game instance
       Game game = null;
      
       //Defined list of games
       for (Game currentGame : games) {
           if (currentGame.getName().equals(name)) {
              
           }
       }
      
       return game;
   }

   /**
   * Returns the number of games currently active
   *
   * @return the number of games currently active
   */
   public int getGameCount() {
       return games.size();
   }
}