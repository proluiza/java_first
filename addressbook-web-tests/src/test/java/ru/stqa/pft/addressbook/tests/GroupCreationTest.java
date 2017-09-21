package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;


public class GroupCreationTest extends TestBase  {

    @Test
    public void testGroupCreation() {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        app.getGroupHelper().sumbitGroupCretion();
        app.getGroupHelper().returnToGroupPage();
    }

}
