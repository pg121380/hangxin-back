package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.TraceResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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


    @RequestMapping("/trace/{traceId}")
    @ResponseBody
    public TraceResult trace(@PathVariable("traceId") String traceId){
        return traceResult;
    }
}
