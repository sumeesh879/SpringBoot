package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sumeesh on 05/04/17.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
