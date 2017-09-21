package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTest extends TestBase  {

    @Test
    public void testGroupCreation() {
        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test 1", "test 2", "test 3"));
        sumbitGroupCretion();
        returnToGroupPage();
    }

}
