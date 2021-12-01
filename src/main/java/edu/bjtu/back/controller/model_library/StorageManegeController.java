package edu.bjtu.back.controller.model_library;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Random;

/**
 * ClassName: StorageManegeController
 * Description:
 * date: 2021-12-01 18:59
 *
 * @author liyifan
 */
@RestController
@RequestMapping("sm")
public class StorageManegeController {

    /**
     * @Author liyifan
     * @Description
     * @Date 19:03 2021-12-01
     * @Param [storageId, inf]
     * @return java.util.HashMap<java.lang.String,java.lang.Object>
     **/
    @RequestMapping("setStorageInf")
    public HashMap<String, Object> setStorageInf(String storageId, int inf){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("msg", "成功设置:" + storageId + "的库存下限为" + inf);
        return res;
    }

    @RequestMapping("setStocks")
    public HashMap<String, Object> setStocks(String storageId, int stocks){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("msg", "成功设置:" + storageId + "的库存为" + stocks);
        return res;
    }

    @RequestMapping("queryStocks")
    public HashMap<String, Object> queryStocks(String storageId){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        int random = Math.abs(new Random().nextInt()) % 2314;
        System.out.println(random);
        res.put("msg", storageId + "的库存为" + random);
        res.put("stocks", random);
        return res;
    }

}
