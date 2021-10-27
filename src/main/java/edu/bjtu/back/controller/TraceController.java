package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.TraceConfigProduct;
import edu.bjtu.back.pojo.TraceContent;
import edu.bjtu.back.pojo.TraceFlow;
import edu.bjtu.back.pojo.TraceResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: TraceController
 * Description:
 * date: 2021-09-23 10:42
 *
 * @author liyifan
 */

@Controller
@CrossOrigin
public class TraceController {

    private TraceResult traceResult = new TraceResult("77df263f49123356d28a4a8715d25bf5b980beeeb503cab46ea61ac9f3320eda",
                                                        "hx-blockchain",
                                                        "livox激光雷达",
                                                        "dji-大疆",
                                                        3000.0,
                                                        "51e8ea280b44e16934d4d611901f3d3afc41789840acdff81942c2f65009cd52",
                                                        256,
                                                        "2021-09-23 11:20:40",
                                                        15);

    private List<TraceConfigProduct> configProductList = new ArrayList<>();

    private List<TraceFlow> flowList = new ArrayList<>();

    private List<TraceContent> contentList = new ArrayList<>();

    {
        TraceConfigProduct traceConfigProduct = new TraceConfigProduct("1", "label1", "value1", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream");
        TraceConfigProduct traceConfigProduct1 = new TraceConfigProduct("1", "label2", "value2", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream");
        TraceConfigProduct traceConfigProduct2 = new TraceConfigProduct("1", "label3", "value3", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream");
        configProductList.add(traceConfigProduct);
        configProductList.add(traceConfigProduct1);
        configProductList.add(traceConfigProduct2);

        TraceContent traceContent = new TraceContent(1, "label1", "value1", "fileName1", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream");
        TraceContent traceContent2 = new TraceContent(2, "label2", "value2", "fileName2", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream");
        TraceContent traceContent3 = new TraceContent(3, "label3", "value3", "fileName3", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream");

        TraceFlow traceFlow = new TraceFlow("label1", "value1", "flowName1", "fileName1", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "1", contentList);
        TraceFlow traceFlow1 = new TraceFlow("label2", "value2", "flowName2", "fileName2", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "1", contentList);
        TraceFlow traceFlow2 = new TraceFlow("label3", "value3", "flowName3", "fileName3", "https://img-chache.oss-cn-beijing.aliyuncs.com/hx/%E5%90%88%E5%90%8C.txt?Expires=1634558972&OSSAccessKeyId=TMP.3Ke2vtJYd1LZmshCcSoETxAhf3pmzGcmU8uyWEjGhDQ8vDUVGhHkPE9j76cBYsv3Bmy1aCY7CDQbNQuNeQibUg2yHb1wCx&Signature=ZA2mIDxnPPgUwpkzt2qXDTmZWJA%3D&response-content-type=application%2Foctet-stream", "1", contentList);

        flowList.add(traceFlow);
        flowList.add(traceFlow1);
        flowList.add(traceFlow2);
    }


    @RequestMapping("/trace/{traceId}")
    @ResponseBody
    public TraceResult trace(@PathVariable("traceId") String traceId){
        return traceResult;
    }

    @RequestMapping("/traceinfo/{uniqueCode}")
    @ResponseBody
    public HashMap<String, Object> traceQuery(@PathVariable("uniqueCode") String uniqueCode){
        HashMap<String ,Object> res = new HashMap<>();
        res.put("code", 200);
        res.put("message", "溯源信息获取成功！");

        HashMap<String, Object> data = new HashMap<>();
        data.put("blockInfo", "");
        data.put("tx_id", "51e8ea280b44e16934d4d611901f3d3afc41789840acdff81942c2f65009cd52");
        data.put("tx_time", "2021-09-23 11:20:40");
        data.put("user_name", "hx");
        data.put("configProductList", configProductList);
        data.put("flowList", flowList);
        res.put("data", data);
        return res;
    }
}
