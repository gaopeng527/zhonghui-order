package com.zhonghui.order.dao;

public interface JedisClient {
	
	String get(String key);
	String set(String key, String value);
	String hget(String hkey, String key);
	long hset(String hkey, String key, String value);
	long incr(String key);
	/**
	 * 设置过期时间
	 * @param key
	 * @param seconds
	 * @return
	 */
	long expire(String key, int seconds);
	/**
	 * 获取指定的key的过期时间，不停变化
	 * @param key
	 * @return
	 */
	long ttl(String key);
	long del(String key);
	long hdel(String hkey, String key);
	
}
