package demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    public void testRedisTemplate() {
        // 获取用来操作String类型数据的valueOperations对象
        ValueOperations<String, String> operations = redisTemplate.opsForValue();

        // 借助valueOperations对象存入数据
        String key = "hello";
        String value = "morning";
        operations.set(key, value);

        // 尝试读取刚才设置的数据
        String readValue = operations.get(key);
        System.out.println(readValue);

    }
}
