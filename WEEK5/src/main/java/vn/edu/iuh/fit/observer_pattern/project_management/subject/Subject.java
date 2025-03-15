package vn.edu.iuh.fit.observer_pattern.project_management.subject;

import vn.edu.iuh.fit.observer_pattern.project_management.observer.Observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}
