package com.company.controller;

/**
 * Created by Vlad Ulitin on 07.07.2021.
 */
public interface Regular {
    String namePattern="[A-Z][a-z]{2,}";
    String namePatternUA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}$";
    String surnamePattern="[A-Z][a-z]{2,}";
    String surnamePatternUA = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}$";
    String loginPattern="^[A-Za-z0-9_-]{3,16}$";
    String middleNamePattern="[A-Z][a-z]{2,}";
    String getMiddleNamePatternUA="^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}$";
    String emailPattern="[A-Za-z0-9-_]+(@gmail.com|@ukr.net)";
    String сityPattern="[A-Z][a-z]{2,}";
    String streetPattern="[A-Z][a-z]{2,}[-]*[A-Z]*[a-z]*";
    String indexPattern="[0-9]{3,}";
}
