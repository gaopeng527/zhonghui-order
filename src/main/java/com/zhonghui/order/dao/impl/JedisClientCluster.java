package com.zhonghui.order.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhonghui.order.dao.JedisClient;

import redis.clients.jedis.JedisCluster;
/**
 * jedis集群版实现类
 * @author DELL
 *
 */
public class JedisClientCluster implements JedisClient {

	@Autowired
	private JedisCluster jedisCluster;
	
	@Override
	public String get(String key) {
		String value = jedisCluster.get(key);
		return value;
	}

	@Override
	public String set(String key, String value) {
		String result = jedisCluster.set(key, value);
		return result;
	}

	@Override
	public String hget(String hkey, String key) {
		String value = jedisCluster.hget(hkey, key);
		return value;
	}

	@Override
	public long hset(String hkey, String key, String value) {
		long result = jedisCluster.hset(hkey, key, value);
		return result;
	}

	@Override
	public long incr(String key) {
		long result = jedisCluster.incr(key);
		return result;
	}

	@Override
	public long expire(String key, int seconds) {
		long result = jedisCluster.expire(key, seconds);
		return result;
	}

	@Override
	public long ttl(String key) {
		long result = jedisCluster.ttl(key);
		return result;
	}

	@Override
	public long del(String key) {
		long result = jedisCluster.del(key);
		return result;
	}

	@Override
	public long hdel(String hkey, String key) {
		long result = jedisCluster.hdel(hkey, key);
		return result;
	}

}
