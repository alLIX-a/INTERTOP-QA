# TC-003: Signing up with an email in invalid formats

| Field | Details |
|---|---|
| **ID** | TC-003 |
| **Title** | Signing up with an email in invalid formats |
| **Status** | Passed |

## Preconditions
1. The homepage is opened
2. The user is logged out

## Test Data
| # | Email | Description |
|---|---|---|
| 1 | testemail@domain. | Missing part after dot |
| 2 | testemail@domain | Missing dot and part after it |
| 3 | testemail@.com | Missing domain |
| 4 | testemaildomain.com | Missing @ |
| 5 | testemail | Missing @ and domain |
| — | Test123 | Password (same for all runs) |

## Steps
1. Click on persona icon at top-right to open the form
2. In the form opened, click on "Создать аккаунт" button
3. Paste the first email from Test Data into the "Телефон или Email" field
4. Paste the password into the "Пароль" field
5. Click on "I'm not a robot" checkbox and complete the captcha
6. Click on "Создать аккаунт" button
7. Repeat steps 3-6 with every email listed in Test Data. To verify none of the invalid emails were registered, attempt to sign in with each one following TC-004 (ignore test data in TC-004)

## Expected Result
"Телефон или Email" field's borders become red, with a red-colored "Введите телефон или Email" message appearing under the field. Clicking on "Создать аккаунт" button doesn't register the user.

## Actual Result
"Телефон или Email" field's borders became red, the "Введите телефон или Email" error message appeared under the field for all 5 email variations. None of the invalid emails were registered, verified via [TC-004](TC-004-signing-in-with-non-existing-email.md).
