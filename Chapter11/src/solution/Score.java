package solution;

import java.io.Serializable;
import java.time.LocalDateTime;

class Score implements Serializable {
    String name;
    int score;
    LocalDateTime dateTime;

    Score(String name, int score, LocalDateTime dateTime){
        this.name=name;
        this.score=score;
        this.dateTime=dateTime;
    }

    public String toString(){
        return name + " scored " + score + " on " + dateTime;
    }
}