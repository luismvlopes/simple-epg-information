package com.cycloid.epginfo.controllers;

import com.cycloid.epginfo.dtos.ChannelDto;
import com.cycloid.epginfo.services.ChannelService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChannelController {

    @Autowired
    private ChannelService channelService;

    // create a channel
    @PostMapping(value = "/channels/create")
    public ResponseEntity<String> createChannel(@RequestBody ChannelDto channel) {
        if (channelService.isValid(channel)) {
            channelService.createChannel(channel);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    // provides all channels

}
