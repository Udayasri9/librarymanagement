package librarymanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement {
	


	public static void main(String[] args) {
		
		char r;
		Scanner sc=new Scanner(System.in);
		String user="admin",pass="5252";
		System.out.println(" Enter User name ");
		user=sc.nextLine();
		System.out.println(" Enter Password ");
		pass=sc.nextLine();
		if(user.equals("admin")&&(pass.equals("5252"))) {
			System.out.println(" ------------ WELCOME -----------");
		
		
		do {
			System.out.println(" ------------- Library Management---------------");
			System.out.println(" 1. To Add Book ");
			System.out.println(" 2. To Issue Book ");
			System.out.println(" 3. To Return Book ");
			System.out.println(" 4. To Print Complete Details Of Book ");
			System.out.println(" 5. To Enter Members Details ");
			System.out.println(" 6. Books List ");
			System.out.println(" 7. Exit ");
			Scanner obj = new Scanner(System.in);
			System.out.println(" Enter Any Number ");
			int a = obj.nextInt();
			switch (a) {
			case 1:
				Library l = new Library();
				l.add();
				break;
			case 2:
				Library b = new Library();
				b.issue();
				break;
			case 3:
				Library c = new Library();
				c.Return();
				break;
			case 4:
				Library d = new Library();
				d.detail();
				break;
			case 5:
				Library e = new Library();
				e.membersdetails();

				break;
			case 6:
				Library o=new Library();
				o.book();
				break;
			case 7:
				Library y = new Library();
				y.exit();
				break;
			default:
				System.out.println(" Invalid Number ");
				break;
			}
			System.out.println(" Select Next Option  Yes/No ");
			r = obj.next().charAt(0);
		} while (r == 'y' || r == 'Y');
		if (r == 'n' || r == 'N') {
			Library f = new Library();
			f.exit();
		}
	}
	else {
		System.out.println(" Wrong username and password ");
	}

	}

}

class Library {
	static String name, name1, date1, mname;
	static int n, id, mid;
    static String mp;
  static void add() {
		System.out.println(" Enter Book Name , Prize , Book No ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		float price = sc.nextFloat();
		int bookno = sc.nextInt();
		System.out.println(" Book Details " +" name "+ name +" "+" price "+ price+" "+" book no " + bookno);
	}

	void issue() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Name ");
		name1 = sc.nextLine();
		System.out.println(" Book Name ");
		name = sc.nextLine();
		System.out.println(" Book Id ");
		id = sc.nextInt();

		System.out.println(" Return Book Date ");
		date1 = sc.nextLine();
		sc.nextLine();

	}

	int getid() {
		return id;
	}

	void Return() {
		System.out.println("  Book Id ");
		Scanner r = new Scanner(System.in);
		int bookid = r.nextInt();
		if (id == bookid) {
			System.out.println(" Total Details ");
			System.out.println(" Name " + Library.name1);
			System.out.println(" Book Name " + Library.name);
			System.out.println(" Book Id " + Library.id);
			System.out.println(" Book Return Date " + Library.date1);
		}
		else {
			System.out.println(" Wrong Id , Enter Correct Id ");
		}
	}

	void detail() {
		System.out.println(" Name " + Library.name1);
		System.out.println(" Book Name " + Library.name);
		System.out.println(" Book Id " + Library.id);
		System.out.println(" Book Return Date " + Library.date1);
	}

	void membersdetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Member Name ");
		mname = sc.nextLine();
		System.out.println(" Enter Member Id ");
		mid = sc.nextInt();
		
		System.out.println(" Member Details ");
		System.out.println(" Member Name " + Library.mname);
		System.out.println(" Member Id " + Library.mid);
		
	}

	
			void book() {
				ArrayList<String> al=new ArrayList<>();
				al.add(" The God of Small Things");
				al.add(" Harry Potter ");
				al.add(" Avengeres ");
				al.add(" 1984 ");
				al.add(" To Kill a Mockingbird ");
				al.add(" Pride and Prejudice ");
				al.add(" The Adventures of Huckleberry Finn");
				al.add(" One Hundred Years of Solitude ");
				al.add(" Beloved ");
				al.add(" Crime and Punishment ");
				al.add(" The Lord of the Rings ");
				al.add(" The Alchemist ");
				al.add(" Things Fall Apart ");
				al.add(" Brave New World ");
				al.add(" Catch-22 ");
				al.add(" A Suitable Boy ");
				al.add(" The White Tiger ");
				al.add(" The Palace of Illusions ");
				al.add(" Malgudi Days ");
				al.add(" The Great Indian Novel");
				al.add(" Wings of Fire ");
				ArrayList<Integer> a1=new ArrayList<>();
				a1.add(1);				
				a1.add(2);
				a1.add(3);
				a1.add(4);
				a1.add(5);
				a1.add(6);
				a1.add(7);
				a1.add(8);
				a1.add(9);
				a1.add(10);
				a1.add(11);
				a1.add(12);
				a1.add(13);
				a1.add(14);
				a1.add(15);
				a1.add(16);
				a1.add(17);
				a1.add(18);
				a1.add(19);
				a1.add(20);
				a1.add(21);
				
				
				int length = al.size();
				if (length != a1.size()) { 
					//fail
				}
				ArrayList<String> array3 = new ArrayList<String>(length); 
				for (int i = 0; i < length; i++) { 
				    array3.add(a1.get(i) + " " + al.get(i)); 
				}

				System.out.println(" Books List "+array3);
				
			}
			
			void exit() {
				System.exit(0);
			}
			
		
	}

