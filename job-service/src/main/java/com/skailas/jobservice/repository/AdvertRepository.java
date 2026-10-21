package com.skailas.jobservice.repository;

import com.skailas.jobservice.enums.Advertiser;
import com.skailas.jobservice.model.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepository extends JpaRepository<Advert, String> {
    List<Advert> getAdvertsByUserIdAndAdvertiser(String id, Advertiser advertiser);
}
