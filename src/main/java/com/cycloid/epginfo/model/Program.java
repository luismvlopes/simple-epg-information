package com.cycloid.epginfo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private  String channelId;

    private String imageUrl;

    private  String title;

    private String description;

    private Date startTime;

    private Date endTime;

}
