/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.core.feature.orm.dialect;

/** 
 * @ClassName: OracleDialect 
 * @Description: Oracle 数据库方言
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月14日 上午10:51:51  
 */
public class OracleDialect extends Dialect {

	/* (non Javadoc) 
	 * <p>Title: getLimitString</p> 
	 * <p>Description: </p> 
	 * @param sql
	 * @param offset
	 * @param limit
	 * @return 
	 * @see com.len.core.feature.orm.dialect.Dialect#getLimitString(java.lang.String, int, int) 
	 */
	@Override
	public String getLimitString(String sql, int offset, int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non Javadoc) 
	 * <p>Title: getCountString</p> 
	 * <p>Description: </p> 
	 * @param sql
	 * @return 
	 * @see com.len.core.feature.orm.dialect.Dialect#getCountString(java.lang.String) 
	 */
	@Override
	public String getCountString(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

}
