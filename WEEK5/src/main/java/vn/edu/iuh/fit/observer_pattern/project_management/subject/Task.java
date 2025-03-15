package vn.edu.iuh.fit.observer_pattern.project_management.subject;

import vn.edu.iuh.fit.observer_pattern.project_management.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private String name;
    private String status;
    private List<Observer> teamMembers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public void attach(Observer observer) {
        teamMembers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        teamMembers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : teamMembers) {
            observer.update(name, status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}
