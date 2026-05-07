# BUG-003: Password reset — setting current password as the new one is allowed

| Field | Details |
|---|---|
| **ID** | BUG-003 |
| **Severity** | Medium |
| **Status** | To Do |
| **Reporter** | Alexey |
| **Related TC** | [TC-005](../test-cases/TC-005-resetting-the-password-via-email-for-an-existing-user.md) |

## Preconditions
1. The homepage is opened
2. The user is signed up via credentials from this TC's Test Data, following [TC-001](../test-cases/TC-001-signing-up-with-valid-email.md)
3. The user is logged out
4. The mailbox for the email from Test Data is opened in any email service

## Test Data
| Field | Value |
|---|---|
| Email | visiwi6199@imashr.com (TempMail) |
| Email password | Test123 |
| User account password | Test123 |

## Steps to Reproduce
1. Click on persona icon at top-right to open the form
2. Paste the email into the "Телефон или email" field
3. Click on "Забыли пароль?" button
4. A new field for an email the password reset message'd be sent on appears. The field gets automatically filled up with email typed in "Телефон или Email" field. Review the match between these two
5. Click on "ОТПРАВИТЬ" button
6. Click on "I'm not a robot" checkbox and complete the captcha
7. Click on "ОТПРАВИТЬ" button again
8. Open recovery email received in mailbox
9. In the message opened, click on "ИЗМЕНИТЬ МОЙ ПАРОЛЬ" button
10. In a new tab opened, paste the user account password into the "Новый пароль" field
11. Click on "ОТПРАВИТЬ" button

## Expected Result
An error message appears, prompting the user to enter a password that differs from the current one.

## Actual Result
A "Пароль успешно изменён!" message box appeared and the password was successfully changed to the same one without any validation error.

## Environment
| Field | Value |
|---|---|
| OS | macOS Tahoe 26.4 |
| Browser | Safari 26.4 (21624.1.16.11.4) |
