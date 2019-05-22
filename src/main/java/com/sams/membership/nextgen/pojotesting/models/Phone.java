package com.sams.membership.nextgen.pojotesting.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Phone
{
    private String phoneNumber;
    private String displayedPhoneNumber;
    private Integer countryCode;
    private Integer areaCode;
    private Integer exchangeCode;
    private Integer number;
    private String extension;
    private String textVerified;
    private Boolean isOkayToContact;

}
