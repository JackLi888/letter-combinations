package com.combinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
public class LetterCombinationTest2 


{   
    
    @Test
    public void testGetLetterCombinationsForString() {
        final List<String> combinationList = LetterCombination2.getLetterCombinationsForString(0);
        System.out.println(combinationList.toString());
     // assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationList.toString());
        
//        
        assertTrue("返回值为空", combinationList.isEmpty());
        
   }
    
    @Test
    public void testGetLetterCombinationsForArray() {
        Integer [] array= {1};
        final List<String> combinationList = LetterCombination2.getLetterCombinationsForArray(array);
        System.out.println(combinationList.toString());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationList.toString());

   }
}
