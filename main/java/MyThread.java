public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            while (!isInterrupted()){
                Thread.sleep(2500);
                System.out.println("Я поток "+Thread.currentThread().getName()+" Всем привет!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
            System.out.printf("Поток %s завершен\n", Thread.currentThread().getName());
        }
    }
}
