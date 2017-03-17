package com.oaecdvd.model;
/*1. 设计应该有的字段
2. 为字段提供GET/SET
3. 提供无参和有参构造.有参构造要求有两个
	1. 全部的字段
	2. 不带ID的
4. 重写equals方法,根据ID来判断对象的唯一性
5. 重写toString方法输出对象的字段信息.*/
public class DVD {
private int id;
private String dname;
private String dcount;
private int status;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public String getDcount() {
	return dcount;
}
public void setDcount(String dcount) {
	this.dcount = dcount;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public DVD(){
	
}
public DVD(String dname,String dcount,int status){
	this.dname=dname;
	this.dcount=dcount;
	this.status=status;
}
public DVD(int id,String dname,String dcount,int status){
	this.id=id;
	this.dname=dname;
	this.dcount=dcount;
	this.status=status;
}
@Override
public boolean equals(Object obj) {
			if(obj == null || obj.getClass() != this.getClass()){
				return false;
			}
			DVD a = (DVD) obj;
			if (a.id == this.id) {
				return false;
			}else{
				return true;
			}
}
public String toString(){
	return getClass().getName()+"id="+id+",dname="+dname+",dcount="+dcount+",status="+status;
}
}
