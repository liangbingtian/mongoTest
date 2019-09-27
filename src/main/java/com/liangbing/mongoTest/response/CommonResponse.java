package com.liangbing.mongoTest.response;

import lombok.Getter;
import lombok.Setter;

/**
 * 2019/9/24 下午4:55
 *
 * @author liangbingtian
 */
@Getter
@Setter
public class CommonResponse<T> implements ICommonResponse{

  private String code;

  private String message;

  private T data;

  private CommonResponse(String code, String message, T data) {
    this.code = code;
    this.message = message;
    this.data = data;
  }

  public static <T> CommonResponse<T> genSuccessResult(T data) {
    return new CommonResponse<>(SUCCESS_CODE, SUCCESS_MSG, data);
  }

}
