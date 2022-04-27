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
        return false;
    }

    public void createChannel(ChannelDto channel) {

    }
}
