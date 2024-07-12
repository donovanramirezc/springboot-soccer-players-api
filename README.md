# Backend - API de futbolistas

### Comandos cURL para realizar solicitudes GET en Postman:

1. Obtener todos los futbolistas

  • curl -u admin:admin -X GET 'http://localhost:8080/api/futbolistas'

2. Obtener un futbolista por ID

  • curl -u admin:admin -X GET 'http://localhost:8080/api/futbolistas/1'

3. Obtener todos los futbolistas con paginación

  • curl -u admin:admin -X GET 'http://localhost:8080/api/futbolistas/paginacion?page=1&size=7'
