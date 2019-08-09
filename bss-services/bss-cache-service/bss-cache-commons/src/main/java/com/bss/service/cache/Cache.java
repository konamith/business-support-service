package com.bss.service.cache;

/**
 * 缓存接口
 *
 * @Description 所有缓存的父接口
 * @Author LiuMing
 * @Date 2019-08-09
 */
public interface Cache {

    <T> void put(T object);

    <T, K> T get(K key);
}
