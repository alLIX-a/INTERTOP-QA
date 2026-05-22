# intertop-qa
Документация по ручному тестированию [INTERTOP.KZ](https://intertop.kz) — казахстанского интернет-магазина.

Репозиторий содержит написанные вручную тест-кейсы и баг-репорты, покрывающие основные пользовательские сценарии на сайте.

---

## Сводка покрытия

| Область | Тест-кейсы | Пройдено | Провалено | Заблокировано | Найдено багов |
|---|---|---|---|---|---|
| Авторизация | 7 | 5 | 1 | 1 | 3 |
| Поиск товаров | 12 | 10 | 2 | 0 | 2 |
| API: Каталог товаров | 3 | 2 | 1 | 0 | 2 |
| Добавление товара в корзину | 4 | 4 | 0 | 0 | 0 |
| **Итого** | **26** | **21** | **4** | **1** | **7** |

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
| [TC-011](test-cases/TC-011-searching-for-an-existing-item.md) | Поиск существующего товара | Пройден |
| [TC-012](test-cases/TC-012-searching-for-an-existing-item-in-uppercase.md) | Поиск существующего товара в верхнем регистре | Пройден |
| [TC-013](test-cases/TC-013-searching-for-an-existing-item-with-a-whitespace-in-a-word.md) | Поиск существующего товара с пробелом внутри слова в названии товара | Пройден |
| [TC-014](test-cases/TC-014-searching-for-non-existing-item.md) | Поиск несуществующего товара | Пройден |
| [TC-015](test-cases/TC-015-searching-for-an-item-with-129-characters-long-string.md) | Поиск товара со строкой в 129 символов (на 1 больше максимальной границы) | Пройден |
| [TC-016](test-cases/TC-016-searching-for-an-item-with-empty-search-field.md) | Поиск товара с пустым полем ввода | Провален |
| [TC-017](test-cases/TC-017-searching-for-an-existing-item-with-incomplete-item-name.md) | Поиск существующего товара с неполным названием | Пройден |
| [TC-018](test-cases/TC-018-searching-for-an-item-with-request-min-length-of-3-characters.md) | Поиск товара с запросом минимально допустимой длины (3 символа) | Пройден |
| [TC-019](test-cases/TC-019-searching-for-an-item-with-2-characters-long-string.md) | Поиск товара с запросом длиной в 2 символа (минимально допустимая - 3 символа) | Провален |
| [TC-020](test-cases/TC-020-injecting-sql-into-the-search-field.md) | Ввод SQL-инъекции в поле поиска товара | Пройден |
| [TC-021](test-cases/TC-021-injecting-xss-into-the-search-field.md) | Ввод XSS-инъекции в поле поиска товара | Пройден |
| [TC-022](test-cases/TC-022-special-symbols-in-a-search-field.md) | Ввод спецсимволов в поле поиска товара | Пройден |
| [TC-023](test-cases/TC-023-adding-an-item-with-size-selected-to-cart.md) | Добавление товара с заданным размером в корзину | Пройден |
| [TC-024](test-cases/TC-024-adding-an-item-with-no-size-selected-to-cart.md) | Добавление товара с не заданным размером в корзину | Пройден |
| [TC-025](test-cases/TC-025-adding-an-item-to-the-cart-with-size-selected-from-size-selection-window.md) | Добавление товара с выбранным размером из окна выбора размера | Пройден |
| [TC-026](test-cases/TC-026-adding-an-item-to-the-cart-with-size-out-of-stock.md) | Добавление товара с отсутствующим в наличии размером | Пройден |


## API Testing

Инструмент: Postman  
База: `https://front-api.intertop.kz`

### Эндпоинты

| Эндпоинт | Метод | Описание |
|----------|-------|----------|
| /catalogApi/getProduct | GET | Получение данных товара по slug |

### API тест-кейсы
| ID | Название | Статус |
|---|---|---|
| [TC-008](test-cases/TC-008-get-catalog-api-get-product.md) | GET /catalogApi/getProduct — валидный slug | Пройден |
| [TC-009](test-cases/TC-009-get-catalog-api-get-product-invalid-slug.md) | GET /catalogApi/getProduct — невалидный slug | Пройден |
| [TC-010](test-cases/TC-010-get-catalog-api-get-product-missing-body.md) | GET /catalogApi/getProduct — отсутствующий body | Провален |

---

## Баг-репорты

| ID | Название | Серьёзность | Статус |
|---|---|---|---|
| [BUG-001](bug-reports/BUG-001-success-notification-auto-dismisses-without-user-interaction.md) | Уведомление об успехе закрывается автоматически без действий пользователя | Низкая | К выполнению |
| [BUG-002](bug-reports/BUG-002-Sign-in-linking-a-phone-number-is-required-for-an-email-based-auth.md) | Вход — для авторизации через email требуется привязка номера телефона | Средняя | К выполнению |
| [BUG-003](bug-reports/BUG-003-Password-reset-setting-current-password-as-the-new-one-is-allowed.md) | Сброс пароля — установка текущего пароля в качестве нового разрешена | Средняя | К выполнению |
| [BUG-004](bug-reports/BUG-004-get-catalog-api-get-product-returns-redundant-data.md) | GET /catalogApi/getProduct возвращает избыточный объем данных при запросе карточки одного товара | Низкая | К выполнению |
| [BUG-005](bug-reports/BUG-005-get-catalog-api-get-product-server-response-returns-500-on-request-with-missing-body.md) | GET /catalogApi/getProduct возвращает статус код 500 Internal Server Error при отсутствующем body запроса | Средняя | К выполнению |
| [BUG-006](bug-reports/BUG-006-search-field-search-window-dismisses-without-an-error-message-on-clicking-the-search-button-with-an-empty-field.md) | Поле поиска - окно с полем закрывается без сообщения об ошибке после нажатия на кнопку поиска при пустом поле | Низкая | К выполнению |
| [BUG-007](bug-reports/BUG-007-search-field-search-window-dismisses-without-an-error-message-on-clicking-search-button-with-string-less-than-3-characters.md) | Поле поиска - окно с полем закрывается без сообщения об ошибке после нажатия на кнопку поиска при длине запроса меньше 3 символов | Средняя | К выполнению |

---

## Окружение

Все тест-кейсы выполнены в следующем окружении:

| Поле | Значение |
|---|---|
| ОС | macOS Tahoe, 26.4 |
| Браузер | Safari, 26.4 (21624.1.16.11.4) |

---

## Примечания

- Строки интерфейса на русском сохранены как есть, поскольку сайт доступен только на русском и казахском языках
- Свежие email-адреса генерируются через [TempMail](https://temp-mail.org) перед каждым запуском тест-кейсов связанных с авторизацией
- TempMail адреса одноразовые и становятся недоступны после закрытия сессии — для воспроизведения тест-кейсов необходимо генерировать новый адрес
