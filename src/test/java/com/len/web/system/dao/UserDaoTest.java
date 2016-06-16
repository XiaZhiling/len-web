/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.web.system.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.len.web.system.entity.User;

/** 
 * @ClassName: UserDaoTest 
 * @Description: UserDao单元测试
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月16日 上午10:50:49  
 */

//配置Spring和Junit整合，junit启动时加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉spring配置文件
@ContextConfiguration({"classpath:conf/spring/applicationContext.xml"})
public class UserDaoTest {
	
	//注入Dao实现类依赖
	@Resource
	private UserDao userDao;

	@Test
	public void testInsertSelective() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		User user = new User("123123", "ldh", "1231sasf", "18923124433", "576477316@qq.com", format.parse("1988-10-30"), "1", null);
		System.out.println(userDao);
		userDao.insertSelective(user);
	}

	@Test
	public void testUpdateBySelective() {
	}

	@Test
	public void testDeleteByPrimaryKey() {
	}

	@Test
	public void testSelectByPrimaryKey() {
	}

}
