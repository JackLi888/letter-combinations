package com.combinations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

/**
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
    /**
     * 
     * <p>测试输入0的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForIntegerCase1() {
        ILetterCombination instance = LetterCominationFactory.getInstance(0);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值为空", combinationList.isEmpty());

        System.out.println(combinationList.toString());

    }

    /**
     * 
     * <p>测试输入1的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase2
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForIntegerCase2() {
        ILetterCombination instance = LetterCominationFactory.getInstance(1);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值不为空", combinationList.isEmpty());

        System.out.println(combinationList.toString());

    }

    /**
     * 
     * <p>测试输入1和0的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase3
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForIntegerCase3() {
        ILetterCombination instance = LetterCominationFactory.getInstance(10);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值不为空", combinationList.isEmpty());

        System.out.println(combinationList.toString());

    }

    /**
     * 
     * <p>测试输入1和非0的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCas4 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForIntegerCase4() {
        ILetterCombination instance = LetterCominationFactory.getInstance(12);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值不为空", combinationList.isEmpty());

        System.out.println(combinationList.toString());

    }

    /**
     * 
     * <p>测试输入非1和非0的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase5 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForIntegerCase5() {
        ILetterCombination instance = LetterCominationFactory.getInstance(23);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值空", combinationList.isEmpty() == false);

        System.out.println(combinationList.toString());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationList.toString());

    }

    
    /**
     * 
     * <p>测试输入99的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase6
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForIntegerCase6() {
        ILetterCombination instance = LetterCominationFactory.getInstance(99);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值空", combinationList.isEmpty() == false);

        System.out.println(combinationList.toString());
        assertEquals("[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]", combinationList.toString());

    }
    
    
    /**
     * 
     * <p>测试输入{0}的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase1() {
        Integer[] array = {0 };
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();
        System.out.println(combinationList.toString());

        assertTrue("返回值不为空", combinationList.isEmpty());

    }
    
    /**
     * 
     * <p>测试输入{1}的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase2() {
        Integer[] array = {1};
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();
        System.out.println(combinationList.toString());

        assertTrue("返回值不为空", combinationList.isEmpty());

    }
    
    
    /**
     * 
     * <p>测试输入{0,1}的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase3() {
        Integer[] array = {0,1};
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();
        System.out.println(combinationList.toString());

        assertTrue("返回值不为空", combinationList.isEmpty());

    }
    
    
    /**
     * 
     * <p>测试输入0和除其它非1的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase4() {
        Integer[] array = {0,2};
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();
        System.out.println(combinationList.toString());

        assertTrue("返回值不为空", combinationList.isEmpty());

    }
    
    
    /**
     * 
     * <p>测试输入1和除其它非0的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase5() {
        Integer[] array = {1,2};
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();
        System.out.println(combinationList.toString());

        assertTrue("返回值不为空", combinationList.isEmpty());

    }
    
    
    /**
     * 
     * <p>测试输入非1和非0的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase6() {
        Integer[] array = {2,3};
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值空", combinationList.isEmpty() == false);
        System.out.println(combinationList.toString());
        assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationList.toString());

    }
    
    
    
    /**
     * 
     * <p>测试输入{9,9}的情况.</p>
     * @Title: testGetLetterCombinationsForIntegerCase1 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     */
    @Test
    public void testGetLetterCombinationsForArrayCase7() {
        Integer[] array = {9,9};
        ILetterCombination instance = LetterCominationFactory.getInstance(array);
        final List<String> combinationList = instance.getLetterCombinations();

        assertTrue("返回值空", combinationList.isEmpty() == false);
        System.out.println(combinationList.toString());
        assertEquals("[ww, wx, wy, wz, xw, xx, xy, xz, yw, yx, yy, yz, zw, zx, zy, zz]", combinationList.toString());

    }
}


