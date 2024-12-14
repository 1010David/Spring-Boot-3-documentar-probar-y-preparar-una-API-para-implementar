Spring Boot 3: Documentar, Probar y Preparar una API para su Implementación

Curso de Alura Oracle Next ONE

Este repositorio es la continuación del proyecto original, aunque se creó un nuevo repositorio para esta fase:

Repositorio original: API-SpringBootProtegiendo-buenasPracticas-a

Contenidos Aprendidos en el Curso

1. Implementación de una Nueva Funcionalidad

Creación de una clase Service:

Evaluar cuándo es necesario crear una clase Service en la aplicación.

Utilizar la anotación @Service para aislar el código de reglas de negocio.

Funcionalidad de Reserva de Consultas:

Implementar un algoritmo para gestionar reservas de consultas.

Validar la integridad de los datos recibidos por la API.

Consultas JPQL Complejas:

Crear consultas complejas en una interfaz Repository utilizando @Query.

2. Aislamiento de Validaciones de Negocio

Creación de Clases de Validación:

Aislar códigos de validaciones en clases separadas.

Utilizar la anotación @Component para gestionar estas clases con Spring.

Principios SOLID:

Aplicar los principios SOLID para hacer el código más mantenible y fácil de entender.

3. Pruebas Automatizadas

Pruebas para Repositories:

Escribir tests automatizados para una interfaz Repository.

Utilizar la misma base de datos que la aplicación.

Profiles de Pruebas:

Crear application-test.properties para configurar propiedades específicas para tests.

Utilizar @ActiveProfiles para ejecutar tests con el perfil de pruebas.

Pruebas para Controllers:

Utilizar MockMvc para simular requests a la API.

Testar escenarios de error (código 400) y éxito (código 200).

4. Documentación con SpringDoc y Swagger

Generación Automática de Documentación:

Integrar SpringDoc para generar la documentación de la API.

Configuración de Swagger UI:

Utilizar Swagger UI para visualizar y probar la API REST.

Acceder a la documentación en formatos YAML y HTML.

Seguridad con JWT:

Configurar JWT en la documentación generada por SpringDoc.

5. Preparación para la Implementación

Profiles Específicos:

Crear archivos de propiedades para cada profile (por ejemplo, application-prod.properties).

Variables de Entorno:

Configurar información sensible a través de variables de entorno.

Build y Ejecución con Maven:

Realizar el build del proyecto con Maven.



java -jar target/mi-aplicacion.jar --spring.config.name=application-prodjava -jar target/mi-aplicacion.jar --spring.config.name=application-prodEjecutar la aplicación desde la terminal con el comando:
