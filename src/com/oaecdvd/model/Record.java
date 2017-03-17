package com.oaecdvd.model;

public class Record {
private int id;
private int uid;
private int did;
private String lendTime;
private String returnTime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getLendTime() {
	return lendTime;
}
public void setLendTime(String lendTime) {
	this.lendTime = lendTime;
}
public String getReturnTime() {
	return returnTime;
}
public void setReturnTime(String returnTime) {
	this.returnTime = returnTime;
}
public Record(){
	
}
public Record(int id, int uid, int did, String lendTime, String returnTime) {
	this.id = id;
	this.uid = uid;
	this.did = did;
	this.lendTime = lendTime;
	this.returnTime = returnTime;
}
public Record(int uid, int did, String lendTime, String returnTime) {
	this.uid = uid;
	this.did = did;
	this.lendTime = lendTime;
	this.returnTime = returnTime;
}
@Override
public boolean equals(Object obj) {
			if(obj == null || obj.getClass() != this.getClass()){
				return false;
			}
			Record a = (Record) obj;
			if (a.id == this.id) {
				return false;
			}else{
				return true;
			}
}
public String toString(){
	return getClass().getName()+"id="+id+",uid="+uid+",did="+did+",lendTime="+lendTime+",returnTime="+returnTime;
}
}
