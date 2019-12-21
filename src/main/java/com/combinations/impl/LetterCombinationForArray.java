package com.combinations.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.combinations.ILetterCombination;
import com.combinations.LetterCombinationUtil;

/**
 * 
* 
* 项目名称:  letter-combinations
* 包:       com.combinations.impl   
* 类名称:    LetterCombinationForArray.java
* 类描述:    数组型字母组合类
* 创建人:    JackLi
* 创建时间:  2019年12月21日
 */
public class LetterCombinationForArray implements ILetterCombination {

    private Integer[] array;

    public LetterCombinationForArray(Integer[] array) {
        super();
        this.array = array;
    }

    /**
    * <p>根据输入整形数组得到对应所有的字符组合 .</p>
     * @Title: getLetterCombinations 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     * @return
     */
    @Override
    public List<String> getLetterCombinations() {

        final List<String> answer = new ArrayList<>();
        if (array == null || array.length == 0) {
            return answer;
        }
        StringBuilder digitBuff = new StringBuilder();
        List<Integer> digitsList = Arrays.asList(array);
        digitsList.forEach(digit -> digitBuff.append(digit.toString()));

        // 开始回溯
        LetterCombinationUtil.combinate(digitsList, 0, answer);
        return answer;
    }

}
