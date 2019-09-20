# Laboratorio #5

## MVC Primefaces Introduction

### Preguntas parte 3
	
¿Diferencias encontradas entre usar un **GET** o un **POST**, qué otros métodos similares existen y para qué es cada uno?


### Metodo Get
![MetodoGet](https://github.com/eocampo2728/CVDS-Lab05/blob/master/Imagenes/Get.PNG?raw=true)

Como observamos en la imagen el método **get** en el formulario realizado en el html permite que el nombre de los parámetros y su valor se muestren en la url lo que hace que este método sea inseguro ya que otra persona puede observar datos del cliente.

![MetodoPost](https://github.com/eocampo2728/CVDS-Lab05/blob/master/Imagenes/Post.PNG?raw=true)

Mientras que con este método **post** vemos en la foto anterior que en la url no se muestran el nombre de los parámetros ni sus valores, este método es mas seguro que el get ya que no muestra información del cliente en la url y pasa estos datos de forma que no sea visible para los demás.

## Otros Metodos de petición HTTP:

### HEAD:
- El método **HEAD** pide una respuesta idéntica a la de una petición GET, pero sin el cuerpo de la respuesta.

### PUT:
- El modo **PUT** reemplaza todas las representaciones actuales del recurso de destino con la carga útil de la petición.

### DELETE:
- El método **DELETE** borra un recurso en específico.

### CONNECT:
- El método **CONNECT** establece un túnel hacia el servidor identificado por el recurso.

### OPTIONS:
- El método **OPTIONS** es utilizado para describir las opciones de comunicación para el recurso de destino.

### TRACE:
- El método **TRACE** realiza una prueba de bucle de retorno de mensaje a lo largo de la ruta al recurso de destino.

### PATCH:
- El método **PATCH** es utilizado para aplicar modificaciones parciales a un recurso.

---

#### 21. ¿Qué se está viendo?

En la clase **Service** encontramos 3 metodos:

El método **getTodo** nos permite obtener un todo, es decir gracias a este método ingresamos a la página que contiene la información, pero esta información está en JSON (JavaScrip Object Notation) y luego por medio de Google Gson nos permite pasar de una representación JSON a un objeto java.

El método **todoToHTMLRow** y **todosToHTMLTable** lo que nos permite es coger los objetos java que transformamos en el método anterior y convertirlos en HTML con un estilo de tabla para que el navegador nos pueda mostrar esta información.


### Autores:

- Eduardo Ocampo
- Juan David Navarro