package handling;

import java.io.IOException;

public class Prompt {
    public static void main(String[] args) throws InterruptedException, IOException {
        Runtime runtime = Runtime.getRuntime();
        Thread.sleep(5000);
        Process process = runtime.exec("notepad");
    }
    // public static void main(String[] args) {
    //     Runtime runtime = Runtime.getRuntime();
    //     try {
    //         Thread.sleep(5000);
    //         Process process = runtime.exec("notepad");
    //     } catch (IOException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     } catch (InterruptedException e) {
    //         // TODO Auto-generated catch block
    //         e.printStackTrace();
    //     }
    // }
}
