package com.combinations;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
/**
 * 
* 
* 项目名称:  letter-combinations
* 包:       com.combinations   
* 类名称:    LetterCombination.java
* 类描述:    字母组合工具类
* 创建人:    JackLi
* 创建时间:  2019年12月17日
 */
public class LetterCombinationUtil {
    
    private LetterCombinationUtil() {
        
    }

    // 定义每个数字对应的字符
    static String[] letterArray = new String[] { "", "", "abc", "def",
            "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    //暂存当前字母组合
    static StringBuilder sb = new StringBuilder();
    
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
    public static void combinate(List<Integer> digits, int n, List<String> answer) {
		if (n == digits.size()) {
			answer.add(LetterCombinationUtil.sb.toString());
			return;
		}
		String letterTemp = LetterCombinationUtil.letterArray[digits.get(n)];

		if (StringUtils.isNotBlank(letterTemp)) {
			String[] letters = letterTemp.split("");
			List<String> letterList = Arrays.asList(letters);
			letterList.forEach(letter -> {
				LetterCombinationUtil.sb.append(letter);
				LetterCombinationUtil.combinate(digits, n + 1, answer);
				LetterCombinationUtil.sb.deleteCharAt(LetterCombinationUtil.sb.length() - 1);
			});
		}

	}
}
