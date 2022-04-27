package com.cycloid.epginfo.repository;

import com.cycloid.epginfo.model.Channel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends CrudRepository<Channel, Long> {

}
