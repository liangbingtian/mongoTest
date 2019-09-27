package com.liangbing.mongoTest.repository;

import com.liangbing.mongoTest.entity.graphEntity1.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 2019/9/24 下午8:32
 *
 * @author liangbingtian
 */
public interface BookRepository extends MongoRepository<Book, String> {

}
