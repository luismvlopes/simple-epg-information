package com.cycloid.epginfo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "program")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    // associate with channel id entity
    private  String channelId;

    private String imageUrl;

    private  String title;

    private String description;

    private Date startTime;

    private Date endTime;

}
