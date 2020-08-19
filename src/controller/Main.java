package controller;

import java.util.ArrayList;
import java.util.List;

import dao.SkillDAO;
import model.Skill;

public class Main{
	public static void main(String args[]) throws Exception
	{
		List<Skill> l1=new ArrayList<Skill>();
		SkillDAO sd=new SkillDAO();
		l1=sd.listAllSkills();
		for(Skill s: l1)
		{
		 System.out.println(s.getSkilld()+" "+s.getSkillName());	
		}
		
		
	}
	
}
