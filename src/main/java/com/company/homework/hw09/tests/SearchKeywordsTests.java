package com.company.homework.hw09.tests;

import com.company.infrastructure.TestBase;

public class SearchKeywordsTests extends SearchBase {
    public void testSearchArticlePage(){
        logger.log("Type book reader");
        logger.log("Click search button");
        logger.log("Check loaded page with at least one book reader found");
    }

    public void testSearchSuggestion(){
        logger.log("Type pocketbook");
        logger.log("Check at least one item appears in suggestions list");
    }

    public void testSearchWrongArticle(){
        logger.log("Type ggggggggg");
        logger.log("Click search button");
        logger.log("Check page not exists");
    }

    public void testSearchSuggestionNotFound(){
        logger.log("Type ppppppp");
        logger.log("Check not found message appears");
    }
}

