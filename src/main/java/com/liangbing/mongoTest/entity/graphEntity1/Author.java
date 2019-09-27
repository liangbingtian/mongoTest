package com.liangbing.mongoTest.entity.graphEntity1;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 2019/9/24 下午5:15
 *
 * @author liangbingtian
 */
@Document(collection = "author")
@Getter
@Setter
@Builder
public class Author {

  @Id
  private Integer id;
  private String name;
  private Integer age;

}
