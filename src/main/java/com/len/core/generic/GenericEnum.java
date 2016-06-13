/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.core.generic;

/** 
 * @ClassName: GenericEnum 
 * @Description: 通用枚举类型
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午4:03:00  
 */
public interface GenericEnum {
	
	/**
	 * @Description:value 为保存数据库中的值 
	 */
	public String getValue();
	
	/**
	 * @Description:value 为前端显示的值 
	 */
	public String getText();

}
