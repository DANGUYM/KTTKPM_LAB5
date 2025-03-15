package vn.edu.iuh.fit.observer_pattern.project_management;

public class Developer implements TeamMember {
    private String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String newStatus) {
        System.out.println(name + " nhận thông báo: Công việc '" + taskName + "' đã chuyển sang trạng thái: " + newStatus);
    }
}
