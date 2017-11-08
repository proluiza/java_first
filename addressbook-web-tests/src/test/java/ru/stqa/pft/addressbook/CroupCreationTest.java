package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

public class CroupCreationTest extends TestBase{

    @Test
    public void testCroupCreationTest() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupDate("Ruru2", "Ruru3", "Ruru4"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
