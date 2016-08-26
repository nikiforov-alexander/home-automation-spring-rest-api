package com.teamtreehouse.home.dao;

import com.teamtreehouse.home.model.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomDao
        extends PagingAndSortingRepository<Room, Long>{
}
