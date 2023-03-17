package Coaching_app.Entities;

import java.util.Objects;

public class Teachers {
    private Integer teacherId;
    private String teacherName;
    private Integer teacherContact;
    private String teacherEmail;

    public Teachers() {
    }

    public Teachers(Integer teacherId, String teacherName, Integer teacherContact, String teacherEmail) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherContact = teacherContact;
        this.teacherEmail = teacherEmail;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getTeacherContact() {
        return teacherContact;
    }

    public void setTeacherContact(Integer teacherContact) {
        this.teacherContact = teacherContact;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherContact=" + teacherContact +
                ", teacherEmail='" + teacherEmail + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teachers teachers = (Teachers) o;
        return Objects.equals(teacherId, teachers.teacherId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId);
    }
}
