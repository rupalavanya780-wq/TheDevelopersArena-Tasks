# Test Cases

Run these tests manually from the application menu.

| Test | Input/action | Expected result |
|---|---|---|
| 1 | Start program | Menu is displayed |
| 2 | Choose option 1 and enter a valid name and five marks | Student is added |
| 3 | Enter mark `-1` | Error message; asks for mark again |
| 4 | Enter mark `101` | Error message; asks for mark again |
| 5 | Enter mark `abc` | Numeric-input error; asks for mark again |
| 6 | Enter mark `0` | Accepted |
| 7 | Enter mark `100` | Accepted |
| 8 | Choose option 2 after adding students | All student records are displayed |
| 9 | Choose option 3 | Average, highest, lowest, and grade are displayed |
| 10 | Choose option 4 | Student with highest average is displayed |
| 11 | Search using different letter case | Matching student is found |
| 12 | Search for an unknown name | `Student not found.` is displayed |
| 13 | Choose option 6 | Class report and grade distribution are displayed |
| 14 | Enter a letter for menu choice | Input error; menu choice is requested again |
| 15 | Choose option 7 | Program exits |

## Example calculation

Marks: 90, 80, 70, 60, 100

- Total = 400
- Average = 400 / 5 = 80
- Highest = 100
- Lowest = 60
- Grade = B
