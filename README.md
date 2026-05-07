# intertop-qa

Manual QA test documentation for [INTERTOP.KZ](https://intertop.kz) — a Kazakhstani online e-commerce store.

This repo contains manually written test cases and bug reports covering core user flows on the website.

---

## Coverage Summary

| Area | Test Cases | Bugs Found |
|---|---|---|
| Authentication | 4 | 2 |
| **Total** | **4** | **2** |

---

## Test Cases

| ID | Title | Status |
|---|---|---|
| [TC-001](test-cases/TC-001-signing-up-with-valid-email.md) | Signing up with valid email | Passed |
| [TC-002](test-cases/TC-002-signing-in-with-existing-email.md) | Signing in with existing email | Failed |
| [TC-003](test-cases/TC-003-signing-up-with-an-email-in-invalid-formats.md) | Signing up with an email in invalid formats | Passed |
| [TC-004](test-cases/TC-004-signing-in-with-non-existing-email.md) | Signing in with non-existing email | Passed |

---

## Bug Reports

| ID | Title | Severity | Status |
|---|---|---|---|
| [BUG-001](bug-reports/BUG-001-success-notification-auto-dismisses.md) | Success notification auto-dismisses without user interaction | Low | To Do |
| [BUG-002](bug-reports/BUG-002-sign-in-requires-phone-otp.md) | Sign in — linking a phone number is required for email-based auth | Medium | To Do |

---

## Environment

All test cases executed on:

| Field | Value |
|---|---|
| OS | macOS Tahoe 26.4 |
| Browser | Safari 26.4 (21624.1.16.11.4) |

---

## Notes
- Russian UI strings are preserved as-is since the website interface is available in Russian and Kazakh only
- Fresh email addresses are generated via [TempMail](https://temp-mail.org) before each run of auth-related test cases
