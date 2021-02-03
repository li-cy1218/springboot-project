package demo.service;

import demo.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CommodityService {

    private CommodityMapper commodityMapper;

    @Autowired
    public void setCommodityMapper(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }

    public int addCommodity(Map<String, String> map) {
        commodityMapper.insertCommodity(map);
        return 1;
    }
}
