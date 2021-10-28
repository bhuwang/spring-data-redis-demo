/**
 * 
 */
package com.firsthelpfinancial;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author bhuwangautam
 *
 */

@Component
public class RedisDaoRunnerRepo implements CommandLineRunner {

    @Autowired
    private RedisRequestCacheRepository redisRequestCacheRepository;

    @Override
    public void run(String... args) throws Exception {

        // save
        redisRequestCacheRepository
                .save(new RedisRequestCache("101", "POST", "test1", "{}", new Date(), null, null, null, null, null, null, null, null));

        redisRequestCacheRepository
                .save(new RedisRequestCache("102", "POST", "test2", "{}", new Date(), null, null, null, null, null, null, null, null));

        redisRequestCacheRepository
                .save(new RedisRequestCache("103", "POST", "test3", "{}", new Date(), null, null, null, null, null, null, null, null));

        redisRequestCacheRepository
                .save(new RedisRequestCache("104", "POST", "test4", "{}", new Date(), null, 0, null, null, null, null, null, null));

        redisRequestCacheRepository
                .save(new RedisRequestCache("105", "POST", "test5", "{}", new Date(), null, 0, null, null, null, null, null, null));

        redisRequestCacheRepository
                .save(new RedisRequestCache("106", "POST", "test6", "{}", new Date(), null, 1, null, null, null, null, null, null));

        Iterable<RedisRequestCache> allKeys = redisRequestCacheRepository.findAll();

        System.out.println("Find All:::\n");
        for (RedisRequestCache redis : allKeys) {
            System.out.println(redis);
        }

        System.out.println("Find by Id:::\n");
        Optional<RedisRequestCache> result = redisRequestCacheRepository.findById("101");
        System.out.println("for id 101: " + result.get());

        System.out.println("Find if isSync is 0 :::\n");
        List<RedisRequestCache> allNotSynced = redisRequestCacheRepository.findByIsSync(0);
        for (RedisRequestCache redis : allNotSynced) {
            System.out.println("all not synced: " + redis);
        }

        System.out.println("Find if isSync is 1 :::\n");
        List<RedisRequestCache> allSynced = redisRequestCacheRepository.findByIsSync(1);
        for (RedisRequestCache redis : allSynced) {
            System.out.println("all synced: " + redis);
        }

    }
}
