package com.ldh.dao;

import com.ldh.entity.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: ldh Created on 2018/8/7
 */
@Repository
@Primary
public interface PersonRepository extends ReactiveMongoRepository<Person, Long> {
}