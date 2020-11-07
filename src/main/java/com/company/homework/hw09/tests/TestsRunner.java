package com.company.homework.hw09.tests;

public class TestsRunner {
    public static void main(String[] args) {
        SearchArticleTests tests = new SearchArticleTests();

        tests.setup();
        tests.testSearchArticlePage();
        tests.cleanUp();

        System.out.println("------");

        tests.setup();
        tests.testSearchSuggestion();
        tests.cleanUp();

        System.out.println("------");

        tests.setup();
        tests.testSearchWrongArticle();
        tests.cleanUp();

        System.out.println("------");

        SearchKeywordsTests tests1 = new SearchKeywordsTests();

        tests1.setup();
        tests1.testSearchArticlePage();
        tests1.cleanUp();

        System.out.println("------");

        tests1.setup();
        tests1.testSearchSuggestion();
        tests1.cleanUp();

        System.out.println("------");

        tests1.setup();
        tests1.testSearchWrongArticle();
        tests1.cleanUp();

        System.out.println("------");

        tests1.setup();
        tests1.testSearchSuggestionNotFound();
        tests1.cleanUp();

        System.out.println("------");

        WishListTests tests2 = new WishListTests();

        tests2.setup();
        tests2.testCreateWishList();
        tests2.cleanUp();

        System.out.println("------");

        tests2.setup();
        tests2.testItemAddToWishList();
        tests2.cleanUp();

        System.out.println("------");

        tests2.setup();
        tests2.testWishListAvailable();
        tests2.cleanUp();

        System.out.println("------");

    }
}
