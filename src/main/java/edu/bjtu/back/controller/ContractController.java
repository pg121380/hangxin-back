package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.Contract;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * ClassName: ContractController
 * Description:
 * date: 2021-10-18 19:32
 *
 * @author liyifan
 */
@Controller
@CrossOrigin
public class ContractController {

    public ArrayList<Contract> contracts = new ArrayList<>();

    {

        Contract contract = new Contract("1", "contract-1", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract1 = new Contract("2", "contract-2", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract2 = new Contract("3", "contract-3", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract3 = new Contract("4", "contract-4", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract4 = new Contract("5", "contract-5", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract5 = new Contract("6", "contract-6", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract6 = new Contract("7", "contract-7", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract7 = new Contract("8", "contract-8", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract8 = new Contract("9", "contract-9", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        Contract contract9 = new Contract("10", "contract-10", "xxxx交易合同", "2021-10-18", "无", "A有限公司", "sh-A-00001", "张三", "13842345602", "B有限公司", "sh-B-00002", "李四", "13523452365", "0", "等待您进行签署","1","A有限公司公章", "https://img2.baidu.com/it/u=1489834408,1867541692&fm=26&fmt=auto", "2020-10-28", "B有限公司公章", "https://img0.baidu.com/it/u=1989194325,2361005378&fm=26&fmt=auto", "2021-10-28", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "A有限公司", "2021-10-15", "2021-10-15");
        contracts.add(contract);
        contracts.add(contract1);
        contracts.add(contract2);
        contracts.add(contract3);
        contracts.add(contract4);
        contracts.add(contract5);
        contracts.add(contract6);
        contracts.add(contract7);
        contracts.add(contract8);
        contracts.add(contract9);
    }

    @RequestMapping("/contract/queryList")
    @ResponseBody
    public HashMap<String, Object> getContractsList(@RequestParam("pageNo") int pageNo,
                                                    @RequestParam("pageSize") int pageSize,
                                                    @RequestParam("wordName") String wordName,
                                                    @RequestParam("wordStatus") String wordStatus,
                                                    @RequestParam("createBy") String createBy,
                                                    @RequestParam("joinBy") String joinBy){
        HashMap<String, Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("msg", "合同列表获取成功！");
        HashMap<String, Object> data = new HashMap<>();
        data.put("total", 10);
        data.put("pages", 1);
        data.put("records", contracts);
        data.put("page", 1);
        res.put("data", data);
        return res;
    }

}
