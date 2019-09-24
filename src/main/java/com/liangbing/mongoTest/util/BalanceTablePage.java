package com.liangbing.mongoTest.util;

import java.util.List;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

/**
 * 2019/9/24 下午4:37
 *
 * @author liangbingtian
 */
@Getter
@Setter
public class BalanceTablePage<T> extends PageImpl {

  private long total;

  public BalanceTablePage(List<T> content, Pageable pageable,
      long total) {
    super(content, pageable, total);
  }

}
