public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        ThreadGroup mainGroup = new ThreadGroup("Main");
        ThreadGroup group1 = new ThreadGroup(mainGroup,"Group1");

        final Thread thread1 = new Thread(mainGroup,myThread);
        final Thread thread2 = new Thread(mainGroup,myThread);
        final Thread thread3 = new Thread(mainGroup,myThread);
        final Thread thread4 = new Thread(group1,myThread);

        System.out.println(" \n Создаю потоки : \n");

        thread1.setName("Первый");
        thread2.setName("Второй");
        thread3.setName("Третий");
        thread4.setName("Второстепенный");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        Thread.sleep(7000);
        System.out.println(" \nЗавершаю потоки : ");
        mainGroup.interrupt();

    }
}
