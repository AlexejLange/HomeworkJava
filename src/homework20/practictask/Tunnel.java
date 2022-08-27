package homework20.practictask;

import static homework20.practictask.Race.CARS_COUNT;
import static homework20.practictask.Race.SEMAPHORE;


public class Tunnel extends Stage {
    protected Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
           try {
               System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
               SEMAPHORE.acquire();
               System.out.println(c.getName() + " начал этап: " + description);
               Thread.sleep(length / c.getSpeed() * 1000L);
           } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
               System.out.println(c.getName() + " закончил этап: " + description);
               SEMAPHORE.release();
           }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

