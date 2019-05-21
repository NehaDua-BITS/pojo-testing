package com.sams.membership.nextgen.pojotesting.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

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
}
