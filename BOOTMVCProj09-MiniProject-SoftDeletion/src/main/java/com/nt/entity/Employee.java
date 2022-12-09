package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Data
@Entity
@Table(name="BOOT_EMP")
@SQLDelete(sql="UPDATE BOOT_EMP SET STATUS='deleted' WHERE EMPNO=?")
@Where(clause="STATUS <> 'deleted'")
public class Employee implements Serializable
{
private static final long serialVersionUID = 1L;

@Id
@SequenceGenerator(name="gen1" ,sequenceName="EMP_ID_SEQ1",initialValue=3000,allocationSize=1)
@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
private Integer empno;
private String empname;
private String job;
private Float salary;
private Integer deptno;
private String status="Active";
}
