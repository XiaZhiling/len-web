/*
 * Licensed to the personal for xzl
 * https://github.com/XiaZhiling
 * See the License for the specific language governing permissions and limitations
 * under the License.
 * @version v1.0
 */
package com.len.web.system.model;

/** 
 * @ClassName: Permission 
 * @Description: 权限模型
 * @author xzl<l576477316@foxmail.com>
 * @date 2016年6月13日 下午3:37:04  
 */
public class Permission {
	
	private String pid;//权限id标识
	private String permissionName;//权限名称
	private String permisssionSign;//
	private String status;//权限状态
	private String description;//描述
	
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermisssionSign() {
		return permisssionSign;
	}
	public void setPermisssionSign(String permisssionSign) {
		this.permisssionSign = permisssionSign;
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
