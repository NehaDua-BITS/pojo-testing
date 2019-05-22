package com.sams.membership.nextgen.pojotesting;

import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

public class Person
{
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String fullName;
    private String givenNameOne;
    private String givenNameTwo;
    private String givenNameThree;
    private String namePrefix;
    private String nameSuffix;
    private LocalDate deceasedDate;

    public Person(String firstName, String middleInitial, String lastName, String fullName, String givenNameOne, String givenNameTwo, String givenNameThree) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.fullName = fullName;
        this.givenNameOne = givenNameOne;
        this.givenNameTwo = givenNameTwo;
        this.givenNameThree = givenNameThree;
    }

    public Person(String firstName, String middleInitial, String lastName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
        //return namePrefix;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        //this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGivenNameOne() {
        return givenNameOne;
    }

    public void setGivenNameOne(String givenNameOne) {
        this.givenNameOne = givenNameOne;
    }

    public String getGivenNameTwo() {
        return givenNameTwo;
    }

    public void setGivenNameTwo(String givenNameTwo) {
        this.givenNameTwo = givenNameTwo;
    }

    public String getGivenNameThree() {
        return givenNameThree;
    }

    public void setGivenNameThree(String givenNameThree) {
        this.givenNameThree = givenNameThree;
    }

    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public void setNameSuffix(String nameSuffix) {
        this.nameSuffix = nameSuffix;
    }

    public LocalDate getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(LocalDate deceasedDate) {
        this.deceasedDate = deceasedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(middleInitial, person.middleInitial) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(fullName, person.fullName) &&
                Objects.equals(givenNameOne, person.givenNameOne) &&
                Objects.equals(givenNameTwo, person.givenNameTwo) &&
                Objects.equals(givenNameThree, person.givenNameThree) &&
                Objects.equals(namePrefix, person.namePrefix) &&
                Objects.equals(nameSuffix, person.nameSuffix) &&
                Objects.equals(deceasedDate, person.deceasedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleInitial, lastName, fullName, givenNameOne, givenNameTwo, givenNameThree, namePrefix, nameSuffix, deceasedDate);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Person.class.getSimpleName() + "[", "]")
                .add("firstName=" + firstName + "")
                .add("middleInitial=" + middleInitial + "")
                .add("lastName=" + lastName + "")
                .add("fullName=" + fullName + "")
                .add("givenNameOne=" + givenNameOne + "")
                .add("givenNameTwo=" + givenNameTwo + "")
                .add("givenNameThree=" + givenNameThree + "")
                .add("namePrefix=" + namePrefix + "")
                .add("nameSuffix=" + nameSuffix + "")
                .add("deceasedDate=" + deceasedDate)
                .toString();
    }
}
