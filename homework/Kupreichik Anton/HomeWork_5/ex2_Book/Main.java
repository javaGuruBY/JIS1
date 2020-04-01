package com.company;

import com.company.bean.Book;
import com.company.service.MenuService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuService.setNumbersOfBooks();
        MenuService.enterData();
        MenuService.returnBooks();
    }
}
