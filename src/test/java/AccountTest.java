import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    String shorterThanTree = "TN";
    String blank = "";
    String noSpaces = "TestName";
    String spaceInFront = " TestName";
    String spaceInTheEnd = "TestName ";
    String twoSpaces = "Te St Name";
    String multipleSpaces = "Te St Na Me";
    String longerThanNineteen = "TestTest NameNameNam";
    String exactlyThreeSymbols = "T N";
    String exactlyNineteenSymbols = "TestTest NameNameNa";
    String averageLengthCorrectName = "Test Name";

    @Test
    public void accountNameWithExactlyThreeSymbolsShouldBeTrue(){
        Account account = new Account(exactlyThreeSymbols);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void accountNameWithExactlyNineteenSymbolsShouldBeTrue(){
        Account account = new Account(exactlyNineteenSymbols);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void accountWithAverageLengthCorrectNameShouldBeTrue(){
        Account account = new Account(averageLengthCorrectName);
        Assert.assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void accountNameShorterThanTreeShouldBeFalse(){
        Account account = new Account(shorterThanTree);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameLongerThanNineteenShouldBeFalse(){
        Account account = new Account(longerThanNineteen);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameBlankShouldBeFalse(){
        Account account = new Account(blank);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameWithoutSpacesShouldBeFalse(){
        Account account = new Account(noSpaces);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameWithSpaceInFrontShouldBeFalse(){
        Account account = new Account(spaceInFront);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameWithSpaceInTheEndShouldBeFalse(){
        Account account = new Account(spaceInTheEnd);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameWithTwoSpacesShouldBeFalse(){
        Account account = new Account(twoSpaces);
        Assert.assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void accountNameWithMultipleSpacesShouldBeFalse(){
        Account account = new Account(multipleSpaces);
        Assert.assertFalse(account.checkNameToEmboss());
    }
}
