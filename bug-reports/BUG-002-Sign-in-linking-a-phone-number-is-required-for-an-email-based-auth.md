# BUG-002: Sign in — linking a phone number is required for an email-based auth

| Field | Details |
|---|---|
| **ID** | BUG-002 |
| **Severity** | Medium |
| **Status** | To Do |
| **Reporter** | Alexey |
| **Related TC** | [TC-002](../test-cases/TC-002-signing-in-with-existing-email.md) |

## Preconditions
1. The homepage is opened
2. The user is logged out
3. The user is signed up with credentials from Test Data

## Test Data
| Field | Value |
|---|---|
| Email | gomimoh799@lohinja.com (TempMail) |
| Password | Test123 |

## Steps to Reproduce
1. Click on persona icon at top-right to open the form
2. Paste the email into the "Телефон или Email" field
3. Paste the password into the "Пароль" field
4. Click on "Войти" button

## Expected Result
A box with a success message appears which can be closed by clicking on cross icon at top-right. The user is signed in. Clicking on persona icon now shows a dropdown menu with "Мой профиль" option, which redirects the user to the profile page.

## Actual Result
A phone number field appears, prompting the user to enter their phone number and receive an OTP and pass the captcha to complete sign in.

## Environment
| Field | Value |
|---|---|
| OS | macOS Tahoe 26.4 |
| Browser | Safari 26.4 (21624.1.16.11.4) |
