package com.ldh.dao;

import com.ldh.entity.LoginInfo;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: ldh Created on 2018/8/9
 */
@Repository
@Primary
public interface LoginRepository extends ReactiveMongoRepository<LoginInfo,Long> {
}