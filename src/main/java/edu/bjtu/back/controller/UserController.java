package edu.bjtu.back.controller;

import edu.bjtu.back.pojo.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * ClassName: UserController
 * Description:
 * date: 2021/9/1 9:33
 *
 * @author liyifan
 */
@Controller
@CrossOrigin
public class UserController {

    public List<SysUser> sysUsers = Arrays.asList(new SysUser[]{new SysUser("张三", "abc@abc.com", "1", "12345678909", "zhangsan", "1"),
                                                                new SysUser("李四", "abc1@abc.com", "2", "12343457998", "lisi", "1"),
                                                                new SysUser("王五", "abc2@abc.com", "3", "14345658998", "wangwu", "1"),
                                                                new SysUser("赵六", "abc3@abc.com", "4", "15556782398", "zhaoliu", "1")});

    @RequestMapping("/upms/user/info")
    @ResponseBody
    public Map<String, Object> getUserDetail(@RequestParam("username") String username){
        Map<String, Object> map = new HashMap<>();
        Map<String, Object> data = new HashMap<>();
        SysUser user = null;
        try{
            user = sysUsers.stream().filter(u -> u.getUsername().equals(username)).findFirst().get();
        } catch (Exception e) {
            map.put("code", 400);
            map.put("message", "获取用户信息失败！");
            return map;
        }
        map.put("code", 200);
        map.put("message", "获取用户信息成功！");
        data.put("sysUser", user);
        data.put("permissions", "");
        data.put("roles", "");
        data.put("routes", "");
        map.put("data", data);
        return map;
    }

    @RequestMapping(value="/auth/oauth/token", method={RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> login(@RequestBody Map<String,Object> param){
        HashMap<String, Object> data = new HashMap<>();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message", "登陆成功！");
        data.put("access_token", "nkj435htuioh56jk3b25hjg1243j621");
        data.put("companyCode", "3124");
        data.put("companyName", "阿里巴巴");
        data.put("currentZdh", 432);
        data.put("deptId", "d-1");
        data.put("userId", "1");
        data.put("userName", param.get("username"));
        map.put("data", data);
        return map;
    }
}
