package lab11;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String channelName;
    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void uploadVideo(String title) {
        System.out.println("{"+ channelName + "} uploaded a new video: " + title);
        notifyObservers(title);
    }

    @Override
    public void addObserver(lab11.Observer observer) {
        if(!observers.contains(observer))
        {
            observers.add(observer);
        }
        else {
            System.out.println("Observer already registered");
        }
    }

    @Override
    public void removeObserver(lab11.Observer observer) {
        if(observers.contains(observer))
        {
            observers.remove(observer);
        }
        else {
            System.out.println("Observer not registered");
        }
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
