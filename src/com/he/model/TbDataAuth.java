package com.he.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_data_auth database table.
 * 
 */
@Entity
@Table(name="tb_data_auth")
@NamedQuery(name="TbDataAuth.findAll", query="SELECT t FROM TbDataAuth t")
public class TbDataAuth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private String pwd;

	public TbDataAuth() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}