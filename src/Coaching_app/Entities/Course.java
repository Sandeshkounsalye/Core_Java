package Coaching_app.Entities;

import java.util.Objects;

public class Course {
    private Integer courseId;
    private String courseName;
    private String courseDuration;
    private Integer courseFee;

    public Course() {
    }

    public Course(Integer courseId, String courseName, String courseDuration, Integer courseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFee = courseFee;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public Integer getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(Integer courseFee) {
        this.courseFee = courseFee;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseFee=" + courseFee +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
}
