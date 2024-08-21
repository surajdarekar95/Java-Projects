package Com.MusicSystem.Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main_Music {

	private static ArrayList<Album> albums = new ArrayList<>();

	public static void main(String[] args) {

		Album album = new Album("album1", "AC/DC");
		album.addSong("TNT", 4.5);
		album.addSong("kesariya", 4.8);
		album.addSong("duriya", 4.0);
		album.addSong("kalank", 4.4);
		album.addSong("kya chahiye", 4.7);

		album = new Album("album2", "Arjit");

		album.addSong("XNS", 5.5);
		album.addSong("FDS", 5.2);
		album.addSong("WERT", 5.20);
		album.addSong("WEFD", 5.30);

		albums.add(album);

		LinkedList<Song> Playlist1 = new LinkedList<>();
		albums.get(0).addToPlaylist("TNT", Playlist1);
		albums.get(0).addToPlaylist("kalank", Playlist1);
		albums.get(1).addToPlaylist("XNS", Playlist1);
		albums.get(1).addToPlaylist("WERT", Playlist1);

		play(Playlist1);

	}

	private static void play(LinkedList<Song> playlist) {
		Scanner sc = new Scanner(System.in);
		boolean quit = false;
		boolean forward = true;
		ListIterator<Song> listIterator = playlist.listIterator();

		if (playlist.size() == 0) {
			System.out.println("This playlist have no song");
		} else {
			System.out.println("Now Playing " + listIterator.next().toString());
			printmenu();
		}

		while (!quit) {
			int action = sc.nextInt();
			sc.nextLine();

			switch (action) {

			case 0:
				System.out.println("playlist complete");

				quit = true;
				break;

			case 1:
				if (!forward) {
					if (listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}

				if (listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("No song available ");
					forward = false;
				}

				break;

			case 2:
				if (forward) {
					if (listIterator.hasPrevious()) {
						listIterator.previous();
					}

					forward = false;

				}

				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("we are at the first song");
					forward = false;
				}
				break;

			case 3:

				if (forward) {
					if (listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("we are at the start of the list");
					}

				} else {
					if (listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("we have reached at end");
					}
				}

				break;

			case 4:
				printList(playlist);
				break;
			case 5:
				printmenu();
				break;
			case 6:
				if (playlist.size() > 0) {
					listIterator.remove();
					if (listIterator.hasNext()) {
						System.out.println("Now Playing " + listIterator.next().toString());

					} else {
						if (listIterator.hasPrevious())
							System.out.println("Now playing " + listIterator.previous().toString());

					}
				}

			}
		}

	}

	private static void printmenu() {
		System.out.println("Available options \n press");
		System.out.println("0 - to quite\n " + "1 - to play next song\n " + "2 - to play previous song\n"
				+ "3 - to replay the current song \n" + "4 - list of all songs\n" + "5 - print all availalbe options "
				+ "6 - delete current song");
	}

	public static void printList(LinkedList<Song> playlist) {
		Iterator<Song> iterator = playlist.iterator();
		System.out.println("----------------");

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("----------------");

	}

}
