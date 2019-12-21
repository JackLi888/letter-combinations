package com.combinations.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.combinations.ILetterCombination;
import com.combinations.LetterCombinationUtil;

/**
* 
* 项目名称:  letter-combinations
* 包:       com.combinations   
* 类名称:    ILetterCombination.java
* 类描述:    整形字母组合类
* 创建人:    JackLi
* 创建时间:  2019年12月21日
 */
public class LetterCombinationForInteger implements ILetterCombination {

    private Integer digit;

    public LetterCombinationForInteger(Integer digit) {
        super();
        this.digit = digit;
    }

    /**
    * <p>根据输入整形数字得到对应所有的字符组合 .</p>
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
        if (digit == null) {
            return answer;
        }
        String[] nums = Integer.toString(digit).split("");
        List<Integer> digitList = Arrays.asList(nums).stream().map(num -> Integer.parseInt(num))
                .collect(Collectors.toList());

       
        // 开始回溯
        LetterCombinationUtil.combinate(digitList, 0, answer);
        return answer;
    }

}
