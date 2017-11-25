package org.launchcode.controllers;

import org.launchcode.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping(value = "search")
public class SearchController {

    @RequestMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", ListController.columnChoices);
        return "search";
    }

    // TODO #1 - Create handler to process search request and display results

    @RequestMapping(value = "results" , method = RequestMethod.GET)
    public String listColumnValues2(Model model) {
        //model.addAttribute("columns", ListController.columnChoices);
        ArrayList<String> testData = new ArrayList<>();
        testData.add("Green");
        testData.add("red");
        testData.add("alpha");
        testData.add("stuff");
        model.addAttribute("testdata", testData);
        return "searchResults";

    }



}
