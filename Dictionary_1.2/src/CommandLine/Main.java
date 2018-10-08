package CommandLine;

import java.util.Scanner;


public class Main
{
	public static void main(String[] args) 
	{
		DictionaryCommandLine dictionary_command_line = new DictionaryCommandLine();
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Insert From Commandline");
		System.out.println("2. Show All Words");
		System.out.println("3. Dictionary Lookup");
		System.out.println("4. Dictionary Searcher");
		System.out.println("5. Export To File");
		System.out.println("6. Delete One Word From Dictionary");
		System.out.println("7. Exit");
		while(true){
			int number = Integer.parseInt(scan.nextLine());
			switch(number){
				case 1 : { dictionary_command_line.setDictionaryManagement();
							break;}
				case 2 : { dictionary_command_line.Show();
							break;}
				case 3 : { dictionary_command_line.LookUp();
							break;}
				case 4 : { dictionary_command_line.Searcher();
							break;}
				case 5 : { dictionary_command_line.Export();
							break;}
				case 6 : { dictionary_command_line.Delete();
							break;}
				case 7 : { System.out.println("Goodbye!");
							break;}
				default: break;
			}
			if(number==7) break;
		}
	}
	}
