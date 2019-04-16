package cn.sbtp.mapper.checkMapper;

import cn.sbtp.model.Account;

import java.util.List;

public interface CheckMapper {

    List<Account> getAccounts();
    String getPasswordByUserName(String userName);
}
