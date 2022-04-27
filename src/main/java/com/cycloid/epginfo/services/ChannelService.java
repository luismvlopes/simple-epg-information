package com.cycloid.epginfo.services;

import com.cycloid.epginfo.dtos.ChannelDto;
import com.cycloid.epginfo.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChannelService {

    @Autowired
    private ChannelRepository channelRepo;

    public boolean isValid(ChannelDto channel) {
        // create validator of ChannelDto fields
        return true;
    }

    public void createChannel(ChannelDto channel) {
        // persist new Dto in the DB

    }
}
