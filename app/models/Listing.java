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

	public void setTimeStamp(String timeStamp){
		this.time_Stamp = timeStamp;
	}
}