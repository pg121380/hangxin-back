package edu.bjtu.back.controller;


import edu.bjtu.back.pojo.EntrustWorking;
import edu.bjtu.back.pojo.EntrustWorkingCompany;
import edu.bjtu.back.pojo.EntrustWorkingProduct;
import edu.bjtu.back.vo.EntrustWorkingData;
import edu.bjtu.back.vo.ReturnObject;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
@CrossOrigin
public class EntrustWorkingController {


    List<EntrustWorking> entrustWorkingList = Arrays.asList(
            new EntrustWorking("1", "测试公司1",3,"011-223232","2020-2-2","213","加工公司1",21,"组织1","xxxx1",1l,
            122,"计划的说明",0,2,"物流公司1",1,"transport1","2020-5-7", 22L),
            new EntrustWorking("2", "测试公司2",6,"011-2231112","2020-6-2","13","加工公司2",51,"组织2","xxxx2",0l,
             12,"计划说明",1,3,"物流公司2",2,"transport2","2020-9-7", 2L));
    List<EntrustWorkingCompany> entrustWorkingCompanyList = Arrays.asList(new EntrustWorkingCompany("1","231","上游企业1","下游企业",5,"2553","加工企业名称",0,"2020-1-1","2020-3-3",123L)
    , new EntrustWorkingCompany("1","231","上游企业1","下游企业3",2,"2553","加工企业名称1",1,"2020-1-1","2020-3-3",12323L)
    , new EntrustWorkingCompany("2","31","上游企业2","下游企业4",1,"553","加工企业名称2",0,"2020-1-1","2020-3-3",1223L)
    , new EntrustWorkingCompany("3","2","上游企业5","下游企业6",3,"253","加工企业名称3",1,"2020-1-1","2020-3-3",12L)
    );

    List<EntrustWorkingProduct> entrustWorkingProductList = Arrays.asList(
            new EntrustWorkingProduct("1","委外加工单号",11,"s-011","蛋挞","g-11","顿",110,
                    22222L,333333333L,"wj-01","加工文件名",444444444L,5555555L),
            new EntrustWorkingProduct("2","委外加工单号",12,"s-012","潘塔","g-12","顿",100,
                    22222L,333333333L,"wj-02","加工文件名",444444444L,5555555L)
            );


    //1.1.14	委外加工列表接口
    @RequestMapping("/entrustWorking/page")
    public ReturnObject getEntrustWorkingPage(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize,
                                              @RequestParam("entrustWorkingNo") String entrustWorkingNo, @RequestParam("createTimeStart") String createTimeStart,
                                              @RequestParam("createTimeEnd") String createTimeEnd, @RequestParam("status") int status){

        System.out.println(entrustWorkingList);
        final EntrustWorkingData entrustWorkingData = new EntrustWorkingData(2, 1, entrustWorkingList, 1);
        return new ReturnObject(entrustWorkingData);
    }

    @RequestMapping("/entrustWorkingCompany/page")
    public ReturnObject getEntrustWorkingCompantPage(
            @RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize,
            @RequestParam("entrustWorkingNo") String entrustWorkingNo, @RequestParam(value = "createTimeStart" ,  required = false) String createTimeStart,
            @RequestParam(value ="createTimeEnd", required = false) String createTimeEnd, @RequestParam(value = "status" , required = false) Integer status
    ){

        HashMap<String, Object> data = new HashMap<>();
        data.put("total",4);
        data.put("pages",1);
        data.put("records", entrustWorkingCompanyList);
        data.put("page",1);
        return new ReturnObject(data);
    }


    @RequestMapping("/entrustWorking/{id}")
    public ReturnObject entrustWorkingDetail(@PathVariable("id") String id){
        HashMap<String, Object> data = new HashMap<>();

        final EntrustWorking entrustWorking = new EntrustWorking("2", "测试公司2", 6, "011-2231112", "2020-6-2", "13", "加工公司2", 51, "组织2", "xxxx2", 0l,
                12, "计划说明", 1, 3, "物流公司2", 2, "transport2", "2020-9-7", 2L);

        data.put("entrustWorking", entrustWorking);
        data.put("entrustWorkingCompanyList", entrustWorkingCompanyList);
        data.put("entrustWorkingProductList", entrustWorkingProductList);

        return new ReturnObject(data);
    }


}
