package gov.uk.check.visa.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

import java.util.List;

public class AllCountrySteps {
    @Then("I can see following country into dropdown list")
    public void iCanSeeFollowingCountryIntoDropdownList(DataTable dataTable) {
        List<List<String>> countryList = dataTable.asLists(String.class);
        for (List<String> list : countryList) {
            System.out.println(list);
            System.out.println(list.toString());

        }
    }
}
