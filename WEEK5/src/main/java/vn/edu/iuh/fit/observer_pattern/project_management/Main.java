package vn.edu.iuh.fit.observer_pattern.project_management;

import vn.edu.iuh.fit.observer_pattern.project_management.concrete_observer.Developer;
import vn.edu.iuh.fit.observer_pattern.project_management.subject.Task;

public class Main {
    public static void main(String[] args) {
        Task task = new Task("Phát triển API", "To Do");

        Developer dev1 = new Developer("John");
        Developer dev2 = new Developer("Emma");

        task.attach(dev1);
        task.attach(dev2);

        System.out.println("Thay đổi trạng thái công việc...");
        task.setStatus("In Progress");
        task.setStatus("Completed");
    }
}
