# Gato-Game
Este repositorio almacena un proyecto Java Desktop en Programacion Paralela Basica, simulando el popular juego TicTacToe o Gato, el cual cuenta con un servidor adminstrador y los usuarios.

## Características

- **View:** Utilizando el patron MVC en desktop con Java Swing para crear una interfaz intuitiva y simple, contando con validaciones de comportamiento.
- **Modelo:** Implementado en Java el modelo de la aplicacion y logica necesaria, contando con el POO aplicado en la practica.
- **Programacion Paralela:** Se utiliza la programacion paralela utilizando el protocolo TCP/IP para la comunicacion a traves de Sockets.
- **Patron de Comunicacion:** Se utiliza el patron Proxy para mantener la integridad de comunicacion entre usuarios conectados a un mismo servidor administrador.

**Diseño de la Aplicaion:**
La aplicacion esta diseñada bajo el patron proxy y la orquestacion de peticiones al servidor local en el proyecto mediante sockets, de esta manera se mantiene la integridad de las peticiones necesarias.

## Funcionalidades

**Usuario:**
- **Login** El usuario requiere hacer login en su ventana mediante el nombre de usuario y su contraseña.
- **Comunicacion con el Servidor:** Los usuarios se comunican con el servidor a traves del proxy para enviar su jugada
- **Actualizar estado de partida:** Las jugadas estaran siendo actualizadas mediante la comunicacion.
- **Estado de Partida:** El programa del usuario esta preparado para recibir informacion de Victoria, Derrota o Empate del jugador.

**Servidor:**
- **Login** El servidor esta preparado con un banco de usuarios en dinamico para validar participaciones.
- **Comunicacion con los Usuarios:** El servidor recibe todas las peticiones de los usuarios mediante el socket, este valida la informacion de llegada y la reenvia al otro jugador conectado al servidor
- **Actualizar estado de partida:** Las jugadas reenviadas al otro jugador son procesadas para el estado de la partida.
  
**Banco de Usuarios:**
  User - Password
 - Jose : 001
 - Maria : 005
 - Juan : 006
 - Pedro : 007
 - Pablo : 008
 - Marcela : 009
 - Roberto : 010
 - Silvia : 011

## Instalación y Ejecucion
- Crear un grupo de proyectos en NetBeans
- Abrir los proyectos:
    - GatoCliente
    - GatoProtocolo
    - GatoServidor
- Cargar las dependencias mediante la ejecucion del pom.xml de cada proyecto (Incluyendo el GatoProtocolo).
- Ejecutar los siguientes archivos el siguiente orden:
    - GatoCliente -> Application.java
    - GatoServidor -> Application.java (2 Veces para 2 Usuarios)

## Creditos
Este repositorio fue realizado como proyecto universitario.
Integrantes:
 - Joseph Leon (Joscalion04)
