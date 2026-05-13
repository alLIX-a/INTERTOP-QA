# intertop-qa
Документация по ручному тестированию [INTERTOP.KZ](https://intertop.kz) — казахстанского интернет-магазина.

Репозиторий содержит написанные вручную тест-кейсы и баг-репорты, покрывающие основные пользовательские сценарии на сайте.

---

## Сводка покрытия

| Область | Тест-кейсы | Пройдено | Провалено | Заблокировано | Найдено багов |
|---|---|---|---|---|---|
| Авторизация | 7 | 5 | 1 | 1 | 3 |
| API: Каталог товаров | 1 | 1 | 0 | 0 | 0 |
| **Итого** | **8** | **1** | **1** | **1** | **3** |

---

## Тест-кейсы

| ID | Название | Статус |
|---|---|---|
| [TC-001](test-cases/TC-001-signing-up-with-valid-email.md) | Регистрация с валидным email | Пройден |
| [TC-002](test-cases/TC-002-signing-in-with-existing-email.md) | Вход с существующим email | Провален |
| [TC-003](test-cases/TC-003-signing-up-with-an-email-in-invalid-formats.md) | Регистрация с email в невалидных форматах | Пройден |
| [TC-004](test-cases/TC-004-signing-in-with-non-existing-email.md) | Вход с несуществующим email | Пройден |
| [TC-005](test-cases/TC-005-resetting-the-password-via-email-for-an-existing-user.md) | Сброс пароля через email для существующего пользователя | Заблокирован |
| [TC-006](test-cases/TC-006-registration-with-invalid-password.md) | Регистрация с невалидным паролем | Пройден |
| [TC-007](test-cases/TC-007-registration-with-existing-email.md) | Регистрация с существующим email | Пройден |

## API Testing

Инструмент: Postman  
База: `https://front-api.intertop.kz`

### Эндпоинты

| Эндпоинт | Метод | Описание |
|----------|-------|----------|
| /catalogApi/getProduct | GET | Получение данных товара по slug |
| /commonApi/getCity | POST | Получение данных о городе |

### API тест-кейсы
| ID | Название | Статус |
|---|---|---|
| [TC-008](test-cases/TC-008-get-catalog-api-get-product.md) | GET /catalogApi/getProduct — валидный slug | Пройден |

---

## Баг-репорты

| ID | Название | Серьёзность | Статус |
|---|---|---|---|
| [BUG-001](bug-reports/BUG-001-success-notification-auto-dismisses-without-user-interaction.md) | Уведомление об успехе закрывается автоматически без действий пользователя | Низкая | К выполнению |
| [BUG-002](bug-reports/BUG-002-Sign-in-linking-a-phone-number-is-required-for-an-email-based-auth.md) | Вход — для авторизации через email требуется привязка номера телефона | Средняя | К выполнению |
| [BUG-003](bug-reports/BUG-003-Password-reset-setting-current-password-as-the-new-one-is-allowed.md) | Сброс пароля — установка текущего пароля в качестве нового разрешена | Средняя | К выполнению |

---

## Окружение

Все тест-кейсы выполнены в следующем окружении:

| Поле | Значение |
|---|---|
| ОС | macOS Tahoe 26.4 |
| Браузер | Safari 26.4 (21624.1.16.11.4) |

---

## Примечания

- Строки интерфейса на русском сохранены как есть, поскольку сайт доступен только на русском и казахском языках
- Свежие email-адреса генерируются через [TempMail](https://temp-mail.org) перед каждым запуском тест-кейсов связанных с авторизацией
- TempMail адреса одноразовые и становятся недоступны после закрытия сессии — для воспроизведения тест-кейсов необходимо генерировать новый адрес
