public class runnable {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run(){
                System.out.println("Runnable using anonymous class");
            }
        };
        r.run();
    }
}
