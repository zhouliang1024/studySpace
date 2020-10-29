package com.yuye.october.twentyNine;

import com.yuye.october.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yuye
 * @Date 2020/10/28 8:39 下午
 */
public class Demo {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        //sql 查一个结果userList
        Map<Long, User> userMap = new HashMap<>();
        userList.forEach(u->userMap.put(u.getUserId(),u));
        //另一个查询phone结果
        List<Phone> phoneList = new ArrayList<>();
        List<Result> results = new ArrayList<>();
        phoneList.forEach(phone -> {
            Result result = new Result();
            result.setUserId(phone.getUserId());
            result.setName(userMap.get(phone.getUserId()).getName());
            results.add(result);
        });
    }
}
