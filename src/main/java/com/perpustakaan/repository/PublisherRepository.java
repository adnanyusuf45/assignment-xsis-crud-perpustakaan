package com.perpustakaan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.perpustakaan.entity.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
