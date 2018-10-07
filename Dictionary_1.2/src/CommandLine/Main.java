package CommandLine;

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		DictionaryCommandLine dictionary_command_line = new DictionaryCommandLine();
		dictionary_command_line.setTxtDictionaryManagement();
		
		Scanner scan = new Scanner(System.in);
		while(true){
			dictionary_command_line.listOfOptions();
			int number = scan.nextInt();
			switch(number){
				case 1 : { dictionary_command_line.setDictionaryManagement();
							break;}
				case 2 : { dictionary_command_line.showAllWords();
							break;}
				case 3 : { dictionary_command_line.setDictionaryLookup();
							break;}
				case 4 : { dictionary_command_line.dictionarySearcher();
							break;}
				case 5 : { dictionary_command_line.exportDictionaryManagerment();
							break;}
				case 6 : { dictionary_command_line.deleteWordInDictionary();
							break;}
				case 7 : { System.out.println("Goodbye!");
							break;}
				default: break;
			}
			if(number==7) break;
		}
	}
}
