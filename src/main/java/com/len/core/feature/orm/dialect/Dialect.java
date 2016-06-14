/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.core.feature.orm.dialect;

/** 
 * @ClassName: Dialect 
 * @Description: 数据库方言抽象类 
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月14日 上午10:48:06  
 */
public abstract class Dialect {
	
	/**
	 * 
	 * @Description: 得到分页sql 
	 * @param  sql
	 * @param  offset
	 * @param  limit
	 * @return String   
	 */
	public abstract String getLimitString(String sql, int offset, int limit);
	
	/**
	 * 
	 * @Description: 得到总数量 sql
	 * @param  sql
	 * @return String   
	 */
	public abstract String getCountString(String sql);

}
