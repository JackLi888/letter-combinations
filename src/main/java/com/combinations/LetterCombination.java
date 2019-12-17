package com.combinations;
import java.util.ArrayList;
import java.util.List;
/**
 * 
* 
* 项目名称:  letter-combinations
* 包:       com.combinations   
* 类名称:    LetterCombination.java
* 类描述:    根据输入数字得到对应所有的字符组合
* 创建人:    JackLi
* 创建时间:  2019年12月17日
 */
public class LetterCombination {
    
    private LetterCombination() {
        
    }

    // 定义每个数字对应的字符
    static String[] letterArray = new String[] { "", "", "abc", "def",
            "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    static StringBuffer sb = new StringBuffer();
    /**
     * 
     * <p>跟进输入的数字串得到所有的字母组合.</p>
     * @Title: getLetterCombinations 
     * @CreateBy JackLi
     * @CreateDate 2019年12月17日
     * @ModifyBy   2019年12月17日
     * @ModifyDate  2019年12月17日
     * @param digits
     * @return
     */
    public static List<String> getLetterCombinationsForString(String digits) {
        if (digits.length() == 0) {
            return null;
        }
        final List<String> answer = new ArrayList<>();
        // 开始回溯
        LetterCombination.combinate(digits, 0, answer);
        return answer;
    }

    
    /**
     * 
     * <p>跟进输入的数组得到所有的字母组合.</p>
     * @Title: getLetterCombinations 
     * @CreateBy JackLi
     * @CreateDate 2019年12月17日
     * @ModifyBy   2019年12月17日
     * @ModifyDate  2019年12月17日
     * @param digits
     * @return
     */
    public static List<String> getLetterCombinationsForArray(int [] array) {
        
        if(array==null || array.length==0) {
            return null;
        }
       
        StringBuffer digitBuff=new StringBuffer();
        for (int i=0;i<array.length;i++) {
            digitBuff.append(array[i]);
        }
        
        String digits=digitBuff.toString();
        
        final List<String> answer = new ArrayList<>();
        // 开始回溯
        LetterCombination.combinate(digits, 0, answer);
        return answer;
    }
    
    /**
     * 
     * <p>递归穷举所有的字母组合.</p>
     * @Title: combinate 
     * @CreateBy JackLi
     * @CreateDate 2019年12月17日
     * @ModifyBy   2019年12月17日
     * @ModifyDate  2019年12月17日
     * @param digits
     * @param n
     * @param answer
     */
    private static void combinate(String digits, int n, List<String> answer) {
        if (n == digits.length()) {
            answer.add(LetterCombination.sb.toString());
            return;
        } 
        for (int i = 0; i < LetterCombination.letterArray[digits.charAt(n) - '0'].length(); i++) {
            LetterCombination.sb.append(LetterCombination.letterArray[digits.charAt(n) - '0'].charAt(i));
            LetterCombination.combinate(digits, n + 1, answer);
            LetterCombination.sb.deleteCharAt(LetterCombination.sb.length() - 1);
        }
    }
}
