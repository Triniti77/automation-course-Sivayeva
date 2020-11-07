package com.company.homework.hw09.tests;

import com.company.infrastructure.TestBase;

public class SearchArticleTests extends SearchBase {

    public void testSearchArticlePage(){

        logger.log("Type 167366347");
        logger.log("Click search button");
        logger.log("Check proper page is loaded");
    }

    public void testSearchSuggestion(){
        logger.log("Type 167366347");
        logger.log("Check at least one item appears in suggestions list");
    }

    public void testSearchWrongArticle(){
        logger.log("Type 9999999999");
        logger.log("Click search button");
        logger.log("Check page not exists");
    }
}
