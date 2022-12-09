package com.nt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="DEPT")
@Data
public class Department
{
	@Id
private Integer deptno;
private String deptname;
private String loc;
}
