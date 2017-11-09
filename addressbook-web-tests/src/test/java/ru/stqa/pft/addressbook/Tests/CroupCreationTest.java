package ru.stqa.pft.addressbook.Tests;


import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupDate;

public class CroupCreationTest extends TestBase{

    @Test
    public void testCroupCreationTest() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupDate("Ruru2", "Ruru3", "Ruru4"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
