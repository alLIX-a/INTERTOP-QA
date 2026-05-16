## TC-008: GET /catalogApi/getProduct — валидный slug

### Предусловия
1. Товар со slug `gumshoes-vans-7502616` существует
2. Postman открыт

### Тестовые данные
- **Method:** GET
- **Endpoint:** `https://front-api.intertop.kz/catalogApi/getProduct`
- **Params:** `body: [{"id":"gumshoes-vans-7502616"}]`
- **Headers:** X-Locale: ru-kz, X-Site: kz

### Шаги воспроизведения
1. Создать GET-запрос по указанному endpoint
2. Прописать Headers и Params указанные в разделе Тестовые данные
3. Нажать Send

### Ожидаемый результат
Статус ответа 200 OK, ответ содержит поля `id`, `sku`, `exists: true` и `options`

### Фактический результат
200 OK, все ожидаемые поля присутствуют

### Статус
Пройдено
