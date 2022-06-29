package homeworkoop;

/**
 * Java Pro. Homework OOP
 * @author Alexej Lange
 * @version 30 Jun 2022
 */

public class AthleteRunAndJump {
    public static void main(String[] args) {
        IAthlete[] athletes = {new Human(), new Cat(),new Robot()};
        Obstacle[] obstacles = {new JoggingTrack(10), new Wall(2)};
    }
}
