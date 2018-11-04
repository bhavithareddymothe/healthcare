package com.slokam.slokamprm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiseaseDaoInsert extends JpaRepository<Disease1, Integer> {

}
