package com.oaecdvd.model;
/*1. ���Ӧ���е��ֶ�
2. Ϊ�ֶ��ṩGET/SET
3. �ṩ�޲κ��вι���.�вι���Ҫ��������
	1. ȫ�����ֶ�
	2. ����ID��
4. ��дequals����,����ID���ж϶����Ψһ��
5. ��дtoString�������������ֶ���Ϣ.*/
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
