class Restaurant {
    private boolean foodReady = false;

    synchronized void prepareFood() {
        try {
            while (foodReady) {
                wait();
            }
            System.out.println("Chef prepared food");
            foodReady = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void serveFood() {
        try {
            while (!foodReady) {
                wait();
            }
            System.out.println("Waiter served food");
            foodReady = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        Thread chef = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                r.prepareFood();
            }
        });

        Thread waiter = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                r.serveFood();
            }
        });

        chef.start();
        waiter.start();
    }
}