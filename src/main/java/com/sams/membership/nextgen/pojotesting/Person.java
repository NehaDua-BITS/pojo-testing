package com.sams.membership.nextgen.pojotesting;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;
import java.util.StringJoiner;

@Getter @Setter
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
    private Boolean isResident;
    private Boolean isCashOnly;

    public Person(String nameSuffix, LocalDate deceasedDate, Boolean isResident, Boolean isCashOnly) {
        this.nameSuffix = nameSuffix;
        this.deceasedDate = deceasedDate;
        this.isResident = isResident;
        this.isCashOnly = isCashOnly;
    }

    public Person(String firstName, String middleInitial, String lastName, String fullName) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.fullName = fullName;
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
                Objects.equals(deceasedDate, person.deceasedDate) &&
                Objects.equals(isResident, person.isResident) &&
                Objects.equals(isCashOnly, person.isCashOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleInitial, lastName, fullName, givenNameOne, givenNameTwo, givenNameThree, namePrefix, nameSuffix, deceasedDate, isResident, isCashOnly);
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
                .add("isResident=" + isResident)
                .add("isCashOnly=" + isCashOnly)
                .toString();
    }
}
