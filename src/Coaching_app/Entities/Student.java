package Coaching_app.Entities;

import java.util.Objects;

public class Student {
    private Integer studentId;
    private String studentNme;
    private String studentContact;
    private String studentMail;

    public Student(Integer studentId, String studentNme, String studentContact, String studentMail) {
        this.studentId = studentId;
        this.studentNme = studentNme;
        this.studentContact = studentContact;
        this.studentMail = studentMail;
    }
    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentNme() {
        return studentNme;
    }

    public void setStudentNme(String studentNme) {
        this.studentNme = studentNme;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentMail() {
        return studentMail;
    }

    public void setStudentMail(String studentMail) {
        this.studentMail = studentMail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentNme='" + studentNme + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentMail='" + studentMail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
