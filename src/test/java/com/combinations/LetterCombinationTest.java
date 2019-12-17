package com.combinations;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

/**
 * 
* 
* 项目名称:  letter-combinations
* 包:       com.combinations   
* 类名称:    LetterCombinationTest.java
* 类描述:    字母组合测试类
* 创建人:    JackLi
* 创建时间:  2019年12月17日
 */
public class LetterCombinationTest 


{   
    
    @Test
    public void testGetLetterCombinationsForString() {
        final List<String> combinationList = LetterCombination.getLetterCombinationsForString("23");
        System.out.println(combinationList.toString());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationList.toString());
        
   }
    
    @Test
    public void testGetLetterCombinationsForArray() {
        int[] array= {2,3};
        final List<String> combinationList = LetterCombination.getLetterCombinationsForArray(array);
        System.out.println(combinationList.toString());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationList.toString());

   }
}
