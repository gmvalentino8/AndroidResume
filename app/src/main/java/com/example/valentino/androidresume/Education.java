package com.example.valentino.androidresume;

/**
 * Created by Valentino on 1/24/17.
 */

public class Education {
  private String school;
  private String degree;
  private String dates;
  private String location;
  private double gpa;

  Education(String school, String degree, String dates, String location, double gpa) {
    this.school = school;
    this.degree = degree;
    this.dates = dates;
    this.location = location;
    this.gpa = gpa;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getDates() {
    return dates;
  }

  public void setDates(String dates) {
    this.dates = dates;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }
}
