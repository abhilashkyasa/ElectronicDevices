package com.example.ElectronicsDevices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface 
ElectronicsRepository extends JpaRepository<Electronics,Integer>{
	Electronics findByName (String name);
}


