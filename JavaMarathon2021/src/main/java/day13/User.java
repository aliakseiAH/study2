package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public User(String name) {
        this.username = name;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user) {
        return (subscriptions.contains(user));
    }

    public boolean isFriend(User user) {
        return this.subscriptions.contains(user)&&
            user.subscriptions.contains(this);

    }
    public void sendMessage(User user, String text) {
        if (isFriend(user)) {
            MessageDatabase.addNewMessage(this, user, text);
        } else System.out.println("We`re not friends");

    }
    public String toString() {
        return this.username;
    }
}
