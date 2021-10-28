/**
 * 
 */
package com.springredisdemo;

import java.util.Map;

/**
 * @author bhuwangautam
 *
 */
public interface IRedisRequestCacheDao {

    void save(RedisRequestCache redisRequestCache, String hashReference);

    void saveAll(Map<String, RedisRequestCache> map, String hashReference);

    RedisRequestCache findOne(String id, String hashReference);

    void update(RedisRequestCache redisRequestCache, String hashReference);

    Map<String, RedisRequestCache> findAll(String hashReference);

    void delete(String requestId, String hashReference);

}
