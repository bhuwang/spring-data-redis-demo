/**
 * 
 */
package com.firsthelpfinancial;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author bhuwangautam
 *
 */
public interface RedisRequestCacheRepository extends CrudRepository<RedisRequestCache, String> {

    List<RedisRequestCache> findByIsSync(Integer isSync);

}
