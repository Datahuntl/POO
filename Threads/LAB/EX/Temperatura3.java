import java.util.Random;

public class Temperatura3 implements Runnable{

    Random rand = new Random();
    int rand_temp = rand.nextInt(30,40);

    @Override
    public void run()
    {
        do
        {
            rand_temp = rand.nextInt(30,41);
            System.out.println("TEMP3: " + rand_temp);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        while(rand_temp != 40);

    }
}
