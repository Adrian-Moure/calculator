# calculator

## Creación del jar
- Deberemos tener las últimas versiones de Java y Maven actualizadas
- Tras tener en local nuestro proyecto clonado del repositorio deberemos realizar un maven clean install del proyecto utilizando
el comando correspondiente desde la consola (mvn clean install) o desde nuestro IDEjava 
- Esto nos generará los .jar en la carpeta target
- Podemos lanzar la aplicación desde el mismo directorio utilizando el comando correspondiente (mvn spring-boot:run) o a través de nuestro IDE
- Esto desplegará en localhost:8080/api/v1/calculator desde donde podremos acceder a los endpoints /add y /substract 
- Tendremos que indicar como parámetros de entrada los campos first y second con los valores que queramos utilizar: http://localhost:8080/api/v1/calculator/add?first=23&second=1