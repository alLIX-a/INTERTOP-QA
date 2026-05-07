# BUG-001: Success notification auto-dismisses without user interaction

| Field | Details |
|---|---|
| **ID** | BUG-001 |
| **Severity** | Low |
| **Status** | To Do |
| **Reporter** | Alexey |
| **Related TC** | [TC-001](../test-cases/TC-001-signing-up-with-valid-email.md) |

## Preconditions
1. The homepage is opened
2. The user is logged out

## Test Data
| Field | Value |
|---|---|
| Email | Generate a fresh address before each run on [TempMail](https://temp-mail.org) |
| Password | Test123 |

## Steps to Reproduce
1. Click on persona icon at top-right to open the form
2. Click on "Создать аккаунт" button to switch to the sign-up form
3. Paste the generated email address into the "Телефон или Email" field
4. Paste the password into the "Пароль" field
5. Click on "I'm not a robot" checkbox and complete the captcha
6. Click on "Создать аккаунт" button to submit

## Expected Result
A box with a "Поздравляем, регистрация прошла удачно!" message appears which can be closed by clicking on the cross icon at top-right.

## Actual Result
A box with a "Поздравляем, регистрация прошла удачно!" message appears and gets closed automatically in ~3 seconds.

## Environment
| Field | Value |
|---|---|
| OS | macOS Tahoe 26.4 |
| Browser | Safari 26.4 (21624.1.16.11.4) |
