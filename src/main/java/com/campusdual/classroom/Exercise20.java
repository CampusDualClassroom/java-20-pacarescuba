package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

  public static List<Person> getPeopleList() {
    ArrayList<Person> arrayList = new ArrayList<Person>();
    arrayList.add(new Person("John", "Smith"));
    arrayList.add(new Teacher("María", "Montessori", "Educación"));
    arrayList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
    arrayList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));
    return arrayList;
  }

  public static void showPeopleDetails(List<Person> stringList) {
    for (Person person : stringList) {
      person.getDetails();
    }
  }

  public static void main(String[] args) {
    showPeopleDetails(getPeopleList());
  }
}
