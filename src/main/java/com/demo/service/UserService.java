package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.user.User;

@Service
public class UserService {

	
	public final List<User>userlist =new ArrayList<>();
	
	public void add(User user)
	{
	user.setStatus("online");
	userlist.add(user);	
	}
	
	
	public User login(User user)
	{
		for(int j=0;j<userlist.size();j++)
		{
			if(userlist.get(j).getEmail().equals(user.getEmail()))
			{
				return user;
			}
		}
		return null;
		
		
		
	}
	
	public void logout(String email)
	{
		for(int j=0;j<userlist.size();j++)
		{
			if(userlist.get(j).getEmail().equals(email))
			{
				userlist.get(j).setStatus("offline");
			}
		}
	
		
	}
	
	
	
}
