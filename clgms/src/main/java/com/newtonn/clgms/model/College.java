package com.newtonn.clgms.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="college", schema="clgms")
public class College {

    @Id
    @Column(name="college_code", unique=true, nullable=false)
    private Short collegeCode; //primary key

    @Column(name="college_name", nullable=false)
    private String collegeName;

    @Column(name="district")
    private String district;

    @Column(name="region")
    private String region;

    @Column(name="college_type")
    private String collegeType;
}
