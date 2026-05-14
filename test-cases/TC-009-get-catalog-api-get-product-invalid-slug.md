## TC-009: GET /catalogApi/getProduct — невалидный slug

### Предусловия
1. Товар со slug `gumshoes-vanz-7502616` не существует
2. X-Locale: ru-kz задан в заголовке запроса
3. X-Site: kz задан в заголовке запроса

### Тестовые данные
- **Endpoint:** `https://front-api.intertop.kz/catalogApi/getProduct`
- **Method:** GET
- **Params:** `body: [{"id":"gumshoes-vanz-7502616"}]`

### Шаги воспроизведения
1. Открыть Postman
2. Создать GET-запрос по указанному endpoint
3. Задать указанные в разделе Тестовые данные параметры
4. Нажать Send

### Ожидаемый результат
Сервер возвращает ответ с полями `status: 404` и `message: "Not Found"` в теле ответа. Статус ответа — 404 Not Found

### Фактический результат
Сервер вернул ответ с полями `status: 404` и `message: "Not Found"` в теле ответа. Статус ответа — 404 Not Found

### Статус
Пройдено
