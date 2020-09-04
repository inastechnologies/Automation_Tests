package Pages;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EditAppointmentPage extends BasePage
{
    public EditAppointmentPage(WebDriver driver)
    {
        super(driver);
    }



    @FindBy(xpath = "//button[text()=' Edit ']")
    public List<WebElement> EditPageHeadings;

    @FindBy(xpath = "//button[text()=' Confirmations & Reminders ']")
    public WebElement EditConfirmationRemindersHeading;

    @FindBy(xpath = "//button[text()=' Cancellation or Reschedule Policy ']")
    public WebElement EditCancellationRescheduleHeading;

    @FindBy(xpath = "//span[text()=' Note : Please Select Location and Modality To Edit Particular Event Type or Service Type ']")
    public WebElement Note;

    @FindBy(css = "div.title")
    public List<WebElement> LocationModalityFieldsText;

    @FindBy(css = "span.title")
    public List<WebElement> MandatoryFieldsText;

    @FindBy(xpath = "//select[@formcontrolname='pract_location']")
    public WebElement LocationInput;

    @FindBy(css = "i.tool-tip__icon")
    public List<WebElement> ToolTipIcons;

    @FindBy(css = "p.tool-tip__info")
    public List<WebElement> ToolTipInfo;

    @FindBy(xpath = "//input[@formcontrolname='type']")
    public List<WebElement> SessionTypeRadioButtons;

    @FindBy(name = "from_date")
    public WebElement FromDateField;

    @FindBy(name = "to_date")
    public WebElement ToDateField;

    @FindBy(id = "swal2-title")
    public WebElement SwalTitle;

    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement CancelButton;

    @FindBy(xpath = "//select[@formcontrolname='modality']")
    public WebElement ModalityInput;

    @FindBy(xpath = "//span[text()='Do not offer booking more than ']")
    public WebElement NoOfBookingsDaysText;

    @FindBy(xpath = "//select[@formcontrolname='no_of_booking_days']")
    public WebElement NOOfBookingDaysInput;

    @FindBy(xpath = "//input[@type='date']")
    public WebElement DateInput;

    @FindBy(xpath = "//select[@formcontrolname='select_day']")
    public WebElement SelectDayInput;

    @FindBy(xpath = "//div[text()=' Opening Hours : ']")
    public WebElement OpeningHoursText;

    @FindBy(css = "span.slot")
    public List<WebElement> Slots;

    @FindBy(xpath = "//span[text()='X']")
    public List<WebElement> CancelSlot;

    @FindBy(css = "button.swal2-confirm.swal2-styled")
    public WebElement DeleteItButton;

    @FindBy(xpath = "//div[text()=' Appointment type : ']")
    public WebElement AppointmentTypeText;

    @FindBy(xpath = "//input[@formcontrolname='name']")
    public WebElement NameInput;

    @FindBy(xpath = "//select[@formcontrolname='nominutes']")
    public WebElement DurationMinsInput;

    @FindBy(xpath = "//select[@formcontrolname='nohours']")
    public WebElement DurationHoursInput;

    @FindBy(xpath = "//input[@formcontrolname='fee']")
    public WebElement FeesInput;

    @FindBy(xpath = "//select[@formcontrolname='eventMinutes']")
    public WebElement EventMinsInput;

    @FindBy(xpath = "//select[@formcontrolname='eventHours']")
    public WebElement EventHoursInput;

    @FindBy(xpath = "//select[@formcontrolname='cutHours']")
    public WebElement CutOffHours;

    @FindBy(xpath = "//select[@formcontrolname='cutMinutes']")
    public WebElement CutOffMins;

    @FindBy(xpath = "//select[@formcontrolname='consultation_type']")
    public WebElement ConsultationTypeInput;

    @FindBy(xpath = "//textarea[@formcontrolname='description']")
    public WebElement Description;

    @FindBy(css = "button.event-button")
    public List<WebElement> CreateEvenButtons;

    @FindBy(css = "span.fromToSlot.fromToSlot-type.hand-pointer")
    public List<WebElement> AppointmentTypeSlots;

    @FindBy(xpath = "//input[@type='time']")
    public List<WebElement> TimeInput;

    @FindBy(css = "button.time.add-button")
    public WebElement AddButton;

    @FindBy(xpath = "//div[text()='Above field is required']")
    public WebElement DateErrorMessage;

    @FindBy(css = "div.text-error")
    public List<WebElement> ErrorMessages;

    @FindBy(xpath = "//div[text()='Name is required']")
    public WebElement NameError;

    @FindBy(css = "button.q-button.view-button")
    public WebElement SaveAndContinue;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement OkButton;


    public void SelectLocationAndModalityInEditAppointmentPage(String Location, String Modality) {

        Utils.WaitForAnElementToExist(driver, LocationInput);
        Utils.SelectFromDropDownUsingVisibleText(LocationInput, Location);
        Utils.SelectFromDropDownUsingVisibleText(ModalityInput, Modality);
    }

    public void SelectDayAndOpeningHours(String Day, String FromTime, String ToTime) {

        Utils.SelectFromDropDownUsingVisibleText(SelectDayInput, Day);
        TimeInput.get(0).sendKeys(FromTime);
        TimeInput.get(1).sendKeys(ToTime);
    }

    public void SelectRecurringWithDateRangeSessionTypeAndEnterFromDateAndToDate(String FromDate, String ToDate, String Day, String FromTime, String ToTime ) {

        Utils.WaitForElementsToExist(driver, SessionTypeRadioButtons);
        SessionTypeRadioButtons.get(1).click();
        FromDateField.sendKeys(FromDate);
        ToDateField.sendKeys(ToDate);
        Utils.SelectFromDropDownUsingVisibleText(SelectDayInput, Day);
        TimeInput.get(0).sendKeys(FromTime);
        TimeInput.get(1).sendKeys(ToTime);
    }

    public void SelectRecurringWithDateSpecificSessionTypeAndEnterDate(String Date, String FromTime, String ToTime) {

        Utils.WaitForElementsToExist(driver, SessionTypeRadioButtons);
        SessionTypeRadioButtons.get(2).click();
        DateInput.sendKeys(Date);
        TimeInput.get(0).sendKeys(FromTime);
        TimeInput.get(1).sendKeys(ToTime);
    }

    public void EditDataInTheFieldsOfAppointmentType(String Name, String Hours, String Minutes, String Fees) {

        Utils.WaitForAnElementToExist(driver, NameInput);
        NameInput.sendKeys(Name);
        DurationHoursInput.sendKeys(Hours);
        DurationMinsInput.sendKeys(Minutes);
        FeesInput.sendKeys(Fees);
    }

    public void CreateEventForRecurringSessionType(String Location, String Modality, String Day, String FromTime, String ToTime) {

       SelectLocationAndModalityInEditAppointmentPage(Location, Modality);
       //SelectRecurringSessionType_SelectDayAndOpeningHoursInCreateAppointmentPage(Day, FromTime, ToTime);
       AddButton.click();
    }

    public void CreateEventForRecurringWithInDateRangeSessionType(String Location, String Modality, String FromDate, String ToDate, String Day, String FromTime, String ToTime) {

        SelectLocationAndModalityInEditAppointmentPage(Location, Modality);
        //SelectRecurringWithDateRangeSessionTypeAndEnterFromDateAndToDate(FromDate, ToDate, Day, FromTime, ToTime);
        AddButton.click();
    }

    public void CreateEventForDateSpecificSessionType(String Location, String Modality, String Date, String FromTime, String ToTime) {

        SelectLocationAndModalityInEditAppointmentPage(Location, Modality);
        SelectRecurringWithDateSpecificSessionTypeAndEnterDate(Date, FromTime, ToTime);
        AddButton.click();
    }

    public SetConfirmationsRemindersPage EnterConsultationType_EventStartTime_CutOffTime_Description(String Consultation, String EventHours, String EventMinutes, String CutOffTHours, String CutOffTMins, String Text) {

        Utils.SelectFromDropDownUsingVisibleText(ConsultationTypeInput, Consultation);
        Utils.SelectFromDropDownUsingVisibleText(EventHoursInput, EventHours);
        Utils.SelectFromDropDownUsingVisibleText(EventMinsInput, EventMinutes);
        Utils.SelectFromDropDownUsingVisibleText(CutOffHours, CutOffTHours);
        Utils.SelectFromDropDownUsingVisibleText(CutOffMins, CutOffTMins);
        Description.sendKeys(Text);

        return new SetConfirmationsRemindersPage(driver);
    }
}
