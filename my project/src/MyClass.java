 package newyeargift;
 
 import java.util.*;
 
 public class GiftAnalysis{
	 static Scanner input = new Scanner(System.in);
	 static ArrayList<Chocolate> chocolates = new ArrayList<Chocolate>();
	 static ArrayList<Chocolate>candies = new ArrayList<Chocolate>();
	 static ArrayList<Sweet>sweets = new ArrayList<Sweet>();
	 static HashMap<String,Integer> nametoWeight = new HashMap<String,Integer>();
	 static HashMap<String,Integer> nametoPrice = new HashMap<String,Integer>();
	 
	 public static void main(String[] args) {
		 
		 input chocolates();
		 input sweets();
		 System.out.println("total weight of the gift:" + caltotalweight());
		 System.out.println("choose the way to sort:(enter the no): 1. By Price 2. By Weight");
		 int sortType = input.nextInt();
		 
		 if (sortType==1) {
			 
			 Comparator<Chocolate> compareByPrice = (Chocolate c1, Chocolate c2) -> ((Integer)c1.getPrice())
	         .compareTo(c2.getPrice());
			 Collections.sort(chocolates, compareByprice);
			 
		 }  else {
			 
			 Comparator<Chocolate> compareByWeight = (Chocolate c1, Chocolate c2) ->((Integer) c1.getWeight())
					 .compareTo(c2.getWeight());
			 Collections.sort(chocolates, compareByweight);
		 }
		 System.out.println("The sorted result:");
		 for (Chocolate chocolate : chocolates) {
			 
			 System.out.println(chocolate.getprice());
		 }
		 calcRange(sortType);
		 
	 }
      public static void inputChocolates() {
    	  
    	  System.out.println("Enter the no of chocolates in gifts:\n");
    	  int numberOfChocolates = input.nextInt();
    	  for(int chocoCount = 1;chocoCount <= numberOfChocolates;chocoCount++) {
    		  System.out.println("Enter the chocolate type(Enter the number):1.candy 2.Wafer");
    		  int chocolateType = input.nextInt();
    		  System.out.println("Enter the weight of the chocolate:");
    		  int chocoWeight = input.nextInt();
    		  System.out.println("Enter the price of the chocolate:");
    		  int chocoPrice = input.nextInt();
    		  if(chocolateType==1)
    		  {
    			  System.out.println("Enter the name of the candy");
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  
    			  {
    				  nameToPrice.put(candyName,(int)nameToPrice.get(candyName)+chocoPrice);
    				  
    			  }
    			  else
    				  nameToPrice.put(candyName,chocoPrice);
    		  }
    		  Chocolate choco = new Chocolate(chocoWeight,chocoPrice);
    		  chocolates.add(choco);
    		  if(chocolateType==1) {
    			  candies.add(choco);
    		  }
    		  
    	  }
      }
             public static void inputSweets() {
            	 
            	 System.out.println("Enter the number of sweets in gifts:\n");
            	 int numberOfSweets = input.nextInt();
            	 for(int sweetCount =1;sweetCount<= numberOfsweets; sweetCount++) {
            		 System.out.println("Enter the weight Of the sweet:");
            		 int sweetWeight = input.nextInt();
            		 System.out.println("Enter the price Of the sweet:");
            		 int sweetPrice = input.nextInt();
            		 Sweet sweet = new Sweet(sweetWeight, sweetPrice);
            		 sweets.add(sweet);
            	 }
             }
             
             public static int calcTotalWeight() {
            	 int totalWeight=0;
            	 for(Chocolate choco : chocolates) {
            		 totalWeight += choco.getWeight();
            	 }
            	 for(Sweet sweet : sweets) {
            		 
            		 totalWeight += sweet.getWeight();
            	 }
            	 return totalweight;
             }
             public static void calcRange(int sortType) {
            	 System.out.println("find the Range:");
            	 int lowerLimit, higherLimit;
            	 if(sortType == 1) {
            		 System.out.println("Enter the lowerlimit of the price:");
            		 lowerLimit = input.nextInt();
            		 System.out.println("Enter the higherlimit of the price:");
            		 higherLimit = input.nextInt();
            		 Set<Map.Entry<String, Integer>> candySet = nameToPrice.entrySet();
            		 Iterator<Map.Entry<String, Integer>> candyIterator = candySet.iterator();
            		 while (candyIterator.hasNext()){
            			 Map.Entry candyElement = (Map.Entry)candyIterator.next();
            			 int currentPrice = (int)candyElement.getValue();
            			 if (currentPrice >= lowerLimit && currentPrice <= higherLimit)
            				 System.out.println(candyElement.getKey());
            			 }
            	 } else {
            		 System.out.println("Enter the lowerlimit of the weight:");
            		 lowerLimit = input.nextInt();
            		 System.out.println("Enter the higherlimit of the weight:");
            		 higherLimit = input.nextInt();
            		 
            		 Set<Map.Entry<String, Integer>> candySet=nameToWeight.entrySet();
            		 Iterator<Map.Entry<String, Integer>> candyIterator=candySet.iterator();
            		 while(candyIterator.hasNext()) {
            			 Map.Entry candyElement = (Map.Entry)candyIterator.Next();
            			 int currentWeight = (int)candyElement.getValue();
            			 if(currentWeight>=loerLimit && currentWeight<=higherLimit)
            				 System.out.println(candyElement.getKey());
            		 }
            	 }
            	 
             }
             
 }
