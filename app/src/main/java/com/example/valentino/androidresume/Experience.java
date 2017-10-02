package com.example.valentino.androidresume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentino on 1/24/17.
 */

public class Experience {
  private String company;
  private String title;
  private String date;
  private String location;
  private List<String> description;

  Experience(String company, String title, String date, String location, String... descriptions) {
    this.company = company;
    this.title = title;
    this.date = date;
    this.location = location;
    this.description = new ArrayList<String>();
    for (String d : descriptions) {
      this.description.add(d);
    }
  }

  String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public List<String> getDescription() {
    return description;
  }

  public void setDescription(List<String> description) {
    this.description = description;
  }
}
