# Test Cases – Student Information System

|TestID|     Feature             |              Test Input / Action                        | Expected Result                             |
|------|-------------------------|---------------------------------------------------------|-----------------
| TC01 | Add Student             | Enter valid student details with a unique ID            | Student is added successfully               |
| TC02 | Duplicate Student ID    | Enter an ID that already exists                         | Duplicate ID is rejected                    |
| TC03 | Invalid Age             | Enter age as 0 or a negative number                     | Invalid age is rejected                     |
| TC04 | Invalid Grade           | Enter a grade below 0 or above 100                      | Invalid grade is rejected                   |
| TC05 | Invalid Contact         | Enter letters or a contact number that is not 10 digits | Invalid contact is rejected                 |
| TC06 | View Students           | Select the view option when records exist               | Student records appear in a formatted table |
| TC07 | Search Existing Student | Enter an existing Student ID                            | Matching student details are displayed      |
| TC08 | Search Missing Student  | Enter a nonexistent Student ID                          | A not-found message is displayed            |
| TC09 | Edit Student            | Enter an existing ID and valid updated details          | Student details are updated                 |
| TC10 | Edit Missing Student    | Enter a nonexistent Student ID                          | A not-found message is displayed            |
| TC11 | Delete Student          | Enter an existing Student ID                            | Student record is deleted                   |
| TC12 | Delete Missing Student  | Enter a nonexistent Student ID                          | A not-found message is displayed            |
| TC13 | Exit                    | Select menu option 6                                    | Application exits                           |
