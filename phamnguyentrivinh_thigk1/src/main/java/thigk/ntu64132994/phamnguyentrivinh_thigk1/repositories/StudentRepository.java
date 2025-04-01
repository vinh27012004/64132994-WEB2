package thigk.ntu64132994.phamnguyentrivinh_thigk1.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import thigk.ntu64132994.phamnguyentrivinh_thigk1.models.Student;

@Repository
public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        // Thêm dữ liệu mẫu
        students.add(new Student(1, "John Doe", 101));
        students.add(new Student(2, "Jane Smith", 102));
    }

    public List<Student> findAll() {
        return students;
    }

    public Optional<Student> findById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }

    public void save(Student student) {
        students.add(student);
    }

    public void deleteById(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    public void update(Student updatedStudent) {
        findById(updatedStudent.getId()).ifPresent(student -> {
            student.setName(updatedStudent.getName());
            student.setGroupId(updatedStudent.getGroupId());
        });
    }
}