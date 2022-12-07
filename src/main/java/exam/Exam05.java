package exam;

import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author hui
 * @Description 5、把下面给出的扁平化json数据用递归的方式改写成组织树的形式
 * @Date
 * @Param
 * @return
 */

public class Exam05 {

    public static void getTreeList(String json){

        List<Map<String,Object>> mapList= (List<Map<String,Object>>) JSONArray.parse(json);

        List<Map<String, Object>> parentList = mapList.stream().filter(map -> "".equals(map.get("parent") + "")).collect(Collectors.toList());

        for (int i = 0; i < parentList.size(); i++) {

            Map<String, Object> map = parentList.get(i);
            String code = map.get("code") + "";

            List<Map<String,Object>> resultTreeDataList = getTreeData(mapList,code);

            map.put("child",resultTreeDataList);
            System.out.println(map);

        }
        System.out.println("结果集为："+parentList);

    }

    private static List<Map<String, Object>> getTreeData(List<Map<String, Object>> mapList,String code) {

        List<Map<String,Object>> resultList=new ArrayList<>();
        for(Map<String,Object> map: mapList){

            if(code.equals(map.get("parent")+"")){

                List<Map<String, Object>> treeData = getTreeData(mapList, map.get("code") + "");
                map.put("child",treeData);
                resultList.add(map);
            }
        }
        return resultList;

    }
}
