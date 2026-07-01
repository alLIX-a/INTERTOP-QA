# intertop-qa
Документация по ручному тестированию [INTERTOP.KZ](https://intertop.kz) — казахстанского интернет-магазина.

Репозиторий содержит написанные вручную тест-кейсы и баг-репорты, покрывающие основные пользовательские сценарии на сайте.

---

## Сводка покрытия

| Область | Тест-кейсы | Пройдено | Провалено | Заблокировано | Найдено багов | Не выполнено |
|---|---|---|---|---|---|---|
| Авторизация | 7 | 5 | 1 | 1 | 3 | 0 |
| Поиск товаров | 12 | 10 | 2 | 0 | 2 | 0 |
| История поиска | 6 | 5 | 1 | 0 | 2 | 0 |
| Выпадающее меню предложений | 5 | 5 | 0 | 0 | 1 | 0 |
| API: Каталог товаров | 3 | 2 | 1 | 0 | 2 | 0 |
| Добавление товара в корзину | 8 | 7 | 1 | 0 | 1 | 0 |
| Корзина | 5 | 5 | 0 | 0 | 0 | 0 |
| API: Корзина | 1 | 0 | 0 | 1 | 0 | 0 |
| Фильтрация товаров | 20 | 19 | 1 | 0 | 4 | 0 |
| Оформление заказов | 7 | 2 | 0 | 0 | 1 | 5 |
| **Итого** | **74** | **60** | **7** | **2** | **16** | **4** |

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
| [TC-027](test-cases/TC-027-adding-an-item-to-the-cart-with-size-out-of-stock-from-size-selection-window.md) | Добавление товара отсутствующим в наличии размером, выбранным размером из окна выбора размера | Пройден |
| [TC-028](test-cases/TC-028-adding-an-item-to-the-cart-with-size-changed-before-adding.md) | Добавление товара в корзину с измененным размером перед добавлением | Пройден |
| [TC-029](test-cases/TC-029-adding-an-item-to-the-cart-with-quantity-exceeding-in-stock-by-1.md) | Добавление в корзину товара в количестве на 1 больше количества в наличии | Провален |
| [TC-030](test-cases/TC-030-adding-an-item-of-2-sizes-to-the-cart.md) | Добавление товара 2 размеров одновременно в корзину | Пройден |
| [TC-031](test-cases/TC-031-checking-total-for-item-added-in-2-or-more-sizes-in-cart.md) | Проверка корректности итоговой стоимости товара в количестве 2+ штук в корзине | Пройден |
| [TC-032](test-cases/TC-032-checking-total-for-2-different-items-in-cart.md) | Проверка корректности итоговой стоимости 2 разных товаров в корзине  | Пройден |
| [TC-033](test-cases/TC-033-removing-item-from-cart.md) | Удаление товара из корзины | Пройден |
| [TC-034](test-cases/TC-034-cancelling-removing-item-from-cart.md) | Отмена удаления товара из корзины | Пройден |
| [TC-035](test-cases/TC-035-checking-total-after-removing-item-from-cart.md) | Проверка корректности итоговой стоимости товаров после удаления товара с корзины | Пройден |
| [TC-037](test-cases/TC-037-saving-searched-item-to-search-history.md) | Сохранение товара в историю поиска | Пройден |
| [TC-038](test-cases/TC-038-searching-for-item-via-saved-request-in-search-history.md) | Поиск товара по сохраненному запросу в истории поиска | Пройден |
| [TC-039](test-cases/TC-039-saving-to-search-history-an-item-existing-in-history.md) | Сохранение в историю поиска товара существующего в истории | Пройден |
| [TC-040](test-cases/TC-040-saving-to-search-history-an-item-in-existing-history-in-upper-case.md) | Сохранение в историю поиска товара существующего в истории в верхнем регистре | Провален |
| [TC-041](test-cases/TC-041-deleting-item-from-search-history.md) | Удаление товара из истории поиска | Пройден |
| [TC-042](test-cases/TC-042-cleaning-search-history.md) | Очистка истории поиска | Пройден |
| [TC-043](test-cases/TC-043-showing-relevant-suggestions-in-dropdown-menu-on-search.md) | Отображение релевантных предложений в выпадающем меню при вводе поискового запроса | Пройден |
| [TC-044](test-cases/TC-044-showing-relevant-suggestions-in-dropdown-menu-on-search-in-uppercase.md) | Отображение релевантных предложений в выпадающем меню при вводе поискового запроса в верхнем регистре | Пройден |
| [TC-045](test-cases/TC-045-opening-search-results-page-on-clicking-suggestion-from-dropdown-menu.md) | Переход на страницу результатов поиска при выборе предложения из выпадающего меню | Пройден |
| [TC-046](test-cases/TC-046-showing-relevant-suggestions-in-dropdown-menu-on-partial-search.md) | Отображение релевантных предложений в выпадающем меню при частичном вводе запроса | Пройден |
| [TC-047](test-cases/TC-047-showing-relevant-suggestions-in-dropdown-menu-on-search-with-typo.md) | Отображение релевантных предложений в выпадающем меню при вводе поискового запроса с опечаткой | Пройден |
| [TC-048](test-cases/TC-048-filtering-items-by-one-brand.md) | Фильтрация товаров по одному бренду | Пройден |
| [TC-049](test-cases/TC-049-filtering-items-by-2-brands.md) | Фильтрация товаров по 2 брендам | Пройден |
| [TC-050](test-cases/TC-050-resetting-filter-by-brand.md) | Сброс фильтра товаров по бренду | Пройден |
| [TC-051](test-cases/TC-051-resetting-all-filters-applied.md) | Сброс всех примененных фильтров | Пройден |
| [TC-052](test-cases/TC-052-filtering-items-by-one-international-size.md) | Фильтрация товаров по одному международному размеру | Пройден |
| [TC-053](test-cases/TC-053-filtering-items-by-one-eu-size.md) | Фильтрация товаров по одному европейскому размеру | Пройден |
| [TC-054](test-cases/TC-054-filtering-items-by-2-international-sizes.md) | Фильтрация товаров по 2 международным размерам | Пройден |
| [TC-055](test-cases/TC-055-filtering-items-by-2-eu-sizes.md) | Фильтрация товаров по 2 европейским размерам | Пройден |
| [TC-056](test-cases/TC-056-filtering-items-by-international-and-eu-sizes.md) | Фильтрация товаров по международному и европейскому стандартам | Пройден |
| [TC-057](test-cases/TC-057-filtering-items-by-min-price+1.md) | Фильтрация товаров по цене на единицу выше минимальной | Пройден |
| [TC-058](test-cases/TC-058-filtering-items-by-min-price-1.md) | Фильтрация товаров по цене на единицу ниже минимальной | Пройден |
| [TC-059](test-cases/TC-059-filtering-items-by-max-price+1.md) | Фильтрация товаров по цене на единицу выше максимальной | Пройден |
| [TC-060](test-cases/TC-060-filtering-items-by-max-price-1.md) | Фильтрация товаров по цене на единицу ниже максимальной | Пройден |
| [TC-061](test-cases/TC-061-filtering-items-by-price-in-range-of-min-to-min-price.md) | Фильтрация товаров по ценовому диапазону равному минимальной цене | Провален |
| [TC-062](test-cases/TC-062-filtering-items-by-min-price-higher-than-max-by-1.md) | Фильтрация товаров при минимальной цене выше максимальной  | Пройден |
| [TC-063](test-cases/TC-063-filtering-items-with-letter-as-min-price.md) | Фильтрация товаров при буквенном значении как минимальной цены  | Пройден |
| [TC-064](test-cases/TC-064-filtering-items-with-letter-as-max-price.md) | Фильтрация товаров при буквенном значении как максимальной цены  | Пройден |
| [TC-065](test-cases/TC-065-filtering-items-by-preconfigured-price-range.md) | Фильтрация товаров по предустановленному ценовому диапазону | Пройден |
| [TC-066](test-cases/TC-066-filtering-items-by-one-color.md) | Фильтрация товаров по одному цвету | Пройден |
| [TC-067](test-cases/TC-067-filtering-items-by-2-colors.md) | Фильтрация товаров по двум цветам | Пройден |
| [TC-068](test-cases/TC-068-checkout-with-store-pickup-and-pay-upon-arrival.md) | Оформление заказа с самовывозом из магазина + оплата при получении  | Не выполнен |
| [TC-069](test-cases/TC-069-checkout-with-delivering-to-store-and-paying-with-card.md) | Оформление заказа с доставкой в магазин + оплата картой  | Не выполнен |
| [TC-070](test-cases/TC-070-checkout-with-express-delivery-and-paying-in-installments.md) | Оформление заказа с экспресс доставкой + оплата частями  | Не выполнен |
| [TC-071](test-cases/TC-070-checkout-with-express-delivery-and-paying-in-installments.md) | Оформление заказа с адресной доставкой + оплата при получении  | Не выполнен |
| [TC-072](test-cases/TC-072-checkout-with-delivery-to-kazpost-and-paying-with-card.md) | Оформление заказа с доставкой в отделение КазПочты + оплата картой  | Не выполнен |
| [TC-073](test-cases/TC-073-checkout-with-delivery-to-kazpost-and-paying-upon-arrival.md) | Оформление заказа с доставкой в отделение КазПочты + оплата при получении  | Пройден |
| [TC-074](test-cases/TC-074-checkout-with-express-delivery-and-paying-upon-arrival.md) |  Оформление заказа с экспресс доставкой + оплата при получении | Пройден |

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
| [TC-036](test-cases/TC-036-cart-api-remove-item-from-cart-removing-item-from-cart.md) | cartApi/removeItemFromCart - удаление товара из корзины | Заблокирован |

---

## Баг-репорты

| ID | Название | Серьёзность | Приоритет | Статус |
|---|---|---|---|---|
| [BUG-001](bug-reports/BUG-001-success-notification-auto-dismisses-without-user-interaction.md) | Уведомление об успехе закрывается автоматически без действий пользователя | Низкая | Низкий | К выполнению |
| [BUG-002](bug-reports/BUG-002-Sign-in-linking-a-phone-number-is-required-for-an-email-based-auth.md) | Вход — для авторизации через email требуется привязка номера телефона | Высокая | Высокий | К выполнению |
| [BUG-003](bug-reports/BUG-003-Password-reset-setting-current-password-as-the-new-one-is-allowed.md) | Сброс пароля — установка текущего пароля в качестве нового разрешена | Низкая | Средний | К выполнению |
| [BUG-004](bug-reports/BUG-004-get-catalog-api-get-product-returns-redundant-data.md) | GET /catalogApi/getProduct возвращает избыточный объем данных при запросе карточки одного товара | Низкая | Низкий | К выполнению |
| [BUG-005](bug-reports/BUG-005-get-catalog-api-get-product-server-response-returns-500-on-request-with-missing-body.md) | GET /catalogApi/getProduct возвращает статус код 500 Internal Server Error при отсутствующем body запроса | Средняя | Низкий | К выполнению |
| [BUG-006](bug-reports/BUG-006-search-field-search-window-dismisses-without-an-error-message-on-clicking-the-search-button-with-an-empty-field.md) | Поле поиска - окно с полем закрывается без сообщения об ошибке после нажатия на кнопку поиска при пустом поле | Низкая | Низкий | К выполнению |
| [BUG-007](bug-reports/BUG-007-search-field-search-window-dismisses-without-an-error-message-on-clicking-search-button-with-string-less-than-3-characters.md) | Поле поиска - окно с полем закрывается без сообщения об ошибке после нажатия на кнопку поиска при длине запроса меньше 3 символов | Низкая | Средний | К выполнению |
| [BUG-008](bug-reports/BUG-008-item-page-the-user-can-the-item-to-the-cart-in-quantity-higher-than-available.md) | Страница товара - пользователь может добавить товар в корзину в большем количестве чем доступно в наличии | Средняя | Высокий | К выполнению |
| [BUG-009](bug-reports/BUG-009-search-field-clear-input-but-not-working.md) | Поле поиска - кнопка очистки поля поиска не работает | Средняя | Средний | К выполнению |
| [BUG-010](bug-reports/BUG-010-search-history-request-in-upper-case-saved-to-history-with-identical-request-in-lower-case-in-history.md) | История поиска - запрос в верхнем регистре добавляется в историю при наличии в истории идентичного запроса в нижнем регистре | Средняя | Низкий | К выполнению |
| [BUG-011](bug-reports/BUG-011-suggestions-dropdown-search-with-typos-works-inconsistently.md) | Выпадающее меню предложений - поиск с опечатками работает непоследовательно | Средняя | Средний | К выполнению |
| [BUG-012](bug-reports/BUG-012-choosing-item-size-system-returns-items-with-sizes-in-eu-format-when-no-items-in-size-selected-are-present.md) | Выбор размера товара - при отсутствии товара в заданном размере система возвращает товары в другой размерной сетке | Средняя | Средний | К выполнению |
| [BUG-013](bug-reports/BUG-013-filtering-items-by-price-range-filter-not-working-when-range-boundaries-are-same.md) | Фильтр товаров по ценовому диапазону - фильтр не применяется при равных нижней и верхней границах диапазона | Средняя | Средний | К выполнению |
| [BUG-014](bug-reports/BUG-014-filtering-items-by-price-system-not-showing-error-message-when-min-price-is-higher-than-max.md) | Фильтрация товаров по цене - система не отображает сообщение об ошибке при минимальной цене выше максимальной | Низкая | Низкий | К выполнению |
| [BUG-015](bug-reports/BUG-015-filtering-items-by-price-min-and-max-price-fields-implement-different-letters-handling-logic.md) | Фильтрация товаров по цене - поля минимальной и максимальной цен реализуют разную логику обработки буквенного значения | Низкая | Низкий | К выполнению |
| [BUG-016](bug-reports/BUG-016-autocompleting-contact-info-in-latin-from-profile-blocks-checkout.md) | Оформление заказа - автоподставленные из профиля данные на латинице блокируют оформление заказа | Средняя | Высокий | К выполнению |



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
