package exam;

import com.alibaba.fastjson.JSONArray;

import java.util.*;

/**
 * @Author hui
 * @Description 对下面的 json 字符串 serial 相同的进行去重。
 * @Date
 * @Param
 * @return
 */

public class Exam04 {

    public static void filterJson(String json){
        List<Map<String, Object>> mapList = (List<Map<String, Object>>) JSONArray.parse(json);

        List<Map<String, Object>> resultList = new ArrayList<>();

        System.out.println(mapList);
        Set<String> set = new HashSet<>();

        for (int i = 0; i < mapList.size(); i++) {
            Map<String, Object> map = mapList.get(i);
            String serial = map.get("serial") + "";
            if (set.contains(serial)){
                continue;
            }else {
                set.add(serial);
                //重复数据只保留第一次出现的map
                resultList.add(map);
            }
        }
        System.out.println("结果集："+resultList);
    }

}
