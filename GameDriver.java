import java.util.*;

class GameDriver {
    int turn = 0;
    // private List<Observer> observers = new ArrayList<>();

    public static void main(String[] args) {
        GameDriver game = new GameDriver();
        Player player1 = new Player('r');
        Player player2 = new Player('b');
        Board b = new Board(2);
        boolean play = true;
        
        Logger logger = Logger.getInstance(game.turn);
        logger.update("Turn 0: Setup Board");
        logger.closeLogFile();
         
        while(play){
            game.turn++;

            logger = Logger.getInstance(game.turn);
            String t = "Turn " + game.turn;
            logger.update(t);

            logger.update(player1.turn(b));
            logger.update(player2.turn(b));

            logger.closeLogFile();

            // System.out.print(game.turn);

            if(game.turn > 10) break; //to stop inf loop for now
        }
    }

    // public void setup(int numPlayers){
    //     Board b = new Board(numPlayers);
    // }
    
    // public void addObserver(Observer observer) {
    //     observers.add(observer);
    // }
    // public void addObserver(Observer observer) {
    //     observers.add(observer);
    // }

    // public void removeObserver(Observer observer) {
    //     this.observers.remove(observer);
    // }

    // @Override
    // public void notifyObservers(Event event) {
    //     for (Observer observer : observers) {
    //         observer.update(event);
    //     }
    // }
}