public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            while (!isInterrupted()){
                Thread.sleep(2500);
                System.out.println("� ����� "+Thread.currentThread().getName()+" ���� ������!");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally{
            System.out.printf("����� %s ��������\n", Thread.currentThread().getName());
        }
    }
}
