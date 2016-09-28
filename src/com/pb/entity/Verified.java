package com.pb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "rfcorp_verified_info", catalog = "game")
public class Verified {
	@Id
	private int id;
	private Integer user_id;
	private String id_card;
	private String realname;
	private String email;
	private String mobile_telephone;
	private Integer check_time;
	private Integer all_verify;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(int i) {
		this.user_id = i;
	}
	public String getId_card() {
		return id_card;
	}
	public void setId_card(String id_card) {
		this.id_card = id_card;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile_telephone() {
		return mobile_telephone;
	}
	public void setMobile_telephone(String mobile_telephone) {
		this.mobile_telephone = mobile_telephone;
	}
	public Integer getCheck_time() {
		return check_time;
	}
	public void setCheck_time(int i) {
		this.check_time = i;
	}
	public Integer getAllverify() {
		return all_verify;
	}
	public void setAllverify(int allverify) {
		this.all_verify = allverify;
	}
}
