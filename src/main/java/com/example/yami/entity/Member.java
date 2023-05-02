package com.example.yami.entity;


import javax.persistence.*;

@Entity
@Table(name = "MBR_BASE")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MBR_NO")
    private Double mbr_no;

    @Column(name = "LOGIN_ID")
    private String login_id;
    @Column(name = "NAME")
    private String name;

    @Column(name = "MBR_PW")
    private String mbr_pw;

    @Column(name = "MBR_PHONE")
    private String mbr_phone;

    @Column(name = "MBR_EMAIL")
    private String mbr_email;

    @Column(name = "MBR_BIRTH")
    private String mbr_birth;

    @Column(name = "MBR_GRADE_CD")
    private String mbr_grade_cd;

    @Column(name = "JOIN_CD")
    private String join_cd;

    @Column(name = "CNCL_DT")
    private String cncl_dt;

    @Column(name = "CNCL_CD")
    private String cncl_cd;



}
