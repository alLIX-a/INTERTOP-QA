# TC-009: GET /catalogApi/getProduct — невалидный slug

| Поле | Значение |
|---|---|
| **ID** | TC-009 |
| **Название** | GET /catalogApi/getProduct — невалидный slug |

## Предусловия

1. Товар со slug `gumshoes-vanz-7502616` не существует
2. Postman открыт

## Тестовые данные

| Поле | Значение |
|---|---|
| Method | GET |
| Endpoint | `https://front-api.intertop.kz/catalogApi/getProduct` |
| Param: body | `[{"id":"gumshoes-vanz-7502616"}]` |
| Header: X-Locale | ru-kz |
| Header: X-Site | kz |

## Шаги воспроизведения

1. Открыть Postman
2. Создать GET-запрос по указанному endpoint
3. Задать указанные в разделе Тестовые данные параметры
4. Нажать Send

## Ожидаемый результат

Сервер возвращает ответ с полями `status: 404` и `message: "Not Found"` в теле ответа. Статус ответа — 404 Not Found

## Фактический результат

Сервер вернул ответ с полями `status: 404` и `message: "Not Found"` в теле ответа. Статус ответа — 404 Not Found

## Статус

**Пройден**
