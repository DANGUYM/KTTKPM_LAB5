package vn.edu.iuh.fit.observer_pattern.project_management;

public class ProjectTaskObserverDemo {
    public static void main(String[] args) {
        Task task1 = new Task("Phát triển API", "To Do");

        TeamMember dev1 = new Developer("Lê Văn C");
        TeamMember dev2 = new Developer("Phạm Thị D");

        task1.addObserver(dev1);
        task1.addObserver(dev2);

        // Cập nhật trạng thái công việc -> Thông báo sẽ được gửi đến các thành viên
        task1.setStatus("In Progress");
        task1.setStatus("Completed");
    }
}
