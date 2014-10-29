
import java.util.*;
public class Encrypt
{
 public static void main (String[] args)
 {
        System.out.println("Encryption Progam test. ");
          String plainText = "";

          int topSecret = 0;
          int howMany = 0;
          char aCharactor;
          int theConverted = 0;
          char[][] Keys = new char[][]  { {'m', 'f', 't', 'y', 'q', 's', 'c', 'z', 'o', 'k', 'w', 'h', 'e', 'j', 'i', 'l', 'v', 'n', 'p', 'x', 'r', 'g', 'd', 'a', 'u', 'b'},
                             {'z', 'u', 'w', 'o', 'l', 'f', 'a', 'd', 'j', 'r', 'p', 'm', 'g', 'b', 'e', 'y', 'v', 's', 'n', 'k', 'h', 'i', 'c', 'x', 'q', 't'},
                             {'l', 'f', 'o', 'j', 'k', 'z', 'x', 'v', 'w', 'r', 'y', 'u', 't', 'p', 'g', 'h', 'm', 's', 'e', 'n', 'q', 'i', 'b', 'd', 'c', 'a'},
                             {'v', 'x', 'p', 's', 'm', 'f', 'j', 'a', 'b', 'z', 'y', 'l', 'k', 'q', 't', 's', 'w', 'n', 'o', 'g', 'i', 'h', 'e', 'c', 'd', 'r'},
                             {'w', 'x', 't', 'u', 'q', 'z', 's', 'o', 'p', 'v', 'r', 'y', 'f', 'b', 'd', 'k', 'm', 'h', 'e', 'g', 'c', 'i', 'n', 'j', 'l', 'a'} };

        Scanner scan = new Scanner (System.in);

    	for(int p=0; p<5; p++){
			System.out.println();
		}
        System.out.println("Please Enter A Message: ");
	    plainText = scan.nextLine();
        System.out.println("OK Now Please Enter Your TopSecret Key Number For The Day, 1-4: ");
        topSecret = scan.nextInt();
        System.out.println("Could You Please Also Enter The Number Of Charactors In The Message? ");
        System.out.println("Thank You. ");
        howMany = scan.nextInt();
        char [] aCharr = new char[howMany];
        int  [] letterToNumber = new int[howMany];
        char [] cipherText = new char[howMany];
        for(int p=0; p<5; p++){
					System.out.println();
		}
		System.out.println("Please Record Your Key:");
		 for (int i=0; i<Keys.length; i++){

		     System.out.print("Key number " + i +" is: " + Keys[i]);
		     System.out.println();
		     System.out.println();
	     }

        for (int r=0; r<100; r++)
        {
          System.out.println();
        }
        for(int f=0; f<aCharr.length; f++){
             aCharactor = plainText.charAt(f);
			 aCharr[f] = aCharactor;

        }
        System.out.println("Was This Your Message?, If Not Press Control-c And Run This Again");
 		System.out.println(aCharr);
 		for(int z=0; z<aCharr.length; z++){
			if(aCharr[z] =='A'){
				theConverted = 1;

			}else if (aCharr[z] == 'B'){
				theConverted  = 2;

		    }else if (aCharr[z] == 'C'){
				theConverted  = 3;

		    }else if (aCharr[z] == 'D'){
				theConverted  = 4;

		    }else if (aCharr[z] == 'E'){
				theConverted  = 5;

		    }else if (aCharr[z] == 'F'){
				theConverted  = 6;

		    }else if (aCharr[z] == 'G'){
				theConverted  = 7;

		    }else if (aCharr[z] == 'H'){
				theConverted  = 8;

		    }else if (aCharr[z] == 'I'){
				theConverted  = 9;

		    }else if (aCharr[z] == 'J'){
				theConverted  = 10;

		    }else if (aCharr[z] == 'K'){
				theConverted  = 11;

	   		}else if (aCharr[z] == 'L'){
				theConverted  = 12;

		    }else if (aCharr[z] == 'M'){
				theConverted  = 13;

		    }else if (aCharr[z] == 'N'){
				theConverted  = 14;

		    }else if (aCharr[z] == 'O'){
				theConverted  = 15;

		    }else if (aCharr[z] == 'P'){
				theConverted  = 16;

	   		}else if (aCharr[z] == 'Q'){
				theConverted  = 17;

	   		}else if (aCharr[z] == 'R'){
				theConverted  = 18;

	   		}else if (aCharr[z] == 'S'){
				theConverted  = 19;

	   		}else if (aCharr[z] == 'T'){
				theConverted  = 20;

	   		}else if (aCharr[z] == 'U'){
				theConverted  = 21;

	   		}else if (aCharr[z] == 'V'){
				theConverted  = 22;

	   		}else if (aCharr[z] == 'W'){
				theConverted  = 23;

	   		}else if (aCharr[z] == 'X'){
				theConverted  = 24;

	   		}else if (aCharr[z] == 'Y'){
				theConverted = 25;

	   		}else if (aCharr[z] == 'Z'){
				theConverted = 26;
	   		}else if(aCharr[z] == '?'){
				System.out.println("error");
		}
	   		letterToNumber[z] = theConverted;
	 	}
	 	if(topSecret == 1){
		for(int m = 0; m<aCharr.length; m++){
            int aNumber = aCharr[m];


			char topSecretChar;
			switch (aNumber) {
			            case 1:  topSecretChar = 'M';
			                     break;
			            case 2:  topSecretChar = 'F';
			                     break;
			            case 3:  topSecretChar = 'T';
			                     break;
			            case 4:  topSecretChar = 'Y';
			                     break;
			            case 5:  topSecretChar = 'Q';
			                     break;
			            case 6:  topSecretChar= 'S';
			                     break;
			            case 7:  topSecretChar = 'C';
			                     break;
			            case 8:  topSecretChar = 'Z';
			                     break;
			            case 9:  topSecretChar = 'O';
			                     break;
			            case 10: topSecretChar = 'K';
			                     break;
			            case 11: topSecretChar = 'W';
			                     break;
			            case 12: topSecretChar = 'H';
			            		 break;
			            case 13: topSecretChar = 'E';
								 break;
					    case 14: topSecretChar = 'J';
							 	 break;
					    case 15: topSecretChar = 'I';
								 break;
						case 16: topSecretChar = 'L';
								 break;
						case 17: topSecretChar = 'V';
								 break;
					    case 18: topSecretChar = 'N';
								 break;
						case 19: topSecretChar = 'P';
								 break;
					    case 20: topSecretChar = 'X';
								 break;
						case 21: topSecretChar = 'R';
								 break;
						case 22: topSecretChar = 'G';
								 break;
					    case 23: topSecretChar = 'D';
					    		 break;
					    case 24: topSecretChar = 'A';
								 break;
						case 25: topSecretChar = 'U';
								 break;
					    case 26: topSecretChar = 'B';
							     break;
			            default: topSecretChar = '!';
			                     break;

 				 }
 				 cipherText[m] = topSecretChar;
		}
	}else{
		System.out.print("You didn't pick a vaild key, sorry : ( ");
	}
		System.out.println(letterToNumber);
		System.out.println(cipherText);




 }
}
