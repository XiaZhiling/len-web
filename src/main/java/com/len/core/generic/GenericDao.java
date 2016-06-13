/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.core.generic;

/**
 * @ClassName: GenericDao
 * @Description: 所有自定义Dao的顶级接口, 封装常用的增删查改操作
 *   <p>Model : 代表数据库中的表 映射的Java对象类型</p>
 *   <p>PK :代表对象的主键类型</p>
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午3:50:02
 */
public interface GenericDao<Model, PK> {
	
	/**
	 * @Description: 插入对象
	 * @param model模型
	 * @return int 返回类型 
	 */
	public int insertSelective(Model model);
	
	/**
	 * @Description: 更新对象
	 * @param model模型
	 * @return int 返回类型 
	 */	
	public int updateBySelective(Model model);

	/**
	 * @Description: 删除对象
	 * @param pk主键
	 * @return int 返回类型 
	 */	
	public int deleteByPrimaryKey(PK pk);
	
	/**
	 * @Description: 查询对象
	 * @param pk主键
	 * @return Model 返回类型 
	 */	
	public Model selectByPrimaryKey(PK pk);

}
