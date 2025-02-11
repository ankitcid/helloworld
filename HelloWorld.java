public class HelloWorld extends TimerTask {
    public void run() {
       System.out.println("Hello World!"); 
    }
}

Timer timer = new Timer();
timer.schedule(new HelloWorld(), 0, 5000);
