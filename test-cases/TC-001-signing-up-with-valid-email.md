# TC-001: Signing up with valid email

| Field | Details |
|---|---|
| **ID** | TC-001 |
| **Title** | Signing up with valid email |
| **Status** | Passed |

## Preconditions
1. The homepage is opened
2. The user is logged out

## Test Data
| Field | Value |
|---|---|
| Email | Generate a fresh address before each run on [TempMail](https://temp-mail.org) |
| Password | Test123 |

## Steps
1. Click on persona icon at top-right to open the form
2. Click on "Создать аккаунт" button to switch to the sign-up form
3. Paste the generated email address into the "Телефон или Email" field
4. Paste the password into the "Пароль" field
5. Click on "I'm not a robot" checkbox and complete the captcha
6. Click on "Создать аккаунт" button to submit

## Expected Result
A box with a "Поздравляем, регистрация прошла удачно!" message appears which can be closed by clicking on the cross icon at top-right. The user is now registered and gets signed in automatically. Clicking on the persona icon now shows a dropdown menu with "Мой профиль" option, which redirects the user to the profile page.

## Actual Result
Success message appeared but got dismissed automatically without clicking on cross icon. Dropdown is shown with "Мой профиль" option and redirected to the profile page correctly.

