package observer;

public class Main {

    public static void main(String[] args) {

        User user = new User("Raquel");
        User user2 = new User("Vavs");

        String message = "Oi, essa é a minha primeira música";

        Channel channel = new Channel();

        channel.addNewObserver(user);
        channel.addNewObserver(user2);

        channel.notifyObservers(message);

    }
}
