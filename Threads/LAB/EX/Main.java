public class Main {
    public static void main(String[] args) {
      
        Temperatura1 temp1 = new Temperatura1();
        Thread t1 = new Thread(temp1);
        t1.start();

        Temperatura2 temp2 = new Temperatura2();
        Thread t2 = new Thread(temp2);
        t2.start();

        Temperatura3 temp3 = new Temperatura3();
        Thread t3 = new Thread(temp3);
        t3.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("FINAL OU INICIO?");
        }
    }
}
