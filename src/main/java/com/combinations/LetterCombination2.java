package com.combinations;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
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
public class LetterCombination2 {
    
    private LetterCombination2() {
        
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
    public static List<String> getLetterCombinationsForString(Integer digit) {
        if (digit==null ) {
            return null;
        }
        
        String[] nums = Integer.toString(digit).split("");
        List<Integer>  digitList =  Arrays.asList(nums).stream()
                .map(num->Integer.parseInt(num))
                .collect(Collectors.toList());
        
        final List<String> answer = new ArrayList<>();
        // 开始回溯
        LetterCombination2.combinate(digitList, 0, answer);
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
    public static List<String> getLetterCombinationsForArray(Integer [] array) {
        
        if(array==null || array.length==0) {
            return null;
        }
       
        StringBuffer digitBuff=new StringBuffer();
        List<Integer  > digitsList = Arrays.asList(array);
        digitsList.forEach(digit-> digitBuff.append(digit.toString()));
        
        
        final List<String> answer = new ArrayList<>();
        // 开始回溯
        LetterCombination2.combinate(digitsList, 0, answer);
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
    private static void combinate(List<Integer> digits, int n, List<String> answer) {
		if (n == digits.size()) {
			answer.add(LetterCombination2.sb.toString());
			return;
		}
		String letterTemp = LetterCombination2.letterArray[digits.get(n)];

		if (StringUtils.isNotBlank(letterTemp)) {
			String[] letters = letterTemp.split("");
			List<String> letterList = Arrays.asList(letters);
			letterList.forEach(letter -> {
				LetterCombination2.sb.append(letter);
				LetterCombination2.combinate(digits, n + 1, answer);
				LetterCombination2.sb.deleteCharAt(LetterCombination2.sb.length() - 1);
			});
		}

	}
}
