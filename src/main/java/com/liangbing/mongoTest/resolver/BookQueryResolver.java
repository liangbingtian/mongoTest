package com.liangbing.mongoTest.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.liangbing.mongoTest.entity.graphEntity1.Author;
import com.liangbing.mongoTest.entity.graphEntity1.Book;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 2019/9/26 上午9:54
 *
 * @author liangbingtian
 */
@Component
public class BookQueryResolver implements GraphQLQueryResolver {
  public List<Book> findBooks() {
    Author author = Author.builder()
        .id(1)
        .name("Bill Venners")
        .age(40)
        .build();
    Book book = Book.builder()
        .id(1)
        .name("scala")
        .author(author)
        .publisher("电子工业出版社")
        .build();
    List<Book> bookList = new ArrayList<Book>();
    bookList.add(book);
    return bookList;
  }

}
