package GenshinSimulator;

import java.util.*;

public class Driver {
	
	
	private static Banner weaponBanner;
	private static Banner eventBanner;
	private static Banner standardBanner;
	
	public static void main(String[] args) {
		/*
		 * run program,
		 * choose banner = event, weapon, standard
		 * u enter yuor 5 star pity and 4 star pity
		 * and then u simulate single pulls or 10 pulls
		 * Everytime u pull
		 * display all items that u get and the current pity
		 */
		
		Scanner scan = new Scanner(System.in);
		
		makeBanners();
		
		
		
		Banner currentBanner;
		while(true) {
			System.out.println("Choose a banner to roll on: ('Q' to quit)");
			System.out.println("	Enter 'E' for Event Banner");
			System.out.println("	Enter 'W' for Weapon Banner");
			System.out.println("	Enter 'S' for Standard Banner");
			String input = getInput(scan);
			input = input.toUpperCase();
			if(input.equals("E")) {
				currentBanner = Driver.eventBanner;
				System.out.println("You chose the Event Banner");
				
				//TODO error handling
				System.out.println("Enter current Five Star Pity (1-90)");
				int fivePity = new Integer(getInput(scan));
				System.out.println("Enter current Four Star Pity (1-10)");
				int fourPity = new Integer(getInput(scan));
				
				System.out.println("Are you guaranteed a promotional Five Star Character? (Y/N)");
				input = getInput(scan);
				boolean promoFive = true;
				if(input.equals("Y")) {
					promoFive = true;
				}
				else if(input.equals("N")) {
					promoFive = false;
				}
				
				System.out.println("Are you guaranteed a promotional Four Star Character? (Y/N)");
				input = getInput(scan);
				boolean promoFour = true;
				if(input.equals("Y")) {
					promoFive = true;
				}
				else if(input.equals("N")) {
					promoFive = false;
				}
				
				currentBanner.setPityFiveStar(fivePity);
				currentBanner.setPityFourStar(fourPity);
				currentBanner.setPromoFiveStar(promoFive);
				currentBanner.setPromoFourStar(promoFour);
				
				while(true) {
					System.out.println("");
					System.out.println("('B' to go back, 'Q' to quit)");
					System.out.println("	Enter '1' to Wish for 1 item");
					System.out.println("	Enter '2' to wish for 10 items");
					input = getInput(scan);
					if(input.equals("B")) {
						break;
					}
					else if(input.equals("1")) {
						System.out.println(currentBanner.rollOne());
						System.out.println("Next Pity will be " + currentBanner.pityFiveStar);
					}
					else if(input.equals("2")) {
						for(Item i : currentBanner.rollTen()) {
							System.out.println(i);
						}
						System.out.println("Next Pity will be " + currentBanner.pityFiveStar);
					}
					else if(input.equals("Q")) {
						scan.close();
						return;
					}
					else {
						System.out.println("Please enter a valid input.");
						continue;
					}
				}
				
			}
			else if(input.equals("W")) {
				currentBanner = Driver.weaponBanner;
				System.out.println("You chose the Weapon Banner");
				
				//TODO error handling
				System.out.println("Enter current Five Star Pity (1-80)");
				int fivePity = new Integer(getInput(scan));
				System.out.println("Enter current Four Star Pity (1-10)");
				int fourPity = new Integer(getInput(scan));
				
				System.out.println("Are you guaranteed a promotional Five Star Weapon? (Y/N)");
				input = getInput(scan);
				boolean promoFive = true;
				if(input.equals("Y")) {
					promoFive = true;
				}
				else if(input.equals("N")) {
					promoFive = false;
				}
				
				System.out.println("Are you guaranteed a promotional Four Star Weapon? (Y/N)");
				input = getInput(scan);
				boolean promoFour = true;
				if(input.equals("Y")) {
					promoFive = true;
				}
				else if(input.equals("N")) {
					promoFive = false;
				}
				
				currentBanner.setPityFiveStar(fivePity);
				currentBanner.setPityFourStar(fourPity);
				currentBanner.setPromoFiveStar(promoFive);
				currentBanner.setPromoFourStar(promoFour);
				
				while(true) {
					System.out.println("");
					System.out.println("('B' to go back, 'Q' to quit)");
					System.out.println("	Enter '1' to Wish for 1 item");
					System.out.println("	Enter '2' to wish for 10 items");
					input = getInput(scan);
					if(input.equals("B")) {
						break;
					}
					else if(input.equals("1")) {
						System.out.println(currentBanner.rollOne());
						System.out.println("Next Pity will be " + currentBanner.pityFiveStar);
					}
					else if(input.equals("2")) {
						for(Item i : currentBanner.rollTen()) {
							System.out.println(i);
						}
						System.out.println("Next Pity will be " + currentBanner.pityFiveStar);
					}
					else if(input.equals("Q")) {
						scan.close();
						return;
					}
					else {
						System.out.println("Please enter a valid input.");
						continue;
					}
				}
			}
			else if(input.equals("S")) {
				currentBanner = Driver.standardBanner;
				System.out.println("You chose the Standard Banner");
				
				//TODO error handling
				System.out.println("Enter current Five Star Pity (1-90)");
				int fivePity = new Integer(getInput(scan));
				System.out.println("Enter current Four Star Pity (1-10)");
				int fourPity = new Integer(getInput(scan));

				currentBanner.setPityFiveStar(fivePity);
				currentBanner.setPityFourStar(fourPity);
				
				while(true) {
					System.out.println("");
					System.out.println("('B' to go back, 'Q' to quit)");
					System.out.println("	Enter '1' to Wish for 1 item");
					System.out.println("	Enter '2' to wish for 10 items");
					input = getInput(scan);
					if(input.equals("B")) {
						break;
					}
					else if(input.equals("1")) {
						System.out.println(currentBanner.rollOne());
						System.out.println("Next Pity will be " + currentBanner.pityFiveStar);
					}
					else if(input.equals("2")) {
						for(Item i : currentBanner.rollTen()) {
							System.out.println(i);
						}
						System.out.println("Next Pity will be " + currentBanner.pityFiveStar);
					}
					else if(input.equals("Q")) {
						scan.close();
						return;
					}
					else {
						System.out.println("Please enter a valid input.");
						continue;
					}
				}
			}
			else if(input.equals("Q")) {
				break;
			}
			else {
				System.out.println("Please enter a valid input.");
				continue;
			}
		}
		
		
		
		scan.close();
	}
	
