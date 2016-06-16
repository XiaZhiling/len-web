/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.web.system.entity;

/** 
 * @ClassName: Role 
 * @Description: 角色模型
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午3:33:13  
 */
public class Role {
	
	private String rid;//角色ID 
	private String roleName;//角色名称
	private String roleSign;//
	private String status;//角色状态
	private String description;//描述
	
	public String getRid() {
		return rid;
	}
	public void setRid(String rid) {
		this.rid = rid;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleSign() {
		return roleSign;
	}
	public void setRoleSign(String roleSign) {
		this.roleSign = roleSign;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
