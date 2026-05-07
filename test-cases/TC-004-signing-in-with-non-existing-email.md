# TC-004: Signing in with non-existing email

| Field | Details |
|---|---|
| **ID** | TC-004 |
| **Title** | Signing in with non-existing email |
| **Status** | Passed |

## Preconditions
1. The homepage is opened
2. The user is logged out

## Test Data
| Field | Value |
|---|---|
| Email | notexistingemail@email.com |
| Password | Test123 |

## Steps
1. Click on persona icon at top-right to open the form
2. Paste the email into the "Телефон или Email" field
3. Paste the password into the "Пароль" field
4. Click on "Войти" button

## Expected Result
Both fields' borders become red. The "Неверный логин или пароль" error message appears under both fields. The user isn't signed in.

## Actual Result
Both fields' borders are red. The "Неверный логин или пароль" error message appears under both fields. The user isn't signed in.
