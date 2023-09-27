Feature:Newme ContactUs page

  Scenario Outline:Enter the data and submit it
    Given enter url "https://newmetech.in/"
    Then click enroll now
    And Enter the details '<Name>' ,'<EmailAddress>','<MobileNumber>','<ReferredBy>','<Message>'
    Then click submit and validate the success message

    Examples:
    |Name |EmailAddress    | MobileNumber|ReferredBy|Message|
    |Tara |tara.18@gmail.com|8627334442   |Dinesh    |Hi,I wanted to join as a tutor for selenium|


