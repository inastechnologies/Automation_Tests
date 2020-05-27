package Tests;

import Pages.*;
import Utils.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationCodeTests extends BaseTest
{
    @Test
    public void VerifyIfUserCanNotNavigateToVerificationCodePageAfterCompletionOfVerifyYourAccountPage()
    {
        String Characters = Utils.printRandomString(6);
        String FirstName = "Sailaja" + Characters;
        String LastName = "Mamillapllai" + Characters;
        String AlphaNumeric = Utils.getAlphaNumericString(6);
        String Email = AlphaNumeric + "@gmail.com";
        int PhoneNumber = Utils.RandomGenerator();
        String PhoneNum = Integer.toString(PhoneNumber);
        String PhoneNo = "9" + PhoneNum;
        String Location = "Hyderabad";
        String Password = AlphaNumeric + "@Sai4";
        String ConfirmPassword = AlphaNumeric + "@Sai4";
        LandingPage homePage = new LandingPage(driver);
        SignUpPage signUpPage = homePage.NavigateToSignUpPage();
        signUpPage.EnterDataIntoAllTheFieldsInSignUpPage(FirstName, LastName, Email, PhoneNo, Location, Password, ConfirmPassword);
        SubscriptionPage subscriptionPage = signUpPage.ClickPractitionerCategoryClickTermsAndConditionsAndSignUp();

        BusinessInfoPage businessInfoPage = subscriptionPage.ClickOnTryButtonAndNavigateToBusinessInfoPage();

        businessInfoPage.CLickEveryFieldBeforeEnteringTheDataInBusinessInfoPage();
        PersonalInfoPage personalInfoPage = businessInfoPage.EnterDataIntoAllTheFieldsInBusinessInfoPageAndClickNext("Rainbow Children",
                "87523586390", "Nizampet Main Road", "India", "Hyderabad", "5377", "Telangana");

        EducationalInfoPage educationalInfoPage = personalInfoPage.EnterDateOfBirthUploadPictureAndClickNext("02/02/2000", personalInfoPage.DOBInputField);

        PracticeServiceDescriptionPage practiceServiceDescriptionPage = educationalInfoPage.EnterDataIntoAllTheFieldsInEducationInfoPageAndClickNext("MSC Chemistry",
                "Holistic Hospitals", "6587234996", "2020", "01/02/2021");

        practiceServiceDescriptionPage.EnterDataIntoAllTheFieldsInPracticeServiceDescriptionPageAndClickNext("test", "Practistioner", "fytftfytjf", "fggfgfgfhfh", "trytrgffhf",  "frdrdrd");

        VerifyYourAccountPage verifyYourAccountPage = new VerifyYourAccountPage(driver);

        VerificationCodePage verificationCodePage = verifyYourAccountPage.EnterPhoneOrEmailAndClickGetVerificationCode("9090909090");

        Assert.assertEquals(Utils.GetTextFromAnElement(driver, verificationCodePage.VerificationCodeText), "Verification Code");
    }

    @Test
    public void VerificationCodePageHasTheRequiredField()
    {
        String Characters = Utils.printRandomString(6);
        String FirstName = "Sailaja" + Characters;
        String LastName = "Mamillapllai" + Characters;
        String AlphaNumeric = Utils.getAlphaNumericString(6);
        String Email = AlphaNumeric + "@gmail.com";
        int PhoneNumber = Utils.RandomGenerator();
        String PhoneNum = Integer.toString(PhoneNumber);
        String PhoneNo = "9" + PhoneNum;
        String Location = "Hyderabad";
        String Password = AlphaNumeric + "@Sai4";
        String ConfirmPassword = AlphaNumeric + "@Sai4";
        LandingPage homePage = new LandingPage(driver);
        SignUpPage signUpPage = homePage.NavigateToSignUpPage();
        signUpPage.EnterDataIntoAllTheFieldsInSignUpPage(FirstName, LastName, Email, PhoneNo, Location, Password, ConfirmPassword);
        SubscriptionPage subscriptionPage = signUpPage.ClickPractitionerCategoryClickTermsAndConditionsAndSignUp();

        BusinessInfoPage businessInfoPage = subscriptionPage.ClickOnTryButtonAndNavigateToBusinessInfoPage();

        businessInfoPage.CLickEveryFieldBeforeEnteringTheDataInBusinessInfoPage();
        PersonalInfoPage personalInfoPage = businessInfoPage.EnterDataIntoAllTheFieldsInBusinessInfoPageAndClickNext("Rainbow Children",
                "87523586390", "Nizampet Main Road", "India", "Hyderabad", "5377", "Telangana");

        EducationalInfoPage educationalInfoPage = personalInfoPage.EnterDateOfBirthUploadPictureAndClickNext("02/02/2000", personalInfoPage.DOBInputField);

        PracticeServiceDescriptionPage practiceServiceDescriptionPage = educationalInfoPage.EnterDataIntoAllTheFieldsInEducationInfoPageAndClickNext("MSC Chemistry",
                "Holistic Hospitals", "6587234996", "2020", "01/02/2021");

        practiceServiceDescriptionPage.EnterDataIntoAllTheFieldsInPracticeServiceDescriptionPageAndClickNext("test","Practistioner", "fytftfytjf", "fggfgfgfhfh", "trytrgffhf",  "frdrdrd");

        VerifyYourAccountPage verifyYourAccountPage = new VerifyYourAccountPage(driver);

        VerificationCodePage verificationCodePage = verifyYourAccountPage.EnterPhoneOrEmailAndClickGetVerificationCode("9090909090");

        Assert.assertEquals(Utils.GetTextFromAnElement(driver, verificationCodePage.VerificationSubject), "Please enter the verification code sent to your Mobile number or Email");
    }

    @Test
    public void VerifyUserCanNotNavigateToNextPageWithoutEnteringDataInVerificationCodePage()
    {
        String Characters = Utils.printRandomString(6);
        String FirstName = "Sailaja" + Characters;
        String LastName = "Mamillapllai" + Characters;
        String AlphaNumeric = Utils.getAlphaNumericString(6);
        String Email = AlphaNumeric + "@gmail.com";
        int PhoneNumber = Utils.RandomGenerator();
        String PhoneNum = Integer.toString(PhoneNumber);
        String PhoneNo = "9" + PhoneNum;
        String Location = "Hyderabad";
        String Password = AlphaNumeric + "@Sai4";
        String ConfirmPassword = AlphaNumeric + "@Sai4";
        LandingPage homePage = new LandingPage(driver);
        SignUpPage signUpPage = homePage.NavigateToSignUpPage();
        signUpPage.EnterDataIntoAllTheFieldsInSignUpPage(FirstName, LastName, Email, PhoneNo, Location, Password, ConfirmPassword);
        SubscriptionPage subscriptionPage = signUpPage.ClickPractitionerCategoryClickTermsAndConditionsAndSignUp();

        BusinessInfoPage businessInfoPage = subscriptionPage.ClickOnTryButtonAndNavigateToBusinessInfoPage();

        businessInfoPage.CLickEveryFieldBeforeEnteringTheDataInBusinessInfoPage();
        PersonalInfoPage personalInfoPage = businessInfoPage.EnterDataIntoAllTheFieldsInBusinessInfoPageAndClickNext("Rainbow Children",
                "87523586390", "Nizampet Main Road", "India", "Hyderabad", "5377", "Telangana");

        EducationalInfoPage educationalInfoPage = personalInfoPage.EnterDateOfBirthUploadPictureAndClickNext("02/02/2000", personalInfoPage.DOBInputField);

        PracticeServiceDescriptionPage practiceServiceDescriptionPage = educationalInfoPage.EnterDataIntoAllTheFieldsInEducationInfoPageAndClickNext("MSC Chemistry",
                "Holistic Hospitals", "6587234996", "2020", "01/02/2021");

        practiceServiceDescriptionPage.EnterDataIntoAllTheFieldsInPracticeServiceDescriptionPageAndClickNext("test","Practistioner", "fytftfytjf", "fggfgfgfhfh", "trytrgffhf",  "frdrdrd");

        VerifyYourAccountPage verifyYourAccountPage = new VerifyYourAccountPage(driver);

        VerificationCodePage verificationCodePage = verifyYourAccountPage.EnterPhoneOrEmailAndClickGetVerificationCode("9090909090");

        Utils.WaitForAnElementToExist(driver, verificationCodePage.VerifyButton);
        verificationCodePage.VerifyButton.click();

        Assert.assertEquals(Utils.GetTextFromAnElement(driver, verificationCodePage.VerificationErrorText), "Please enter the verification code");
    }

    @Test
    public void VerifyCodeFieldIsAcceptingValidCode()
    {
        String Characters = Utils.printRandomString(6);
        String FirstName = "Sailaja" + Characters;
        String LastName = "Mamillapllai" + Characters;
        String AlphaNumeric = Utils.getAlphaNumericString(6);
        String Email = AlphaNumeric + "@gmail.com";
        int PhoneNumber = Utils.RandomGenerator();
        String PhoneNum = Integer.toString(PhoneNumber);
        String PhoneNo = "9" + PhoneNum;
        String Location = "Hyderabad";
        String Password = AlphaNumeric + "@Jk5";
        String ConfirmPassword = AlphaNumeric + "@Jk5";
        LandingPage homePage = new LandingPage(driver);
        SignUpPage signUpPage = homePage.NavigateToSignUpPage();
        signUpPage.EnterDataIntoAllTheFieldsInSignUpPage(FirstName, LastName, Email, PhoneNo, Location, Password, ConfirmPassword);
        SubscriptionPage subscriptionPage = signUpPage.ClickPractitionerCategoryClickTermsAndConditionsAndSignUp();

        BusinessInfoPage businessInfoPage = subscriptionPage.ClickOnTryButtonAndNavigateToBusinessInfoPage();

        businessInfoPage.CLickEveryFieldBeforeEnteringTheDataInBusinessInfoPage();
        PersonalInfoPage personalInfoPage = businessInfoPage.EnterDataIntoAllTheFieldsInBusinessInfoPageAndClickNext("Rainbow Children",
                "87523586390", "Nizampet Main Road", "India", "Hyderabad", "5377", "Telangana");

        EducationalInfoPage educationalInfoPage = personalInfoPage.EnterDateOfBirthUploadPictureAndClickNext("02/02/1992", personalInfoPage.DOBInputField);

        PracticeServiceDescriptionPage practiceServiceDescriptionPage = educationalInfoPage.EnterDataIntoAllTheFieldsInEducationInfoPageAndClickNext("hasg",
                "asfa", "2658787656", "2020", "01/02/2021");

        VerifyYourAccountPage verifyYourAccountPage = practiceServiceDescriptionPage.EnterDataIntoAllTheFieldsInPracticeServiceDescriptionPageAndClickNext("test", "hsdfbdsf", "zxzc", "zczx", "zvvz",  "frdrdrd");

        VerificationCodePage verificationCodePage = verifyYourAccountPage.EnterPhoneOrEmailAndClickGetVerificationCode("9000000001");

        verificationCodePage.EnterCodeAndClickSubmit("1", "2", "3", "4");

        Assert.assertFalse(Utils.IsElementDisplayed(driver, verificationCodePage.VerificationErrorText));
    }

    @Test
    public void VerifyCodeFieldIsNotAcceptingInValidCode()
    {
        String Characters = Utils.printRandomString(6);
        String FirstName = "Sailaja" + Characters;
        String LastName = "Mamillapllai" + Characters;
        String AlphaNumeric = Utils.getAlphaNumericString(6);
        String Email = AlphaNumeric + "@gmail.com";
        int PhoneNumber = Utils.RandomGenerator();
        String PhoneNum = Integer.toString(PhoneNumber);
        String PhoneNo = "9" + PhoneNum;
        String Location = "Hyderabad";
        String Password = AlphaNumeric + "@Jk5";
        String ConfirmPassword = AlphaNumeric + "@Jk5";
        LandingPage homePage = new LandingPage(driver);
        SignUpPage signUpPage = homePage.NavigateToSignUpPage();
        signUpPage.EnterDataIntoAllTheFieldsInSignUpPage(FirstName, LastName, Email, PhoneNo, Location, Password, ConfirmPassword);
        SubscriptionPage subscriptionPage = signUpPage.ClickPractitionerCategoryClickTermsAndConditionsAndSignUp();

        BusinessInfoPage businessInfoPage = subscriptionPage.ClickOnTryButtonAndNavigateToBusinessInfoPage();

        businessInfoPage.CLickEveryFieldBeforeEnteringTheDataInBusinessInfoPage();
        PersonalInfoPage personalInfoPage = businessInfoPage.EnterDataIntoAllTheFieldsInBusinessInfoPageAndClickNext("Rainbow Children",
                "87523586390", "Nizampet Main Road", "India", "Hyderabad", "5377", "Telangana");

        EducationalInfoPage educationalInfoPage = personalInfoPage.EnterDateOfBirthUploadPictureAndClickNext("02/02/1992", personalInfoPage.DOBInputField);

        PracticeServiceDescriptionPage practiceServiceDescriptionPage = educationalInfoPage.EnterDataIntoAllTheFieldsInEducationInfoPageAndClickNext("hasg",
                "asfa", "2658787656", "2020", "01/02/2021");

        VerifyYourAccountPage verifyYourAccountPage = practiceServiceDescriptionPage.EnterDataIntoAllTheFieldsInPracticeServiceDescriptionPageAndClickNext("test","hsdfbdsf", "zxzc", "zczx", "zvvz",  "frdrdrd");

        VerificationCodePage verificationCodePage = verifyYourAccountPage.EnterPhoneOrEmailAndClickGetVerificationCode("9000000001");

        verificationCodePage.EnterCodeAndClickSubmit("g", "k", "jhj", "kjhkj");

        Assert.assertEquals(Utils.GetTextFromAnElement(driver, verificationCodePage.VerificationErrorText), "Please enter valid verification code");
    }
}






