# TC-002: Signing in with existing email

| Field | Details |
|---|---|
| **ID** | TC-002 |
| **Title** | Signing in with existing email |
| **Status** | Failed |

## Preconditions
1. The homepage is opened
2. The user is logged out
3. The user has a pre-registered account with the credentials from Test Data

## Test Data
| Field | Value |
|---|---|
| Email | gomimoh799@lohinja.com (TempMail) |
| Password | Test123 |

## Steps
1. Click on persona icon at top-right to open the form
2. Paste the email into the "Телефон или Email" field
3. Paste the password into the "Пароль" field
4. Click on "Войти" button

## Expected Result
A box with a success message appears which can be closed by clicking on cross icon at top-right. The user is signed in. Clicking on persona icon now shows a dropdown menu with "Мой профиль" option, which redirects the user to the profile page.

## Actual Result
A phone number field appears, prompting the user to enter their phone number and receive an OTP and pass the captcha to complete sign in.
