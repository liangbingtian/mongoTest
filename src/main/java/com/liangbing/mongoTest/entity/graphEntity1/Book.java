package com.liangbing.mongoTest.entity.graphEntity1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 2019/9/24 下午5:16
 *
 * @author liangbingtian
 */
@Document(collection = "book")
@Getter
@Setter
@Builder
public class Book {

  @Id
  private Integer id;
  private String name;
  private Author author;
  private String publisher;

}
