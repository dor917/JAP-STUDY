package com.example.yami.entity;

import javax.persistence.*;

@Entity
@Table(name = "RCP_BASE")
public class Recipe extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RCP_NO")
    private Double rcp_no;

    @Column(name = "RCP_NAME")
    private Double rcp_name;

    @Column(name = "RCP_DESCRIPTION")
    private Double rcp_description;

}
