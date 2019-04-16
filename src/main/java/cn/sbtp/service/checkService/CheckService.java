package cn.sbtp.service.checkService;

import cn.sbtp.mapper.checkMapper.CheckMapper;
import cn.sbtp.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckService {

    @Autowired
    private CheckMapper checkMapper;

    public List<Account> getAccounts(){
        return checkMapper.getAccounts();
    }

    public String getPasswordByUserName(String userName){
        return checkMapper.getPasswordByUserName(userName);
    }
}
