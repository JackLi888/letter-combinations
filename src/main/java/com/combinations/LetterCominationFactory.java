package com.combinations;

import com.combinations.impl.LetterCombinationForArray;
import com.combinations.impl.LetterCombinationForInteger;
/**
 * 
* 
* 项目名称:  letter-combinations
* 包:       com.combinations   
* 类名称:    LetterCominationFactory.java
* 类描述:    字母组合实例工厂。
* 创建人:    JackLi
* 创建时间:  2019年12月21日
 */
public class LetterCominationFactory {
    
    private  LetterCominationFactory() {
        
    }
    /**
     * 
     * <p>根据参数类型得到字母组合的实例对象.</p>
     * @Title: getInstance 
     * @CreateBy JackLi
     * @CreateDate 2019年12月21日
     * @ModifyBy   2019年12月21日
     * @ModifyDate  2019年12月21日
     * @param obj
     * @return
     */
	public static ILetterCombination getInstance(Object obj) {
		
		if(obj instanceof Integer) {
			
			return new LetterCombinationForInteger((Integer) obj);
			
		}else if(obj instanceof Integer []) {
			
			return new LetterCombinationForArray((Integer[]) obj);
		}
		
		return null;
	}
	
}
