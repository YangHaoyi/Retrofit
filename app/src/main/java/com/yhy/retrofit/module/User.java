package com.yhy.retrofit.module;

/**
 * Created by Administrator on 2016/2/24.
 */
public class User {

    public static final String IS_LOGIN = "is_login";
    public static final String USERID = "userId";
    public static final String TOKEN = "token";
    public static final String MOBILE = "mobile";
    public static final String NICK = "user_name";
    public static final String GENDER = "gender";
    public static final String AVATAR = "user_avatar";
    public static final String UPDATED_AT = "updated_at";
    public static final String MONEY = "money";
    public static final String CREATE_AT = "create_at";
    public static final String FOMAT_MONEY = "fomat_money";
    /**
     * id : 1
     * mobile : 15940232764
     * nick : xxxxxx
     * gender : N
     * avatar : 935d84153d02e461109458ac843a447f8440506a
     * money : 0.77
     * money_check_sign :
     * created_at : 2016-01-30 18:01:47
     * updated_at : 2016-02-23 13:54:57
     */

    private String id;
    private String mobile;
    private String nick;
    private String gender;
    private String avatar;
    private String money;
    private String money_check_sign;
    private String created_at;
    private String updated_at;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setMoney_check_sign(String money_check_sign) {
        this.money_check_sign = money_check_sign;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getId() {
        return id;
    }

    public String getMobile() {
        return mobile;
    }

    public String getNick() {
        return nick;
    }

    public String getGender() {
        return gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getMoney() {
        return money;
    }

    public String getMoney_check_sign() {
        return money_check_sign;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

}
