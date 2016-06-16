/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.web.system.entity;

import java.util.Date;

/** 
 * @ClassName: User 
 * @Description: 用户模型
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午2:27:04  
 */
public class User {
	
	private String uid;//主键ID
	private String userName;//用户名
	private String password;//密码
	private String mobile;//手机号
	private String email;//邮箱
	private Date birthday;//生日
	private String status;//状态
	private Date createTime;//创建时间
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public User(String uid, String userName, String password, String mobile, String email, Date birthday, String status,
			Date createTime) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
		this.birthday = birthday;
		this.status = status;
		this.createTime = createTime;
	}
	
	
}
