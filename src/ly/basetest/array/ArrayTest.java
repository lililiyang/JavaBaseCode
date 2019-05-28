package ly.basetest.array;

import java.util.Arrays;

public class ArrayTest {
    private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr = {"十","百","千"};
    /**
     * 把一个浮点数分解为整数部分和小数部分的字符串数组
     * @param num 要被分解的浮点数
     * @return
     */
    private String[] divide(double num){
        long zheng = (long) num;
        long round = Math.round((num - zheng) * 100);
        return new String[]{zheng + "",String.valueOf(round)} ;
    }

    /**
     * 把一个数字字符串变成汉字字符串
     * @param numStr 数字字符串
     * @return
     */
    private String toHanZi(String numStr){
        String result = "";
        int length = numStr.length();
        for (int i = 0; i < length; i++) {
            //把char类型转成int类型数字,因为他们ascii 码值相差48
            //所以把char类型减去48就得到int类型的数字
            int num = numStr.charAt(i) - 48;
            //判断不为最后一位并且值不为0,则需要添加单位
            if(i != length-1 && num != 0){
                result += hanArr[num] + unitArr[length-2-i];
            }else{
                result += hanArr[num];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        String[] divide = arrayTest.divide(2121.33);
        System.out.println(Arrays.toString(divide));
        String s = arrayTest.toHanZi("5665");
        System.out.println(s);
    }
}
