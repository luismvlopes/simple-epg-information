package com.cycloid.epginfo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "channel")
public class Channel  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private  String name;

    private Integer position;

    private  String category;

}
