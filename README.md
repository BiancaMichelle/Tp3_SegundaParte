<p style="text-align: center; color: lightgray; font-size: 12px;">
    <strong>Programación Orientada a Objetos II</strong>
</p>

___

<h1 style="text-align: center;color:blue"><u>Trabajo Práctico 3 - Tercera Parte</u></h1>
<h3 style="text-align: center;">Patrones de Diseño</h3>

###### Alumnos:
> - Gigena, Maximo
> - Eitner, Bianca Michelle
> - Fernandez, Lautaro
> - Lovera, Hernan


### Patrón Strategy - Métodos de Envío en una Tienda en Línea
![MetodosEnvíoUML](https://github.com/user-attachments/assets/63e51bf6-6c15-4b54-8e5e-759c5985d72b)
El patrón Strategy es una solución ideal para este problema, ya que proporciona flexibilidad y facilidad de mantenimiento. Facilita la adición o modificación de métodos de envío y permite cambiar la estrategia de manera dinámica, adaptándose a las necesidades del cliente en la tienda en línea.


### Patrón Decorator - Personalización de Pizzas
![PizzasUML](https://github.com/user-attachments/assets/5427e213-fc52-4f4e-9e5a-1ddf8407bbec)
La razón por la cual se utilizó este patrón y se realizó el diagrama de esta manera radica en que la tarea que debe cumplir el programa es partir de una pizza base a la cual poder
agregarle ingredientes a gusto (todo por parte de un cliente). Por lo cual, se crea una interfaz "Pizza" y un decorador "PizzaDecorator", el cual irá sobreescribiendo la pizza base, agregandole ingredientes a la pizza y agregando dichos ingredientes a la descripcion de la pizza final y sumando el precio total de la pizza con todos los ingredientes agregados.
