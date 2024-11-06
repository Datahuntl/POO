public class Main {
    public static void main(String[] args) {

        Contador1 cont1 = new Contador1();
        Thread t1 = new Thread(cont1);
        t1.setPriority(2);
        t1.start();

        Contador2 cont2 = new Contador2();
        Thread t2 = new Thread(cont2);
        t2.setPriority(1);
        t2.start();

        Contador3 cont3 = new Contador3();
        cont3.setPriority(10);
        cont3.start();

        System.out.println("TESTE MAIN");

        /**
         * Não é guarantido qual thread é executado antes
         * Nem o print do "TESTE MAIN" se sabe se ele vai
         * aparecer antes ou depois da thread
         *
         * Mesmo usando o SetPriority, ainda não é 100%
         * certo se eles vão guarantir o esperado
         */

    }
}
