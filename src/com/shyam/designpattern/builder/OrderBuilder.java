package com.shyam.designpattern.builder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.shyam.designpattern.builder.beverages.coke.LargeCoke;
import com.shyam.designpattern.builder.beverages.coke.MediumCoke;
import com.shyam.designpattern.builder.beverages.coke.SmallCoke;
import com.shyam.designpattern.builder.beverages.pepsi.LargePepsi;
import com.shyam.designpattern.builder.beverages.pepsi.MediumPepsi;
import com.shyam.designpattern.builder.beverages.pepsi.SmallPepsi;
import com.shyam.designpattern.builder.pizza.nonveg.ExtraLargeNonVegPizza;
import com.shyam.designpattern.builder.pizza.nonveg.LargeNonVegPizza;
import com.shyam.designpattern.builder.pizza.nonveg.MediumNonVegPizza;
import com.shyam.designpattern.builder.pizza.nonveg.SmallNonVegPizza;
import com.shyam.designpattern.builder.pizza.veg.ExtraLargeCheezePizza;
import com.shyam.designpattern.builder.pizza.veg.LargeCheezePizza;
import com.shyam.designpattern.builder.pizza.veg.MediumCheezePizza;
import com.shyam.designpattern.builder.pizza.veg.SmallCheezePizza;

public class OrderBuilder {

	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public OrderedItems preparePizza() throws Exception {

		// public OrderedItems itemsOrdered = new OrderedItems();
		OrderedItems itemsOrdered = new OrderedItems();

		System.out.println("Enter the choice of pizza:");
		System.out.println("================================");
		System.out.println("    1. Veg-Pizza    ");
		System.out.println("    2. Non-Pizza    ");
		System.out.println("    3. Exit    ");
		System.out.println("================================");

		int pizzaChoices = Integer.parseInt(br.readLine());

		switch (pizzaChoices) {

		case 1: {
			System.out.println("You ordered Veg Pizza");
			System.out.println("\n\n");
			System.out.println("Enter the types of Veg-Pizza");
			System.out.println("-------------------------");
			System.out.println("    1.Cheeze Pizza    ");
			System.out.println("    2.Onion Pizza    ");
			System.out.println("    Exit    ");
			System.out.println("-------------------------");
			
			int vegPizzaChoice = Integer.parseInt(br.readLine());

			switch (vegPizzaChoice) {

			case 1: {
				System.out.println("    You ordered Cheeze Pizza    ");

				System.out.println("    Please enter the cheeze pizza size:    ");
				System.out.println("------------------");
				System.out.println("    1. Small Cheeze Pizza    ");
				System.out.println("    2. Medium Cheeze Pizza    ");
				System.out.println("    3. Large Cheeze Pizza    ");
				System.out.println("    4. Extra Large Cheeze Pizza    ");
				System.out.println("------------------");

				int cheezePizzaSize = Integer.parseInt(br.readLine());

				switch (cheezePizzaSize) {
				case 1:
					itemsOrdered.addItem(new SmallCheezePizza());
					break;

				case 2:
					itemsOrdered.addItem(new MediumCheezePizza());
					break;

				case 3:
					itemsOrdered.addItem(new LargeCheezePizza());
					break;

				case 4:
					itemsOrdered.addItem(new ExtraLargeCheezePizza());
					break;
				}
				break;
			}
			case 2: {
				System.out.println("    You ordered Onion Pizza    ");

				System.out.println("    Please enter the onion pizza size:    ");
				System.out.println("------------------");
				System.out.println("    1. Small Onion Pizza    ");
				System.out.println("    2. Medium Onion Pizza    ");
				System.out.println("    3. Large Onion Pizza    ");
				System.out.println("    4. Extra Large Onion Pizza    ");
				System.out.println("    ------------------    ");

				int onionPizzaSize = Integer.parseInt(br.readLine());
				switch (onionPizzaSize) {
				case 1:
					itemsOrdered.addItem(new SmallCheezePizza());
					break;

				case 2:
					itemsOrdered.addItem(new MediumCheezePizza());
					break;

				case 3:
					itemsOrdered.addItem(new LargeCheezePizza());
					break;

				case 4:
					itemsOrdered.addItem(new ExtraLargeCheezePizza());
					break;
				}
			}
			}
			break;
		}

		case 2: {
			System.out.println("    Please enter the Non-Veg Pizza size:    ");
			System.out.println("------------------");
			System.out.println("    1. Small Non Veg Pizza    ");
			System.out.println("    2. Medium Non Veg Pizza    ");
			System.out.println("    3. Large Non Veg Pizza    ");
			System.out.println("    4. Extra Large Non Veg Pizza    ");
			System.out.println("    ------------------    ");

			int nonVegPizzaSize = Integer.parseInt(br.readLine());

			switch (nonVegPizzaSize) {
			case 1:
				itemsOrdered.addItem(new SmallNonVegPizza());
				break;

			case 2:
				itemsOrdered.addItem(new MediumNonVegPizza());
				break;

			case 3:
				itemsOrdered.addItem(new LargeNonVegPizza());
				break;

			case 4:
				itemsOrdered.addItem(new ExtraLargeNonVegPizza());
				break;
			}
			break;
		}
		}
		return itemsOrdered;
	}

	public OrderedItems orderBeverages() throws Exception {

		OrderedItems itemsOrdered = new OrderedItems();

		System.out.println("Enter the choice of cold drink:");
		System.out.println("================================");
		System.out.println("    1. Pepsi    ");
		System.out.println("    2. Coke    ");
		System.out.println("    3. Exit    ");
		System.out.println("================================");

		int coldDrinkChoices = Integer.parseInt(br.readLine());

		switch (coldDrinkChoices) {
		case 1: {

			
			System.out.println("Please select the pepsi drink size    ");
			System.out.println("    -------------------------------    ");
			System.out.println("    1. Small(300ml), 1 Serving    ");
			System.out.println("    2. Medium(750ml), 2 Serving    ");
			System.out.println("    3. Large(1.5L), 5 Serving    ");
			System.out.println("    -------------------------------    ");
			
			int pepsiSizeChoice = Integer.parseInt(br.readLine());
			
			switch (pepsiSizeChoice) {
			case 1: {
				itemsOrdered.addItem(new SmallPepsi());
				break;
			}
			case 2: {
				itemsOrdered.addItem(new MediumPepsi());
				break;
			}
			case 3: {
				itemsOrdered.addItem(new LargePepsi());
				break;
			}
			}
			break;
		}
		case 2: {
			int cokeSizeChoice = Integer.parseInt(br.readLine());

			System.out.println("    Please select the coke drink size    ");
			System.out.println("    -------------------------------    ");
			System.out.println("    1. Small(300ml), 1 Serving    ");
			System.out.println("    2. Medium(750ml), 2 Serving    ");
			System.out.println("    3. Large(1.5L), 5 Serving    ");
			System.out.println("    -------------------------------    ");
			switch (cokeSizeChoice) {
			case 1: {
				itemsOrdered.addItem(new SmallCoke());
				break;
			}
			case 2: {
				itemsOrdered.addItem(new MediumCoke());
				break;
			}
			case 3: {
				itemsOrdered.addItem(new LargeCoke());
				break;
			}
			}
			break;
		}
		default: {
			break;
		}
		}
		return itemsOrdered;
	}
}
