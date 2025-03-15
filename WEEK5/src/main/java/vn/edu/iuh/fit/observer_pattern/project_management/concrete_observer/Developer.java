package vn.edu.iuh.fit.observer_pattern.project_management.concrete_observer;


import vn.edu.iuh.fit.observer_pattern.project_management.observer.Observer;

public class Developer implements Observer {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("📌 Lập trình viên " + name + " nhận thông báo: Công việc '"
                + taskName + "' đã thay đổi trạng thái thành " + status);
    }
}

