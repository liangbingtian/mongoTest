package com.liangbing.mongoTest.repository;

import com.liangbing.mongoTest.entity.graphEntity1.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 2019/9/24 下午8:29
 *
 * @author liangbingtian
 */
public interface AuthorRepository extends MongoRepository<Author, String> {

}
