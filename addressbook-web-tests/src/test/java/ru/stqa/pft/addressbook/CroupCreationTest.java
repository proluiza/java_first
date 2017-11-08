package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

public class CroupCreationTest extends TestBase{

    @Test
    public void testCroupCreationTest() {
        app.goToGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupDate("Ruru2", "Ruru3", "Ruru4"));
        app.submitGroupCreation();
        app.returnToGroupPage();
    }

}
