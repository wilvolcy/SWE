package edu.mum.cs.cs425.studentmgmt;

import edu.mum.cs.cs425.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.studentmgmt.model.Student;
import edu.mum.cs.cs425.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.studentmgmt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class StudentmgmtApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    public static void main(String[] args) {
        SpringApplication.run(StudentmgmtApplication.class, args);
    }

    public void saveStudent(){

        Transcript transcript = new Transcript();
        transcript.setDegreeTitle("BS Computer Science");

        Classroom classroom = new Classroom();
        classroom.setBuildingName("McLaughlin building");
        classroom.setRoomNumber("M105");


        Student student = new Student();
        student.setStudentNumber("000-61-0001");
        student.setFirstName("Anna");
        student.setMidleName("Lynn");
        student.setLastName("Smith");
        student.setGpa(3.45);
        student.setDateOfEnrollment(LocalDate.of(2019,05,24));
        student.setTranscript(transcript);
        classroom.setStudents(student);
        classroomRepository.save(classroom);
        studentRepository.save(student);

    }
    @Override
    public void run(String... args) throws Exception {
        saveStudent();
    }
}
