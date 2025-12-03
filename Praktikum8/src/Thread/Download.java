package Thread;

class DownloadTask extends Thread {
    private String fileName;

    DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 10; i <= 100; i += 10) {
            try {
                Thread.sleep(500);  
                System.out.println(fileName + " progress: " + i + "%");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileName + " selesai diunduh!");
    }
}

public class Download {
    public static void main(String[] args) {
        System.out.println("Downloading...");

        
        DownloadTask task1 = new DownloadTask("File-1");
        DownloadTask task2 = new DownloadTask("File-2");
        DownloadTask task3 = new DownloadTask("File-3");

        task1.start();
        task2.start();
        task3.start();

        try {
            task1.join();
            task2.join();
            task3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Semua file selesai diunduh!");
 
        System.out.println("\nStatus akhir:");
        System.out.println("Thread-0: " + task1.getState());
        System.out.println("Thread-1: " + task2.getState());
        System.out.println("Thread-2: " + task3.getState());
    }
}
