package com.example.firstapplication;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SearchResultViewModelUnitTest {
    private static List<String> TEST;
    private SearchResultViewModel mSearchResultViewModel;
    @Before
    public void setUp() {
        TEST = new ArrayList();
        TEST.add("munkyu");
        TEST.add("jack");
        TEST.add("jeff");
        TEST.add("jason");
        TEST.add("ines");
        TEST.add("amy");
        TEST.add("clark");

        mSearchResultViewModel = new SearchResultViewModel();
    }

    @Test
    public void filter() throws Exception {
        List<String> answers = mSearchResultViewModel.filter("j");

        assertTrue(answers.contains("jack"));
        assertTrue(answers.contains("jeff"));
        assertTrue(answers.contains("jason"));
    }
}