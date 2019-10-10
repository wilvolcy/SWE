package edu.mum.cs.cs425.studentmgmt.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Classroom {
    @Id
    @GeneratedValue
private Long classroomId;
private String buildingName;
private String roomNumber;
@OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL)
private List<Student> students = new ArrayList<Student>();

    public Classroom() {
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setStudents(Student student){
        student.setClassroom(this);
        this.students.add(student);

    }
    public List<Student> getStudents(){
        return this.students;
    }
}

