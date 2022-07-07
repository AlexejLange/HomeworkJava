package homeworkoop;

/**
 * Java Pro. Homework OOP
 * @author Alexej Lange
 * @version 07 Jul 2022
 */

public class AthleteRunAndJump {
    public static void main(String[] args) {
        IAthlete[] athletes = {
                new Human("Anton", 3000, 1.5f),
                new Human("Anna", 2000, 1.6f),
                new Cat("Tom",1000, 3),
                new Robot("Terminator",10000,5.9f)
        };
        IObstacle[] obstacles = {
                new JoggingTrack(1500),
                new Wall(1.6f)
        };

        for (IAthlete athlete : athletes) {
            System.out.println(athlete);
            for (IObstacle obstacle : obstacles) {
                if (!obstacle.move(athlete)) {
                    break;
                }
            }
        }
    }
}
