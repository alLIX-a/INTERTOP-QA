# TC-010: GET /catalogApi/getProduct — отсутствующий body

| Поле | Значение |
|---|---|
| **ID** | TC-010 |
| **Название** | GET /catalogApi/getProduct — отсутствующий body |

## Предусловия

1. Postman открыт

## Тестовые данные

| Поле | Значение |
|---|---|
| Method | GET |
| Endpoint | `https://front-api.intertop.kz/catalogApi/getProduct` |
| Header: X-Locale | ru-kz |
| Header: X-Site | kz |
| Params | body не передаётся |

## Шаги воспроизведения

1. Создать GET-запрос по указанному endpoint
2. Задать параметры указанные в разделе Тестовые данные
3. Нажать Send

## Ожидаемый результат

Сервер возвращает ответ со статус кодом 400 Bad Request. Ответ содержит поля `status: 400` и `message: "Bad Request"`

## Фактический результат

Сервер вернул ответ со статус кодом 500 Internal Server Error и полями `status: 500` и `message: "Something went wrong, try again later"`

## Статус

**Провален**
