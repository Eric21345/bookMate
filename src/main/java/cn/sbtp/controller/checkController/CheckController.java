package cn.sbtp.controller.checkController;



import cn.sbtp.service.checkService.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/check")
public class CheckController {

    @Autowired
    private CheckService checkService;



    //登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @SuppressWarnings("unchecked")
    public Map login(@RequestParam("userName") String userName,
                     @RequestParam("password") String password){
        String password2 = checkService.getPasswordByUserName(userName);
        Map map = new HashMap();
        if(password.equals(password2)){
            map.put("status", 1);
        }
        else{
            map.put("status", 0);
        }
        return map;
    }

}
