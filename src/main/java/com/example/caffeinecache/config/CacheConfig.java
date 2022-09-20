package com.example.caffeinecache.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.boot.autoconfigure.cache.CacheType;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@EnableCaching
@Configuration
public class CacheConfig {
    long dddd = 10_2222;

    @Bean
    public Caffeine caffeineConfig() {
        return Caffeine
                .newBuilder()
                .maximumSize(10000) // 캐쉬에 포함할 수 있는 최대 Entries
                .expireAfterWrite(30, TimeUnit.MINUTES); // 자동제거시간 30분 설정
//                .initialCapacity() // 내부 해시 테이블의 최소하늬 크기 설정
//                .maximumWeight() // 캐시에 포함할 수 있는 엔트리의 최대 크기
    }

    @Bean
    public CacheManager cacheManager(Caffeine caffeine) {
        CaffeineCacheManager cacheManager = new CaffeineCacheManager();
        cacheManager.setCaffeine(caffeine);
        return cacheManager;
    }


    /* 모든 캐쉬 적용
    public class CacheTests {
    @Autowired
    CacheManager cacheManager;  // Bean 주입

    @Test
    public void getAllCaches() {

      for (String cacheName : cacheManager.getCacheNames()) {
        log.info(cacheName);
      }

      // or functional
      cacheManager.getCacheNames().forEach(log::info);
    }
}
     */
}
