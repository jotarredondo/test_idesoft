# test_idesoft

Proyecto ApiRest que consulta una base de datos para entregar la información requerida en formato Json.

Se conecta a una base de datos alojada en el motor MySql , se adjunta script completo con las inserciones de registros.

El proyecto está desarrollado en en lenguaje Java EE 1.8 y framework SpringBoot 2.4.

Para realizar una conexión exitosa se debe :

1. Ejecutar el script de BBDD en un motor MySql

2. Modificar el archivo database.properties contenido en el proyecto java  src/main/resources/database.properties,
cambiando el atributo usuario= y clave= respectivamente por los datos que se requieran desde el entorno de trabajo.

3. Ejecutar el proyecto , el proyecto tiene un servidor Tomcat embebido y por defecto ejecuta la aplicacion en el puerto 8080.

4. La dirección base de la api es http://localhost:8080/api/v1/local

5. El proyecto puede editar, crear, borrar, consultar toda la base y buscar por id o por nombre de comuna.
