package com.test.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.store.model.*;

public interface MobileNumberRepository extends JpaRepository<MobileNumber, Long> {}