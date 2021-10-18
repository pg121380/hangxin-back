package edu.bjtu.back.controller;


import edu.bjtu.back.pojo.EntrustWorking;
import edu.bjtu.back.vo.EntrustWorkingData;
import edu.bjtu.back.vo.ReturnObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class EntrustWorkingController {


    List<EntrustWorking> entrustWorkingList = Arrays.asList(new EntrustWorking("1", "测试公司1",3,"011-223232","2020-2-2","213","加工公司1",21,"组织1","xxxx1",1l,
            122,"计划的说明",0,2,"物流公司1",1,"transport1","2020-5-7", 22L), new EntrustWorking("2", "测试公司2",6,"011-2231112","2020-6-2","13","加工公司2",51,"组织2","xxxx2",0l,
             12,"计划说明",1,3,"物流公司2",2,"transport2","2020-9-7", 2L));


    //1.1.14	委外加工列表接口
    @RequestMapping("/entrustWorking/page")
    public ReturnObject getEntrustWorkingPage(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize,
                                              @RequestParam("entrustWorkingNo") String entrustWorkingNo, @RequestParam("createTimeStart") String createTimeStart,
                                              @RequestParam("createTimeEnd") String createTimeEnd, @RequestParam("status") int status){

        System.out.println(entrustWorkingList);
        final EntrustWorkingData entrustWorkingData = new EntrustWorkingData(2, 1, entrustWorkingList, 1);
        return new ReturnObject(entrustWorkingData);
    }

//    @RequestMapping("/entrustWorkingCompany/page")
//    public ReturnObject getEntrustWorkingCompantPage(
//            @RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize,
//            @RequestParam("entrustWorkingNo") String entrustWorkingNo, @RequestParam("createTimeStart") String createTimeStart,
//            @RequestParam("createTimeEnd") String createTimeEnd, @RequestParam("status") int status
//    ){
//
//
//        return new ReturnObject();
//    }


}
