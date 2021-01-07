import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * 
 * @author saidJhofiani
 * date 2-17-16
 * purpose: This code is the project designed too calculate the seconds given into mins,
 * hours, days.
 * 
 */
public class timeCalc {

	public static void main(String[] args) {
		
		int seconds;
		int hours = 0;
		int days = 0;
		int minutes = 0;
		int hello; 
		int seconds1 = 0;
		
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter ya seconds boy, for the time calculator");
        
		seconds = keyBoard.nextInt();   
		hello = seconds;
		
		while (seconds >= 0){
			if (seconds >= 60){
				if (seconds >= 3600){
					if (seconds >= 86400){
        
					days = (seconds / 86400);         		
					seconds = (seconds % 86400 - days);
					}
						hours = (seconds / 3600);
						seconds = (seconds % 3600 - hours);
				}
		
							minutes = (seconds / 60);
							seconds = (seconds % 60 - minutes);
			}
									seconds1 = seconds;
									break;
		}
       
        if (hello > 86400){
        	System.out.println("You entered "+ seconds + ", which is "+ days + " days, " + hours + 
					" hours, " + minutes + " minutes and " + seconds1 + " seconds.");
        }
       else if (hello > 3600){
        	System.out.println("You entered "+ seconds + ", which is "+ hours + 
					" hours, " + minutes + " minutes and " + seconds1 + " seconds.");
        }
        else if ( hello > 60){
        	System.out.println("You entered "+ seconds + ", which is "+ 
					 minutes + " minutes and " + seconds + " seconds.");
        }
        else if ( hello > 0){
        	System.out.println("You entered "+ seconds + ", which is "+
					 + seconds + " seconds." + ("(Enter a higher value)"));
        }
            if ( days > 0){           
            System.out.print("(" + days+ " days " + hours + ":" +minutes+ ":" +seconds1+ " Hours.)");
            }
            else if ( hours > 0){     
            System.out.print("(" +hours + ":" +minutes+ ":" +seconds1+ " Hours.)");
            }
            else if ( minutes > 0){     
            System.out.print("(" + minutes + ":" +seconds1+ " Minutes.)");
            }           
	     }
	}

