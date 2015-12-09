package models;

import play.db.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.*;
import java.text.SimpleDateFormat;
@Entity
public class Listing extends Model{
	@Id
	public String id;

	public String title;

	public String content;

	public String personal;

	public String subject;

	public String time_Stamp;

	public String getId(){
		return id;
	}
	public void setID(String id){
		this.id = id;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getContent(){
		return content;
	}
	public void setContent(String content){
		this.content = content;
	}
	public String getPersonal(){
		return personal;
	}
	public void setPersonal(String personal){
		this.personal = personal;
	}
	public String getSubject(){
		return subject;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getTimeStamp(){
		return time_Stamp;
	}
	public void setTimeStamp(String timeStamp){
		this.time_Stamp = timeStamp;
	}
}