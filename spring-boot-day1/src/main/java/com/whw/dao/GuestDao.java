package com.whw.dao;

import com.whw.bean.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestDao extends JpaRepository<Guest,Long> {
}
