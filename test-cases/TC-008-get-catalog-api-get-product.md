## TC-008: GET /catalogApi/getProduct — валидный slug

### Предусловия
1. Товар со slug `gumshoes-vans-7502616` существует на сайте
2. X-Locale: ru-kz задан в заголовке запроса
3. X-Site: kz задан в заголовке запроса

### Тестовые данные
- **Endpoint:** `https://front-api.intertop.kz/catalogApi/getProduct`
- **Method:** GET
- **Headers:** X-Locale: ru-kz, X-Site: kz
- **Params:** `body: [{"id":"gumshoes-vans-7502616"}]`

### Шаги воспроизведения
1. Открыть Postman
2. Создать GET-запрос по указанному endpoint
3. Прописать указанные Headers и Params
4. Нажать Send

### Ожидаемый результат
Статус ответа 200 OK, ответ содержит поля `id`, `sku`, `exists: true` и `options`

### Фактический результат
200 OK, все ожидаемые поля присутствуют

### Статус
 Пройдено
