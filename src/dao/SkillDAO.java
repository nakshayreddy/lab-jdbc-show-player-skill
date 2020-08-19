package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Skill;
import utility.ConnectionManager;


public class SkillDAO{
	public List< Skill > listAllSkills () throws Exception {
		
		List<Skill> l1=new ArrayList<Skill>();
		Connection con = ConnectionManager.getConnection();
		Skill skill=null;
		String sql="select * from SKILL";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
		{
			skill=new Skill(rs.getLong(1),rs.getString(2));
			l1.add(skill);
		}
		con.close();
		
		
		
		return l1;
		
	}
	
}
