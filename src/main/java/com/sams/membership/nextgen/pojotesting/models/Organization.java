package com.sams.membership.nextgen.pojotesting.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter @Setter
public class Organization
{
    private UUID id;
    private String businessLegalName;
    private String tradeStyleName;
    private String businessLogoReference;
    private String type;
    private String baseCode;
    private String baseCodeDescription;
    private String businessLineCode;
    private String businessType;
    private String businessTypeCode;
    private List<String> taxExemptDocuments;
    private Boolean isCashOnly;
    private String preferredLanguage;
    private String preferredLanguageCode;
    private Boolean isConfidential;
    private Boolean isAdditionalInfoRequired;
    private Boolean canAcceptCheck;
    private String ownershipType;
    private String yearStarted;
    private String totalNumberOfEmployees;
    private String totalRevenue;
    private String isOutOfBusiness;
    private List<String> socialProfiles;
    private List<String> restrictedResellerInfo;
    private List<UUID> memberships;

}
