package com.techelevator;

import com.techelevator.view.BasicUI;
import com.techelevator.view.MenuDrivenCLI;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Application extends VendingMachine {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_OPTION_SALES_REPORT = "Sales Report";
	private static final String SUB_MENU_OPTION_1 = "Feed Money";
	private static final String SUB_MENU_OPTION_2 = "Select Product";
	private static final String SUB_MENU_OPTION_3 = "Finish Transaction";
	private static final String[] SUB_MENU_OPTIONS = {SUB_MENU_OPTION_1, SUB_MENU_OPTION_2, SUB_MENU_OPTION_3};
	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT, MAIN_MENU_OPTION_SALES_REPORT};

	private final BasicUI ui;
	private static VendingMachine vendingMachine = new VendingMachine();
	public Application(BasicUI ui) {
		this.ui = ui;
	}

	public static void main(String[] args) {
		BasicUI cli = new MenuDrivenCLI();
		Application application = new Application(cli);
		application.run();
	}

	public void run() {
		boolean finished = false;
		while (!finished) {
			String selection = ui.promptForSelection(MAIN_MENU_OPTIONS);

			if (selection.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				System.out.print(vendingMachine.listInventory());
			} else if (selection.equals(MAIN_MENU_OPTION_PURCHASE)) {
				selection = ui.promptForSelection(SUB_MENU_OPTIONS);
				System.out.print(selection);
				if(selection.equals(SUB_MENU_OPTION_1));
			} else if (selection.equals(MAIN_MENU_OPTION_SALES_REPORT)) {
				//display the sales report
			} else if (selection.equals(MAIN_MENU_OPTION_EXIT)) {
				finished = true;
			}
		}
	}




}