	public static String getInput(Scanner sc) {
		String input = sc.nextLine();
		input.trim();
		input.toUpperCase();
		return input;
	}
	
	public static void makeBanners() {
		makeWeaponBanner();
		makeEventBanner();
		makeStandardBanner();
		
		setEventBanner(60, 9, false, true);
		setWeaponBanner(70, 9, false, false);
		setStandardBanner(80, 9);
	}
	public static void setEventBanner(int pityFive, int pityFour, boolean promoFive, boolean promoFour) {
		Driver.eventBanner.setPityFiveStar(pityFive);
		Driver.eventBanner.setPityFourStar(pityFour);
		Driver.eventBanner.setPromoFiveStar(promoFive);
		Driver.eventBanner.setPromoFourStar(promoFour);
	}
	public static void setStandardBanner(int pityFive, int pityFour) {
		Driver.standardBanner.setPityFiveStar(pityFive);
		Driver.standardBanner.setPityFourStar(pityFour);
	}
	public static void setWeaponBanner(int pityFive, int pityFour, boolean promoFive, boolean promoFour) {
		Driver.weaponBanner.setPityFiveStar(pityFive);
		Driver.weaponBanner.setPityFourStar(pityFour);
		Driver.weaponBanner.setPromoFiveStar(promoFive);
		Driver.weaponBanner.setPromoFourStar(promoFour);
	}
	public static void makeWeaponBanner() {
		List<Item> threeStars = new ArrayList<Item>();
		List<Item> fourStars = new ArrayList<Item>();
		List<Item> fiveStars = new ArrayList<Item>();
		
		List<Item> fourStarPromos = new ArrayList<Item>();
		
		fourStarPromos.add(new Item(false, 4, "The Stringless"));
		fourStarPromos.add(new Item(false, 4, "Favonius Lance"));
		fourStarPromos.add(new Item(false, 4, "Favonius Sword"));
		fourStarPromos.add(new Item(false, 4, "Favonius Greatsword"));
		fourStarPromos.add(new Item(false, 4, "Sacrificial Fragments"));
		
		
		Item promo1 = new Item(false, 5, "Skyward Atlas");
		Item promo2 = new Item(false, 5, "Summit Shaper");
		
		//5 stars
		fiveStars.add(new Item(false, 5, "Wolf's Gravestone"));
		fiveStars.add(new Item(false, 5, "Skyward Blade"));
		fiveStars.add(new Item(false, 5, "Skyward Harp"));
		fiveStars.add(new Item(false, 5, "Skyward Spine"));
		fiveStars.add(new Item(false, 5, "Skyward Pride"));
		fiveStars.add(new Item(false, 5, "Aquila Favonia"));
		fiveStars.add(new Item(false, 5, "Amos' Bow"));
		fiveStars.add(new Item(false, 5, "Lost Prayer to the Sacred Winds"));
		fiveStars.add(new Item(false, 5, "Primordial Jade Winged-Spear"));
		
		
		//4 stars
		//4 star characters
		fourStars.add(new Item(true, 4, "Sucrose"));
		fourStars.add(new Item(true, 4, "Fischl"));
		fourStars.add(new Item(true, 4, "Bennett"));
		fourStars.add(new Item(true, 4, "Xinyan"));
		fourStars.add(new Item(true, 4, "Diona"));
		fourStars.add(new Item(true, 4, "Chongyun"));
		fourStars.add(new Item(true, 4, "Noelle"));
		fourStars.add(new Item(true, 4, "Ningguang"));
		fourStars.add(new Item(true, 4, "Xingqui"));
		fourStars.add(new Item(true, 4, "Beidou"));
		fourStars.add(new Item(true, 4, "Xiangling"));
		fourStars.add(new Item(true, 4, "Razor"));
		fourStars.add(new Item(true, 4, "Barbara"));
		
		//4 star weapons
		fourStars.add(new Item(false, 4, "Sacrificial Bow"));
		fourStars.add(new Item(false, 4, "Favonius Warbow"));
		fourStars.add(new Item(false, 4, "Eye of Perception"));
		fourStars.add(new Item(false, 4, "The Widsith"));
		fourStars.add(new Item(false, 4, "Favonius Codex"));
		fourStars.add(new Item(false, 4, "Dragon's Bane"));
		fourStars.add(new Item(false, 4, "Rainslasher"));
		fourStars.add(new Item(false, 4, "The Bell"));
		fourStars.add(new Item(false, 4, "Lion's Roar"));
		fourStars.add(new Item(false, 4, "Sacrificial Sword"));
		fourStars.add(new Item(false, 4, "The Flute"));
		fourStars.add(new Item(false, 4, "Rust"));
		fourStars.add(new Item(false, 4, "Sacrificial Greatsword"));
		
		//3 stars
		threeStars.add(new Item(false, 3, "Slingshot"));
		threeStars.add(new Item(false, 3, "Sharpshooter's Oath"));
		threeStars.add(new Item(false, 3, "Raven Bow"));
		threeStars.add(new Item(false, 3, "Emerald Orb"));
		threeStars.add(new Item(false, 3, "Thrilling Tales of Dragon Slayers"));
		threeStars.add(new Item(false, 3, "Magic Guide"));
		threeStars.add(new Item(false, 3, "Black Tassel"));
		threeStars.add(new Item(false, 3, "Debate Club"));
		threeStars.add(new Item(false, 3, "Bloodtainted Greatsword"));
		threeStars.add(new Item(false, 3, "Ferrous Shadow"));
		threeStars.add(new Item(false, 3, "Skyrider Sword"));
		threeStars.add(new Item(false, 3, "Harbinger of Dawn"));
		threeStars.add(new Item(false, 3, "Cool Steel"));
		
		Driver.weaponBanner = new WeaponBanner(threeStars, fourStars, fiveStars);
		Driver.weaponBanner.setPromoFourStars(fourStarPromos);
		Driver.weaponBanner.setPromoWeapon1(promo1);
		Driver.weaponBanner.setPromoWeapon2(promo2);
	}
	public static void makeEventBanner() {
		List<Item> threeStars = new ArrayList<Item>();
		List<Item> fourStars = new ArrayList<Item>();
		List<Item> fiveStars = new ArrayList<Item>();
		List<Item> fourStarPromos = new ArrayList<Item>();
		
		//Promo 5 stars
		Item promoChar = new Item(true, 5, "Albedo");
		
		//Promo 4 stars
		fourStarPromos.add(new Item(true, 4, "Sucrose"));
		fourStarPromos.add(new Item(true, 4, "Fischl"));
		fourStarPromos.add(new Item(true, 4, "Bennett"));
		
		
		//Add 5 star characters
		fiveStars.add(new Item(true, 5, "Mona"));
		fiveStars.add(new Item(true, 5, "Keqing"));
		fiveStars.add(new Item(true, 5, "Qiqi"));
		fiveStars.add(new Item(true, 5, "Jean"));
		fiveStars.add(new Item(true, 5, "Diluc"));
		
		//Add 4 star items
		//4 star chars
		fourStars.add(new Item(true, 4, "Xinyan"));
		fourStars.add(new Item(true, 4, "Diona"));
		fourStars.add(new Item(true, 4, "Chongyun"));
		fourStars.add(new Item(true, 4, "Noelle"));
		fourStars.add(new Item(true, 4, "Ningguang"));
		fourStars.add(new Item(true, 4, "Xingqui"));
		fourStars.add(new Item(true, 4, "Beidou"));
		fourStars.add(new Item(true, 4, "Xiangling"));
		fourStars.add(new Item(true, 4, "Razor"));
		fourStars.add(new Item(true, 4, "Barbara"));
		
		
		//4 star weapons
		fourStars.add(new Item(false, 4, "Sacrificial Bow"));
		fourStars.add(new Item(false, 4, "The Stringless"));
		fourStars.add(new Item(false, 4, "Favonius Warbow"));
		fourStars.add(new Item(false, 4, "Eye of Perception"));
		fourStars.add(new Item(false, 4, "Sacrificial Fragments"));
		fourStars.add(new Item(false, 4, "The Widsith"));
		fourStars.add(new Item(false, 4, "Favonius Codex"));
		fourStars.add(new Item(false, 4, "Favonius Lance"));
		fourStars.add(new Item(false, 4, "Dragon's Bane"));
		fourStars.add(new Item(false, 4, "Rainslasher"));
		fourStars.add(new Item(false, 4, "Sacrificial Greatsword"));
		fourStars.add(new Item(false, 4, "The Bell"));
		fourStars.add(new Item(false, 4, "Favonius Greatsword"));
		fourStars.add(new Item(false, 4, "Lion's Roar"));
		fourStars.add(new Item(false, 4, "Sacrificial Sword"));
		fourStars.add(new Item(false, 4, "The Flute"));
		fourStars.add(new Item(false, 4, "Favonius Sword"));
		
		
		
		//Add 3 star weapons
		threeStars.add(new Item(false, 3, "Slingshot"));
		threeStars.add(new Item(false, 3, "Sharpshooter's Oath"));
		threeStars.add(new Item(false, 3, "Raven Bow"));
		threeStars.add(new Item(false, 3, "Emerald Orb"));
		threeStars.add(new Item(false, 3, "Thrilling Tales of Dragon Slayers"));
		threeStars.add(new Item(false, 3, "Magic Guide"));
		threeStars.add(new Item(false, 3, "Black Tassel"));
		threeStars.add(new Item(false, 3, "Debate Club"));
		threeStars.add(new Item(false, 3, "Bloodtainted Greatsword"));
		threeStars.add(new Item(false, 3, "Ferrous Shadow"));
		threeStars.add(new Item(false, 3, "Skyrider Sword"));
		threeStars.add(new Item(false, 3, "Harbinger of Dawn"));
		threeStars.add(new Item(false, 3, "Cool Steel"));
		
		Driver.eventBanner = new EventBanner(threeStars, fourStars, fiveStars);
		Driver.eventBanner.setPromoChar(promoChar);
		Driver.eventBanner.setPromoFourStars(fourStarPromos);
		
	}
	public static void makeStandardBanner() {
		List<Item> threeStars = new ArrayList<Item>();
		List<Item> fourStars = new ArrayList<Item>();
		List<Item> fiveStars = new ArrayList<Item>();
		
		
		//Five stars
		//Add 5 star characters
		fiveStars.add(new Item(true, 5, "Mona"));
		fiveStars.add(new Item(true, 5, "Keqing"));
		fiveStars.add(new Item(true, 5, "Qiqi"));
		fiveStars.add(new Item(true, 5, "Jean"));
		fiveStars.add(new Item(true, 5, "Diluc"));
		//5 star weapons
		fiveStars.add(new Item(false, 5, "Skyward Harp"));
		fiveStars.add(new Item(false, 5, "Skyward Atlas"));
		fiveStars.add(new Item(false, 5, "Skyward Spine"));
		fiveStars.add(new Item(false, 5, "Skyward Pride"));
		fiveStars.add(new Item(false, 5, "Aquila Favonia"));
		fiveStars.add(new Item(false, 5, "Amos' Bow"));
		fiveStars.add(new Item(false, 5, "Lost Prayer to the Sacred Winds"));
		fiveStars.add(new Item(false, 5, "Primordial Jade Winged-Spear"));
		fiveStars.add(new Item(false, 5, "Wolf's Gravestone"));
		fiveStars.add(new Item(false, 5, "Skyward Blade"));
		
		
		
		//4 stars
		//4 star characters
		fourStars.add(new Item(true, 4, "Sucrose"));
		fourStars.add(new Item(true, 4, "Fischl"));
		fourStars.add(new Item(true, 4, "Bennett"));
		fourStars.add(new Item(true, 4, "Xinyan"));
		fourStars.add(new Item(true, 4, "Diona"));
		fourStars.add(new Item(true, 4, "Chongyun"));
		fourStars.add(new Item(true, 4, "Noelle"));
		fourStars.add(new Item(true, 4, "Ningguang"));
		fourStars.add(new Item(true, 4, "Xingqui"));
		fourStars.add(new Item(true, 4, "Beidou"));
		fourStars.add(new Item(true, 4, "Xiangling"));
		fourStars.add(new Item(true, 4, "Razor"));
		fourStars.add(new Item(true, 4, "Barbara"));
		fourStars.add(new Item(true, 4, "Amber"));
		fourStars.add(new Item(true, 4, "Kaeya"));
		fourStars.add(new Item(true, 4, "Lisa"));
		
		
		
		//4 star weapons
		fourStars.add(new Item(false, 4, "Sacrificial Bow"));
		fourStars.add(new Item(false, 4, "The Stringless"));
		fourStars.add(new Item(false, 4, "Favonius Warbow"));
		fourStars.add(new Item(false, 4, "Eye of Perception"));
		fourStars.add(new Item(false, 4, "Sacrificial Fragments"));
		fourStars.add(new Item(false, 4, "The Widsith"));
		fourStars.add(new Item(false, 4, "Favonius Codex"));
		fourStars.add(new Item(false, 4, "Favonius Lance"));
		fourStars.add(new Item(false, 4, "Dragon's Bane"));
		fourStars.add(new Item(false, 4, "Rainslasher"));
		fourStars.add(new Item(false, 4, "Sacrificial Greatsword"));
		fourStars.add(new Item(false, 4, "The Bell"));
		fourStars.add(new Item(false, 4, "Favonius Greatsword"));
		fourStars.add(new Item(false, 4, "Lion's Roar"));
		fourStars.add(new Item(false, 4, "Sacrificial Sword"));
		fourStars.add(new Item(false, 4, "The Flute"));
		fourStars.add(new Item(false, 4, "Favonius Sword"));
		fourStars.add(new Item(false, 4, "Rust"));
		
		
		//Add 3 star weapons
		threeStars.add(new Item(false, 3, "Slingshot"));
		threeStars.add(new Item(false, 3, "Sharpshooter's Oath"));
		threeStars.add(new Item(false, 3, "Raven Bow"));
		threeStars.add(new Item(false, 3, "Emerald Orb"));
		threeStars.add(new Item(false, 3, "Thrilling Tales of Dragon Slayers"));
		threeStars.add(new Item(false, 3, "Magic Guide"));
		threeStars.add(new Item(false, 3, "Black Tassel"));
		threeStars.add(new Item(false, 3, "Debate Club"));
		threeStars.add(new Item(false, 3, "Bloodtainted Greatsword"));
		threeStars.add(new Item(false, 3, "Ferrous Shadow"));
		threeStars.add(new Item(false, 3, "Skyrider Sword"));
		threeStars.add(new Item(false, 3, "Harbinger of Dawn"));
		threeStars.add(new Item(false, 3, "Cool Steel"));
		
		Driver.standardBanner = new StandardBanner(threeStars, fourStars, fiveStars);
		
		
	}
	
}
