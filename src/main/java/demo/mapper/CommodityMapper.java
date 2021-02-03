package demo.mapper;

import demo.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;

@Mapper
@Component
public interface CommodityMapper {

    void insertCommodity(Map<String, String> map);
}
