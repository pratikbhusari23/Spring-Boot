package com.example.TuneIn;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import java.util.*;

@SpringBootApplication
public class TuneInApplication {

    public static void main(String[] args) {

        /*
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch User details from Console.
		3. Get the required bean from context.
		4. Get the songs from Console and add them to the playlist
		5. Display the playlist reference Id
		6. Display the list of songs with their reference Id
		 */

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.example.TuneIn");
		Scanner sc= new Scanner(System.in);

		User user = context.getBean(User.class);

		System.out.println("Welcome to Music Playlist Application");
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		Integer age = sc.nextInt();
		user.setUserDetail(name, age);

		while(true){

			MyPlaylist playlist = context.getBean(MyPlaylist.class);
			System.out.println("Do you want to add Songs to the Playlist\n1.Yes\n2.No");
			int choice = sc.nextInt();

				switch (choice) {
					case 1:{
						MySong song = context.getBean(MySong.class);
						System.out.println("Enter the name of the songs to be added");
						sc.nextLine();
						String nameOfSong = sc.nextLine();
						song.setName(nameOfSong);
						playlist.addSong(song);
						break;
					}
					case 2:{
					System.out.println("Your Playlist with reference Id "+user.getPlaylist().toString()+" is Ready");
					for(Song song : playlist.getPlaylistSongs()){
						System.out.println("Song Name : "+song.getSongName()+" Reference Id : "+song.toString());
					}
					break;
					}
					default:
						System.out.println("Invalid choice");
						break;
				}

				if(choice == 2){
					break;
				}
		}		



	}

}


/*

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = (User) context.getBean("myUser");
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Music Playlist Application");
		System.out.println("What is your name?");
		String name = sc.nextLine();
		System.out.println("What is your age?");
		Integer age = sc.nextInt();
		user.setUserDetail(name, age);

		while(true){

			MyPlaylist playlist = (MyPlaylist) context.getBean("myPlaylist");
			System.out.println("Do you want to add Songs to the Playlist\n1.Yes\n2.No");
			int choice = sc.nextInt();

				switch (choice) {
					case 1:{
						MySong song = (MySong) context.getBean("mySong");
						System.out.println("Enter the name of the songs to be added");
						sc.nextLine();
						String nameOfSong = sc.nextLine();
						song.setName(nameOfSong);
						playlist.addSong(song);
						break;
					}
					case 2:{
					System.out.println("Your Playlist with reference Id "+user.getPlaylist().toString()+" is Ready");
					for(Song song : playlist.getPlaylistSongs()){
						System.out.println("Song Name : "+song.getSongName()+" Reference Id : "+song.toString());
					}
					break;
					}
					default:
						System.out.println("Invalid choice");
						break;
				}

				if(choice == 2){
					break;
				}
		}



 */