import java.lang.*;
import java.util.*;
import classes.*;
import fileio.*;
import javax.swing.*;

public class Start{
	 private static void pressAnyKeyToContinue()
 { 
        System.out.println("\n\nPress Enter key to continue...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
 }
 
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		Stationary f = new Stationary();
		FileReadWriteDemo frwd = new FileReadWriteDemo();

		System.out.println("\n\n\n\n\t\t===================================================");
		System.out.println("\n\n\n\n\t\t      WelCome to Stationary Management System");
		System.out.println("\n\n\n\n\t\t=================================================\n");

	

		boolean repeat=true;

		while(repeat){
			int choice=0;
			boolean flag=false;

			do
			{
				sc=new Scanner(System.in);
				try {
		System.out.println("===================================================");
		System.out.println("            WELCOME to MAIN MENU");
		System.out.println("=================================================\n");
			System.out.println("Select your option ");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Stationary Management");
			System.out.println("\t3. Stationary Products Management");
			System.out.println("\t4. Products Quantity Add-Sell");
			System.out.println("\t5. Exit");
			System.out.println("-------------------------------------------");
			System.out.print("Eneter you choice: ");
			choice = sc.nextInt();
			flag=true;
			
			}
			catch(Exception e){
		    	 //System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 JOptionPane.showMessageDialog(null, "\n\nError Input. \n\rPlease Try Again\n\n", "       WRONG INPUT TYPE", 3);
				 pressAnyKeyToContinue();
		    }
			}
			while(!flag);
			
			switch(choice){

				case 1:
				
				int choice1=0;
				boolean flg=false;

			do
			{
				sc=new Scanner(System.in);
				try {
						System.out.println("\n\n\n-------------------------------------------");
						System.out.println("               Employee Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Employee");
						System.out.println("\t2. Remove Existing Employee");
						System.out.println("\t3. Show All Employees");
						System.out.println("\t4. Search a Employee");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						choice1 = sc.nextInt();
							flg=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 pressAnyKeyToContinue();
		    }
			}while(!flg);

						switch(choice1){
							case 1: 
							
							boolean fla=false;

			do
			{
				sc=new Scanner(System.in);
				try {

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("              Insert New Employee");
									System.out.println("-------------------------------------------");
							
									System.out.print("Employee  ID : ");
									String empId1 = sc.next();
									System.out.print("Employee Name : ");
									String name1 = sc.next();
									System.out.print("Employee Salary : ");
									double salary1 = sc.nextDouble();
									

									Employee e1 = new Employee(empId1, name1, salary1);

									if(f.insertEmployee(e1)){
										System.out.println("Employee Inserted Successfully.");
										System.out.print("Name : "+ name1+ ",   Id: "+ empId1);
										
									}
									else{
										System.out.println("Employee can not be created now. Try again later");}
										fla=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 
		    }
			}while(!fla);


									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;

							case 2 :

									boolean flb=false;

			do
			{
				sc=new Scanner(System.in);
				try {
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("               Remove Employee");
									System.out.println("-------------------------------------------");
							
									System.out.print("Employee  ID: ");
									String empId2 = sc.next();

									Employee e2 = f.searchEmployee(empId2);

									System.out.println("Are You sure you want to delete this Employee? ");
									System.out.print("Press 1 to delete Employee  ");

									int delete = sc.nextInt();

									if(delete==1){

										if(e2 != null){
											if(f.removeEmployee(e2)){
												System.out.println("Employee ID " +empId2 +" Removed Successfully.");
											}
											else{System.out.println("Employee can not be removed now. Try again later");}
										}
										else{System.out.println("No Employee found.");}
									}
									else{System.out.println("Account is not deleted. Thanks for come back");}
									flb=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 
		    }
			}while(!flb);


									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;
							case 3: 


									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("              Show All Employee");
									System.out.println("-------------------------------------------");

									f.showAllEmployees();


									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;

							case 4 :
							boolean flc=false;

				do
				{
					sc=new Scanner(System.in);
					try {
				
				

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("              Search Employee");
									System.out.println("-------------------------------------------");
									
									System.out.print("Employee  ID: ");
									String empId4 = sc.next();

									Employee e4 = f.searchEmployee(empId4);

									if(e4!= null){
										System.out.println("\n\n---------------------------------------------------\n");
										System.out.println("Employee has been founded.");
										System.out.println("Employee ID : "+e4.getEmpId());
										System.out.println("Employee Name : "+e4.getName());
										System.out.println("Employee Salary : "+e4.getSalary());
										System.out.println("\n---------------------------------------------------\n");
									}
									else{System.out.println("No Employee found.");}
									flc=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 
		    }
			}while(!flc);


									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;

							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");


									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");


									System.out.println("\n\n#######################################################\n\n");

						
								break;
						}

					break;
			
			case 2 :
			int choice2=0;
			boolean flc=false;

			do
			{
				sc=new Scanner(System.in);
				try {
				

						System.out.println("\n\n===============================================");
						System.out.println("               SHOP MANAGEMENT");
						System.out.println("================================================");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Stationary");
						System.out.println("\t2. Remove Existing Stationary");
						System.out.println("\t3. Show All Stationary");
						System.out.println("\t4. Search a Stationary");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
					    choice2 = sc.nextInt();
						
				flc=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 pressAnyKeyToContinue();
		    }
			}while(!flc);


						switch(choice2){
							case 1: 
							boolean fld=false;

			do
			{
				sc=new Scanner(System.in);
				try {

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("           Insert Stationary");
									System.out.println("-------------------------------------------");
							
									System.out.print("Stationary  ID: ");
									String rid1 = sc.next();
									System.out.print("Stationary  Name: ");
									String name1 = sc.next();

									Shop r1 = new Shop(rid1, name1);

									if(f.insertStationary(r1)){
										System.out.print("Stationary  Inserted Successfully.");
										System.out.print("Name "+ name1+ ",  Id  "+rid1);
									}
									else{System.out.println("Stationary  can not be created now. Try again later");}
									
				fld=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 //pressAnyKeyToContinue();
		    }
			}while(!fld);

									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;

							case 2 :
							boolean fle=false;

			do
			{
				sc=new Scanner(System.in);
				try {
				

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("             Remove Stationary");
									System.out.println("-------------------------------------------");
							
									System.out.print("Stationary   ID: ");
									String rid2 = sc.next();

									Shop r2 = f.searchStationary (rid2);

									System.out.println("Are You sure you want to delete this Stationary? ");
									System.out.print("Press 1 to delete Stationary  ");

									int delete = sc.nextInt();

									if(delete==1){

										if(r2 != null){
											if(f.removeStationary (r2)){
												System.out.print("Stationary  ID " + rid2+ " Removed Successfully.");
											}
											else{System.out.println("Stationary  can not be removed now. Try again later");}
										}
										else{System.out.println("No Stationary  found.");}
									}
									else{System.out.println("Stationary is not deleted. Thanks for come back");}
									fle=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 //pressAnyKeyToContinue();
		    }
			}while(!fle);
									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;
							case 3: 

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("              Show All Stationary");
									System.out.println("-------------------------------------------");

									f.showAllStationary ();

									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;

							case 4 :
							boolean flf=false;

							do
							{
								sc=new Scanner(System.in);
								try {
				

									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("              Search Stationary");
									System.out.println("-------------------------------------------");
									
									System.out.print("Stationary   ID: ");
									String rid4 = sc.next();

									Shop r4 = f.searchStationary(rid4);

									if(r4!= null){
										System.out.println("Stationary has been founded.");
										System.out.println("---------------------------------------------");
										System.out.println("Stationary ID : "+r4.getRid());
										System.out.println("Stationary Name : "+r4.getName());
										System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
										r4.showAllProductItems();
										System.out.println("---------------------------------------------");
									}
									else{System.out.println("No Stationary found.");}
									flf=true;
			
								}
								catch(Exception e){
									 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
									 //pressAnyKeyToContinue();
								}
								}while(!flf);
									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;

							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

						
								break;
						}

					break;
					

				case 3: 
				int choice3=0;
				
				boolean fld=false;

			do
			{
				sc=new Scanner(System.in);
				try {
				

						System.out.println("\n\n-------------------------------------------");
						System.out.println("             Product Management");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Insert New Products");
						System.out.println("\t2. Remove Existing Products");
						System.out.println("\t3. Show All Products");
						System.out.println("\t4. Search a Products");
						System.out.println("\t5. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						choice3 = sc.nextInt();
							fld=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 pressAnyKeyToContinue();
		    }
			}while(!fld);


						switch(choice3){

							case 1: 
							
							boolean flh=false;

							do
							{
								sc=new Scanner(System.in);
								try {
				
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("             Insert New Products");
									System.out.println("-------------------------------------------\n");

									System.out.print("Stationary ID: ");
									String rid3 = sc.next();

									if(f.searchStationary(rid3) != null){

										/*System.out.println("Which types of food do you want to insert ?");
										System.out.println("\t1. Writing Products");
										System.out.println("\t2. Arts & Crafts");
										System.out.println("\t3. Go Back");
								
										System.out.print("Enter Food Type: ");
										int choice31 = sc.nextInt();

										switch(choice31){
											case 1: */
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Products Id : ");
													String fid31 = sc.next();

													System.out.print("Products Name: ");
													String name31 = sc.next();

													System.out.print("Available Quantity : ");
													int availableQuantity31 = sc.nextInt();
									
													System.out.print("Products Price : ");
													double price31 = sc.nextDouble();
									
													System.out.print("Products Category : ");
													String category31 = sc.next();

													ProductItem m31 = new Product(fid31,name31,availableQuantity31 ,price31, category31 );
													
													if(f.searchStationary(rid3).insertProductItem(m31))
													{
														System.out.println("Products Id Number "+ fid31 +" inserted for "+ rid3);
													}
													else
													{
														System.out.println("Products Can Not be inserted");
													}
													flh=true;
												
												
												     
													 pressAnyKeyToContinue();

													System.out.println("\n\n#######################################################\n\n");
													
													

												//break;

											/*case 2 :

													
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.print("Products Id : ");
													String fid32 = sc.next();

													System.out.print("Products Name: ");
													String name32 = sc.next();

													System.out.print("Available Quantity : ");
													int availableQuantity32 = sc.nextInt();
									
													System.out.print("Products Price : ");
													double price32 = sc.nextDouble();
									
													System.out.print("Products Size : ");
													String size32 = sc.next();

													ProductItem m32 = new Product(fid32,name32, availableQuantity32 ,price32, size32  );

													if(f.searchStationary(rid3).insertProductItem(m32))
													{
														System.out.println("Product Id Number "+ fid32 +" inserted for "+ rid3);
													}
													else
													{
														System.out.println("Product Item Can Not be inserted");
													}

													System.out.println("\n\n#######################################################\n\n");
													

												

											case 3: 
													
													System.out.println("\n\n#######################################################\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("Going Back to the main menu...............");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n#######################################################\n\n");
													

												break;

											default: 

													
													System.out.println("\n\n#######################################################\n\n");
													System.out.println("-------------------------------------------");
													System.out.println("Invalid option . Try again...............");
													System.out.println("-------------------------------------------");
													System.out.println("\n\n#######################################################\n\n");
													

												break;
											}*/
										}

									else{
										
										System.out.println("Product Id does not match. Try again.");
										
										}
										}
												catch(Exception e){
													 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
													// pressAnyKeyToContinue();
												}
												}while(!flh);
									System.out.println("\n\n#######################################################\n\n");
											pressAnyKeyToContinue();
												
								break;
			
							case 2 :
							String rid322="";
							boolean plc=false;

						do
						{
							sc=new Scanner(System.in);
							try {
				

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("               Remove Products");
									System.out.println("-------------------------------------------\n\n");

									System.out.print("Stationary ID: ");
									rid322 = sc.next();

									if(f.searchStationary(rid322) != null){
									Shop r322 = f.searchStationary(rid322);
									System.out.print("Products ID: ");
									String fid322 = sc.next();

									ProductItem f322 = r322.searchProductItem(fid322);

										if(f322!= null){
											System.out.println("Are You sure you want to delete this Products? ");
											System.out.print("Press 1 to delete Products ");

											int delete = sc.nextInt();

											if(delete==1){
												if(r322.removeProductItem(f322)){
													System.out.print("Product Removed Successfully.");
												}
												else{System.out.println("Product can not be removed now. Try again later");}
												}
										
											else{System.out.println("Products are not deleted. Thanks for come back");}
											}
										else{System.out.println("No Products found.");}
									}
									else{System.out.println("No Stationary found.");}
									plc=true;
						
						}
						catch(Exception e){
							 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
							 pressAnyKeyToContinue();
						}
						}while(!plc);


									System.out.println("\n\n#######################################################\n\n");
													pressAnyKeyToContinue();
									break;

							case 3:
							String rid332="";

									boolean pls=false;

			do
			{
				sc=new Scanner(System.in);
				try {
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("              Show All Products");
									System.out.println("-------------------------------------------\n\n");


									System.out.print("Stationary  ID: ");
									rid332 = sc.next();

									Shop r332 = f.searchStationary(rid332);

									if(f.searchStationary(rid332)!=null){
									System.out.println("Stationary has been founded.");
									r332.showAllProductItems();
									}

									else{System.out.println("No Stationary found.");}
										pls=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 pressAnyKeyToContinue();
		    }
			}while(!pls);
									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();

								break;
			
							case 4 : 

									boolean pla=false;

			do
			{
				sc=new Scanner(System.in);
				try {
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("               Search Products");
									System.out.println("-------------------------------------------\n\n");
									
									System.out.print("Stationary ID: ");
									String rid44 = sc.next();

									if(f.searchStationary(rid44) != null){
									Shop r44 = f.searchStationary(rid44);
									System.out.print("Product  ID: ");
									String fid44 = sc.next();

									ProductItem f44 = r44.searchProductItem(fid44);

									if(f44!= null){
										System.out.println("Product has been founded.");
										System.out.println("\n-------------------------------------------\n");
										r44.showAllProductItems();
										System.out.println("\n-------------------------------------------\n");
									}
									else{System.out.println("No Products found.");}
									}

									else{System.out.println("No Stationary found.");}
									pla=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 pressAnyKeyToContinue();
		    }
			}while(!pla);

									System.out.println("\n\n#######################################################\n\n");
									pressAnyKeyToContinue();
			
								break;
							case 5: 
									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");
			
								break;
			
							default :

									
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");
			
								break;
						}



					break;

				case 4 :
				int choice4=0;
				
				boolean pla=false;

			do
			{
				sc=new Scanner(System.in);
				try {
						System.out.println("-------------------------------------------");
						System.out.println("         Products Quantity Add-Sell");
						System.out.println("-------------------------------------------");

						System.out.println("Select your option ");
						System.out.println("\t1. Add  Products");
						System.out.println("\t2. Sell  Products");
						System.out.println("\t3. Show Add Sell History");
						System.out.println("\t4. Go Back");
						System.out.println("-------------------------------------------");
						System.out.print("Eneter you choice: ");
						choice4 = sc.nextInt();
							pla=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\nError Input. \n\rPlease Try Again\n\n");
				 pressAnyKeyToContinue();
		    }
			}while(!pla);
						switch(choice4){
							case 1: 
								System.out.println("\n\n#######################################################\n\n");
								System.out.println("-------------------------------------------");
								System.out.println("                Add Products");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Stationary ID: ");
								
								String rid411 = sc.next();

								if(f.searchStationary(rid411) != null){

									System.out.print("Enter Product ID: ");
								
									String fid411 = sc.next();

									if(f.searchStationary(rid411).searchProductItem(fid411) != null){

										System.out.print("Added Products Quantity : ");
										int amount1 = sc.nextInt();
										if(f.searchStationary(rid411).searchProductItem(fid411).addQuantity(amount1)){

										System.out.println("Products Amount Added ....");
										frwd.writeInFile("Amount : " +amount1 + "  added in "+ fid411+ " by "+ rid411,"fileio/History.txt");
										}
										else{System.out.println("Can Not Added");}
									}
									else{System.out.println("Invalid Products Id Number");}

								}
								else{System.out.println("Stationary ID  does not MATCH");}
								System.out.println("\n\n#######################################################\n\n");
								pressAnyKeyToContinue();


								break;

							case 2 : 
								System.out.println("\n\n#######################################################\n\n");
								System.out.println("-------------------------------------------");
								System.out.println("                Sell Products");
								System.out.println("-------------------------------------------");

								System.out.print("Enter Stationary ID: ");
								
								String rid412 = sc.next();

								if(f.searchStationary(rid412) != null){

									System.out.print("Enter Product ID: ");
								
									String fid412 = sc.next();

									if(f.searchStationary(rid412).searchProductItem(fid412) != null){

										System.out.print("Selled Products Quantity : ");
										int amount2 = sc.nextInt();
										if(f.searchStationary(rid412).searchProductItem(fid412).sellQuantity(amount2)){

										System.out.println("Products Selled ....");
										frwd.writeInFile("Amount : " +amount2 + " Selled in "+ fid412+ " From "+ rid412,"fileio/History.txt");
										}
										else{System.out.println("Can Not Selled");}
									}
									else{System.out.println("Invalid Product Id Number");}

								}
								else{System.out.println("Stationary ID   MISMATCH");}
								pressAnyKeyToContinue();

								break;
							case 3: 
								System.out.println("\n\n#######################################################\n\n"); 
								System.out.println("-------------------------------------------");
								System.out.println("              ADD SELL History");
								System.out.println("-------------------------------------------");
									boolean pld = false;
						
							sc = new Scanner(System.in);	
							try{

								frwd.readFromFile("fileio/History.txt");
								 
								pld=true;
			
			}
			catch(Exception e){
		    	 System.out.print("\n\n**There Is nothing to show \n\r Please Try Again later**\n\n");
				 pressAnyKeyToContinue();
		    }
			
								System.out.println("\n\n#######################################################\n\n");
								pressAnyKeyToContinue();

								break;

							case 4 :
									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Going Back to the main menu...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");

								break;

							default :

									System.out.println("\n\n#######################################################\n\n");
									System.out.println("-------------------------------------------");
									System.out.println("Invalid option . Try again...............");
									System.out.println("-------------------------------------------");
									System.out.println("\n\n#######################################################\n\n");


								break;
							}			

					break;
				case 5: 
						
						System.out.println("\n\n#######################################################\n\n");
						repeat=false;
						System.out.println("-------------------------------------------");
						System.out.println("Thanks for being with us...............");
						System.out.println("-------------------------------------------");
						System.out.println("\n\n#######################################################\n\n");
						
					break;

				default :

						
						/*System.out.println("\n\n#######################################################\n\n");
						System.out.println("-------------------------------------------");
						//System.out.println("Invalid option . Try again...............");*/
						System.out.println("\n\n\n\n");
						JOptionPane.showMessageDialog(null, "Invalid option . Try again", "  \t\t            Warning", 0);/*
						System.out.println("-------------------------------------------");
						System.out.println("\n\n#######################################################\n\n");
*/System.out.println("\n\n\n\n");

					break;
			}
		
		}
	}
}