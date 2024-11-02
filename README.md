# Tp3_SegundaParte


### Patrón Decorator
![PizzasUML](https://github.com/user-attachments/assets/5427e213-fc52-4f4e-9e5a-1ddf8407bbec)
La razón por la cual se utilizó este patrón y se realizó el diagrama de esta manera radica en que la tarea que debe cumplir el programa es partir de una pizza base a la cual poder
agregarle ingredientes a gusto (todo por parte de un cliente). Por lo cual, se crea una interfaz "Pizza" y un decorador "PizzaDecorator", el cual irá sobreescribiendo la pizza base, agregandole ingredientes a la pizza y agregando dichos ingredientes a la descripcion de la pizza final y sumando el precio total de la pizza con todos los ingredientes agregados.
