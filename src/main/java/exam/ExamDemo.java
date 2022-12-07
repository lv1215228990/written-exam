package exam;

import static exam.Exam01.reverse;
import static exam.Exam03.mergeSort;
import static exam.Exam04.filterJson;
import static exam.Exam05.getTreeList;

/**
 * @Author hui
 * @Description
 * @Date
 * @Param
 * @return
 */

public class ExamDemo {
    public static void main(String[] args) {

        //1、编写一个递归版本的 reverse(s) 函数(或方法),以将字符串s倒置。
        String reverse = reverse("abcdef");
        System.out.println(reverse);

        //2、编写程序 expr，以计算从命令行输入的逆波兰表达式的值，其中每个运算符或操作数用一个单独的参数表示。例如，命令 expr 2 3 4 + *

        //3、用归并排序将3，1，4，1，5，9，2，6 排序。
        int[] nums = new int[]{3,1,4,1,5,9,2,6};
        int[] newNums = mergeSort(nums, 0, nums.length - 1);
        System.out.print("结果集为：" + "\t");
        for (int x : newNums) {
            System.out.print(x+"\t");
        }
        System.out.println();

        //4、对下面的 json 字符串 serial 相同的进行去重。
        String json = "[{\n" +
                "    \"name\": \"张三\",\n" +
                "    \"serial\": \"0001\"\n" +
                "  }, {\n" +
                "    \"name\": \"李四\",\n" +
                "    \"serial\": \"0002\"\n" +
                "  }, {\n" +
                "    \"name\": \"王五\",\n" +
                "    \"serial\": \"0003\"\n" +
                "  }, {\n" +
                "    \"name\": \"王五2\",\n" +
                "    \"serial\": \"0003\"\n" +
                "  }, {\n" +
                "    \"name\": \"赵四\",\n" +
                "    \"serial\": \"0004\"\n" +
                "  }, {\n" +
                "    \"name\": \"小明\",\n" +
                "    \"serial\": \"005\"\n" +
                "  }, {\n" +
                "    \"name\": \"小张\",\n" +
                "    \"serial\": \"006\"\n" +
                "  }, {\n" +
                "    \"name\": \"小李\",\n" +
                "    \"serial\": \"006\"\n" +
                "  }, {\n" +
                "    \"name\": \"小李2\",\n" +
                "    \"serial\": \"006\"\n" +
                "  }, {\n" +
                "    \"name\": \"赵四2\",\n" +
                "    \"serial\": \"0004\"\n" +
                "  }]";

        filterJson(json);


        //5、把下面给出的扁平化json数据用递归的方式改写成组织树的形式
        String e5 = "[\n" +
                "    {\n" +
                "      \"id\": \"1\",\n" +
                "      \"name\": \"中国\",\n" +
                "      \"code\": \"110\",\n" +
                "      \"parent\": \"\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"2\",\n" +
                "      \"name\": \"北京市\",\n" +
                "      \"code\": \"110000\",\n" +
                "      \"parent\": \"110\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"3\",\n" +
                "      \"name\": \"河北省\",\n" +
                "      \"code\": \"130000\",\n" +
                "      \"parent\": \"110\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"4\",\n" +
                "      \"name\": \"四川省\",\n" +
                "      \"code\": \"510000\",\n" +
                "      \"parent\": \"110\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"5\",\n" +
                "      \"name\": \"石家庄市\",\n" +
                "      \"code\": \"130001\",\n" +
                "      \"parent\": \"130000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"6\",\n" +
                "      \"name\": \"唐山市\",\n" +
                "      \"code\": \"130002\",\n" +
                "      \"parent\": \"130000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"7\",\n" +
                "      \"name\": \"邢台市\",\n" +
                "      \"code\": \"130003\",\n" +
                "      \"parent\": \"130000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"8\",\n" +
                "      \"name\": \"成都市\",\n" +
                "      \"code\": \"510001\",\n" +
                "      \"parent\": \"510000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"9\",\n" +
                "      \"name\": \"简阳市\",\n" +
                "      \"code\": \"510002\",\n" +
                "      \"parent\": \"510000\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"10\",\n" +
                "      \"name\": \"武侯区\",\n" +
                "      \"code\": \"51000101\",\n" +
                "      \"parent\": \"510001\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"id\": \"11\",\n" +
                "      \"name\": \"金牛区\",\n" +
                "      \"code\": \"51000102\",\n" +
                "      \"parent\": \"510001\"\n" +
                "    }\n" +
                "  ]";

        getTreeList(e5);
    }

}
