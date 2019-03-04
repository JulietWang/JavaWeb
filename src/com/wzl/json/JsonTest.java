package com.wzl.json;


import com.wzl.ajax.User;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈功能简述〉
 * 〈json测试〉
 *
 * @author wangzl
 * @create 2019/3/4 0004
 */
public class JsonTest {

    public static void main(String[] args) {
        List<User> list = new ArrayList();
        User u1 = new User ("u1");
        User u2 = new User ("u2");
        User u3 = new User ("u3");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        //把查询到的数据传递到页面中显示
        //假如通过ajax查询    ajax需要的返回值类型是json轻量级数据
        //JSONArray jsonArray =JSONArray.fromObject(list);
        //假如Province 有几百个属性信息    想过滤属性进行传递
        JsonConfig jc = new JsonConfig();
        jc.setExcludes(new String[] {"pid"});
        JSONArray jsonArray = JSONArray.fromObject(list,jc);
        System.out.println(jsonArray.toString());
    }
}
