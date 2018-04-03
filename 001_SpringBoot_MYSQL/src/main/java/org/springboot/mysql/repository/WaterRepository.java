package org.springboot.mysql.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.springboot.mysql.entity.UseWater;

@EnableJpaRepositories("org.springboot.mysql.repository")
public interface WaterRepository extends CrudRepository <UseWater, Integer>{
	
	

}
