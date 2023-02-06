package com.cruds.test;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {

		Book [] books  = new Book[3];
		Scanner sc = new Scanner (System.in);

		for(int i=0; i< books.length; i++)
		{
			System.out.println("Please enter the title:");
			String title = sc.nextLine();

			System.out.println("Please enter the author:");
			String author = sc.nextLine();

			System.out.println("Please enter the price: ");
			double price = sc.nextFloat();
			sc.nextLine();

			books[i] = new Book (author,title, price);
		}
		System.out.println("Please enter a title to search:");
		String searchTitle = sc.nextLine();

//		boolean found = false;
		Book found = null;
		for ( Book b: books)
		{
			if (b != null)
			{
				if (searchTitle.equals(b.getTitle()))
				{
				//	found = true;
					found = b;
					break;
				}
			}
		}
		if (found != null)
		{
			System.out.println(searchTitle + " found");
			found.toString();
		}
		else
		{
			System.out.println(" Sorry" + searchTitle + " not found");
		}

		sc.close();

	}

}
