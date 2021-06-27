package com.gamingroom;

/**

* A class to test a singleton's behavior

*

*/

public class SingletonTester {

public void testSingleton() {

System.out.println("\nAbout to test the singleton...");

//references the instance in singleton GameService

GameService service = GameService.getInstance();

// a simple for loop to print the games

for (int i = 0; i < service.getGameCount(); i++) {

System.out.println(service.getGame(i));

}

}

}