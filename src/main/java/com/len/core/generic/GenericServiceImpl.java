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
 * @ClassName: GenericServiceImpl 
 * @Description: service实现类抽象 ,继承自它,可以获得常用的增删查改操作 
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午4:10:37  
 */
public abstract class GenericServiceImpl<Model, PK> implements GenericService<Model, PK> {
	

    /**
     * 定义成抽象方法,由子类实现,完成dao的注入
     *
     * @return GenericDao实现类
     */
    public abstract GenericDao<Model, PK> getDao();

    /**
     * 插入对象
     * @param model 对象
     */
    public int insert(Model model) {
        return getDao().insertSelective(model);
    }

    /**
     * 更新对象
     * @param model 对象
     */
    public int update(Model model) {
        return getDao().updateBySelective(model);
    }

    /**
     * 通过主键, 删除对象
     * @param id 主键
     */
    public int delete(PK id) {
        return getDao().deleteByPrimaryKey(id);
    }

    /**
     * 通过主键, 查询对象
     *
     * @param id 主键
     * @return
     */
    public Model selectById(PK id) {
        return getDao().selectByPrimaryKey(id);
    }


    @Override
    public Model selectOne() {
        return null;
    }

    @Override
    public List<Model> selectList() {
        return null;
    }

}
