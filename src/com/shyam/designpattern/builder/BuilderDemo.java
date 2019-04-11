package com.shyam.designpattern.builder;

public class BuilderDemo {

	public static void main(String[] args) {

		try {
			OrderBuilder orderBuilder = new OrderBuilder();

			OrderedItems orderedItems = orderBuilder.orderBeverages();
			// orderedItems.showItems();
			orderedItems.addItem(orderBuilder.preparePizza().itemList.get(0));
			orderedItems.showItems();
			System.out.println("\nOrder total: " + orderedItems.getCost());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
