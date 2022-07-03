package homeworkoop;

/**
 * Java Pro. Homework OOP
 * @author Alexej Lange
 * @version 30 Jun 2022
 */

public class AthleteRunAndJump {
    public static void main(String[] args) {
        IAthlete[] athletes = {
                new Human(10, 2),
                new Cat(10, 2),
                new Robot(10,2)
        };
        Obstacle[] obstacles = {
                new JoggingTrack(10),
                new Wall(2)
        };

        for (IAthlete athlete : athletes)
            for (Obstacle obstacle : obstacles) {
                obstacle.move(athlete);
            }
    }
}
