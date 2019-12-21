package com.combinations;

import java.util.List;
/**
* 
* 项目名称:  letter-combinations
* 包:       com.combinations   
* 类名称:    ILetterCombination.java
* 类描述:    字母组合接口
* 创建人:    JackLi
* 创建时间:  2019年12月21日
 */
public interface ILetterCombination {
	
	  /**
	   * 
	   * <p>根据输入数字得到对应所有的字符组合 .</p>
	   * @Title: getLetterCombinations 
	   * @CreateBy JackLi
	   * @CreateDate 2019年12月21日
	   * @ModifyBy   2019年12月21日
	   * @ModifyDate  2019年12月21日
	   * @return
	   */
	 List<String> getLetterCombinations();

}
