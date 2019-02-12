package com.wzl.ajax;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈功能简述〉
 * 〈模拟数据库〉
 *
 * @author wangzl
 * @create 2019/2/12 0012
 */
public class DBUser {

    private static List<User> list = new ArrayList<>();

    static{
        list.add(0,new User("ddd"));
        list.add(1,new User("aaa"));
        list.add(2,new User("bbb"));
        list.add(3,new User("ccc"));
    }

    public static int checkUserName(String username){
        System.out.println("----2---"+username);
        for (User user:list) {
            System.out.println("----3---"+user.getUsername());
            if(user.getUsername().equals(username)){
                return 1;
            }
        }
        return 0;
    }
}
