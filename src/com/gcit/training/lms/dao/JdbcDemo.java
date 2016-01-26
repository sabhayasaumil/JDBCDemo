package com.gcit.training.lms.dao;


import java.util.List;

import com.gcit.training.lms.entity.*;

public class JdbcDemo {

	public static void main(String[] args) {

		try {
			
				/*List<Book> list = new BookDAO().readByTitle("Lost");
				for(Book l:list)
				{
					System.out.println(l.getTitle());
					
				}*/
			
				List<Book> list = new BookDAO().readAll();
				
				for(Book l:list)
				{
					System.out.print("Title:- " + l.getTitle() + "\t Authors:- ");
					for(Author a: l.getAuthors())
						System.out.print(a.getAuthorName() + ",   ");
					System.out.println();
				}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
