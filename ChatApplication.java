class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            System.out.println("Sender started");
            try {
                Thread.sleep(500);
                System.out.println("Sending message...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Sender finished");
        }
    }

    static class Receiver extends Thread {
        public void run() {
            System.out.println("Receiver started");
            try {
                Thread.sleep(500);
                System.out.println("Receiving message...");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Receiver finished");
        }
    }

    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        sender.start();
        receiver.start();

        System.out.println("Thread states:");
        System.out.println("Sender: " + sender.getState());
        System.out.println("Receiver: " + receiver.getState());
    }
}