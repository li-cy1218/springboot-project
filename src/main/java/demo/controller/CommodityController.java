package demo.controller;

import demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/commodity")
public class CommodityController {

    private CommodityService commodityService;

    @Autowired
    public void setCommodityService(CommodityService commodityService) {
        this.commodityService = commodityService;
    }

    @RequestMapping("addCommodity")
    public int addNewCommodityDetail(@RequestBody Map<String, String> map) {
        return commodityService.addCommodity(map);
    }
}
