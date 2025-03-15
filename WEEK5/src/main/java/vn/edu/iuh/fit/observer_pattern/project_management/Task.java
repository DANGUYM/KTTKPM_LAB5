package vn.edu.iuh.fit.observer_pattern.project_management;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private String name;
    private String status;
    private List<TeamMember> observers = new ArrayList<>();

    public Task(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public void addObserver(TeamMember member) {
        observers.add(member);
    }

    public void removeObserver(TeamMember member) {
        observers.remove(member);
    }

    public void setStatus(String newStatus) {
        this.status = newStatus;
        notifyTeamMembers();
    }

    private void notifyTeamMembers() {
        for (TeamMember member : observers) {
            member.update(name, status);
        }
    }
}
