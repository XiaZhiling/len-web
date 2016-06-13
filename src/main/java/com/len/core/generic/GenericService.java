/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.core.generic;

import java.util.List;

/** 
 * @ClassName: GenericService 
 * @Description: 通用service层 ,封装常用的增删查改操作
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午4:06:28  
 */
public interface GenericService<Model , PK> {
	

    /**
     * 插入对象
     * @param model 对象
     */
    public int insert(Model model);

    /**
     * 更新对象
     * @param model 对象
     */
    public int update(Model model);

    /**
     * 通过主键, 删除对象
     * @param id 主键
     */
    public int delete(PK id);

    /**
     * 通过主键, 查询对象
     * @param id 主键
     * @return model 对象
     */
    public Model selectById(PK id);


    /**
     * 查询单个对象
     * @return 对象
     */
    public Model selectOne();


    /**
     * 查询多个对象
     * @return 对象集合
     */
    public List<Model> selectList();

}
