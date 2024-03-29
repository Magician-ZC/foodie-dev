package com.imooc.pojo.bo.center;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@ApiModel(value = "用户对象",description = "从客户端,由用户传入的数据封装在此entity中")
public class CenterUserBO {
    @ApiModelProperty(value = "用户名",name = "username",example = "imooc",required = true)
    private String username;
    @ApiModelProperty(value = "密码",name = "password",example = "123456",required = true)
    private String password;
    @ApiModelProperty(value = "确认密码",name = "confirmPassword",example = "123456",required = false)
    private String confirmPassword;
    @ApiModelProperty(value = "用户昵称",name = "nickname",example = "杰森",required = false)
    @NotBlank(message = "用户昵称不能为空")
    @Length(max = 12,message = "用户昵称不能超过12位")
    private String nickname;
    @ApiModelProperty(value = "真实姓名",name = "realname",example = "杰森",required = false)
    @Length(max = 12,message = "用户真实姓名不能超过12位")
    private String realname;
    @ApiModelProperty(value = "手机|号",name = "mobile",example = "13999999999",required = false)
    @Pattern(regexp = "^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1}))+\\d{8})$",message = "手机号格式不正确")
    private String mobile;
    @ApiModelProperty(value = "邮箱地址",name = "email",example = "imooc@163.com",required = false)
    @Pattern(regexp = "^(\\w-*\\.*)+@(\\w-?)+(\\.\\w{2,})+$",message = "不是一个合法的电子邮件地址")
    private String email;
    @ApiModelProperty(value = "性别",name = "sex",example = "0:女 1:男 2:保密",required = false)
    @Min(value = 0,message = "性别选择不正确")
    @Max(value = 2,message = "性别选择不正确")
    private Integer sex;
    @ApiModelProperty(value = "生日",name = "birthday",example = "1900-01-01",required = false)
    private Date birthday;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
