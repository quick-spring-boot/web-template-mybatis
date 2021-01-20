package com.github.huifer.cache;

/**
 * @author huifer
 */
public class CacheKey {

  /**
   * 用户对象的缓存, redis数据类型 map<br/> key: user#id<br/> value: user<br/>
   */
  public static final String USER_MAP = "template:user";

  private CacheKey() {
    throw new IllegalStateException("this utils");
  }
}
