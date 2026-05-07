# TC-005: Resetting the password via email for an existing user

| Field | Details |
|---|---|
| **ID** | TC-005 |
| **Title** | Resetting the password via email for an existing user |
| **Status** | Blocked |

## Preconditions
1. The homepage is opened
2. The user is signed up via credentials from this TC's Test Data, following [TC-001](TC-001-signing-up-with-valid-email.md)
3. The user is logged out
4. The mailbox for the email from Test Data is opened in any email service

## Test Data
| Field | Value |
|---|---|
| Email | visiwi6199@imashr.com (TempMail) |
| Email password | Test123 |
| User account password | Test123 |

> ⚠️ After running this TC, update the User account password in Test Data with the new one used in step 10.

## Steps
1. Click on persona icon at top-right to open the form
2. Paste the email into the "Телефон или Email" field
3. Click on "Забыли пароль?" button
4. A new field for an email the password reset message'd be sent on appears. The field gets automatically filled up with the email typed in the "Телефон или Email" field. Review the match between these two
5. Click on "ОТПРАВИТЬ" button
6. Click on "I'm not a robot" checkbox and complete the captcha
7. Click on "ОТПРАВИТЬ" button again
8. Open recovery email received in mailbox
9. In the message opened, click on "ИЗМЕНИТЬ МОЙ ПАРОЛЬ" button
10. In a new tab opened, type a new, at least 6 symbols long password in the "Новый пароль" field
11. Click on "ОТПРАВИТЬ" button

## Expected Result
A "Пароль успешно изменён!" message box appears and auto-dismisses in ~3 seconds. The user can now sign in with the new password. Verify behavior following [TC-002](TC-002-signing-in-with-existing-email.md).

## Actual Result
A "Пароль успешно изменён!" message box appeared and auto-dismissed in ~3 seconds. Unable to sign in — linking a phone number is required during sign in after entering valid credentials to complete auth.
