package com.example.yami.entity;

import javax.persistence.*;

@Entity
@Table(name = "STUFF_BASE")
public class Stuff extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUFF_NO")
    private Double stuff_no;

    @Column(name = "STUFF_NAME")
    private Double stuff_name;

    @Column(name = "STUFF_DESC")
    private Double stuff_desc;

    @Column(name = "USE_YN")
    private Double use_yn;

    @Column(name = "INFO_VAL1")
    private Double info_val1;

    @Column(name = "INFO_VAL2")
    private Double info_val2;

    @Column(name = "INFO_VAL3")
    private Double info_val3;

    @Column(name = "IMG_PATH")
    private Double img_path;

    @Column(name = "IMG_FILENAME")
    private Double img_filename;


}
