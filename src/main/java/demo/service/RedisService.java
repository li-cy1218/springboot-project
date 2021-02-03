package demo.service;

/**
 * redis config.
 */
public interface RedisService {

    /**
     * 存储数据.
     * @param key
     * @param value
     */
    void set(String key, String value);

    /**
     * 获取数据.
     * @param key
     */
    String get(String key);

    /**
     * 设置超时时间.
     * @param key
     * @param expire
     */
    boolean expire(String key, Long expire);

    /**
     * 删除数据.
     * @param key
     */
    void remove(String key);

    /**
     * 自增操作.
     * @param key
     * @param delete 自增.
     */
    Long increment(String key, Long delete);
}
