package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import com.revature.models.Menu;
import com.revature.util.ConnectionUtil;

public class Launcher {

	public static void main(String[] args) {
		
		//here we're just testing whether our connection (from the ConnectionUtil Class) is successful
				try(Connection conn = ConnectionUtil.getConnection()){
				}catch(SQLException e) {
					e.printStackTrace();
				}

		Menu menu = new Menu();
		
		menu.display();

	}

}