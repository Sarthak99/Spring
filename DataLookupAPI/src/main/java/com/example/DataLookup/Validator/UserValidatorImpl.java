package com.example.DataLookup.Validator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Service;

@Service
public class UserValidatorImpl implements UserValidator {
	
	public boolean validateUser(String userName) {
		
		boolean valid = false;
		File userFile = new File("userlist.txt");
		String name = null;
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(userFile));
			while((name = bufferedReader.readLine())!=null) {
				if (userName.toLowerCase().equals(name.toLowerCase())) {
					valid = true;
					break;
				}
			}
		} catch(FileNotFoundException f) {
			f.printStackTrace();
			valid = false;
		} catch(Exception e) {
			e.printStackTrace();
			valid = false;
		} finally {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return valid;
		
	}

}
