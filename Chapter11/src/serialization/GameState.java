package serialization;

import java.io.Serializable;

/**
 * Created by NewProgrammer on 3/28/15.
 */
public class GameState implements Serializable {

        String playerName;
        int level;
        int score;
        int remainingLives;

    GameState(String playerName, int Level, int score, int remainingLives){
        this.playerName = playerName;
        this.level=level;
        this.score=score;
        this.remainingLives = remainingLives;
    }

    public String toString(){

        return "PlayerName: " + playerName + ", level:" + level +
                ", score: " + score + ", remainingLives: " + remainingLives;

    }
}
