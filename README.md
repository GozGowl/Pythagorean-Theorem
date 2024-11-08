# Pythagorean-Theorem
Function to calculate the hypotenuse or the missing side of a triangle with error handling implementation.

Teorema de Pitagoras: Crear una funcion/metodo para calcular la hipotenusa o el lado faltante de un triangulo, pasando al metodo como parametro un array de los valores que el usuario inserte, el calculo se debe realizar solo si 2 valores de los 3 son verdaderos (el usuario los ha ingresado), si no, el output sera un mensaje de error; un input con el valor '0' significa que no se tiene ese lado del triangulo, en el caso de que el input sea '0' en todos o en dos de los valores, el mensaje sera "input invalido, se necesitan al menos dos valores", y en el caso de que todos los inputs sean proporcionados, el mensaje sera "se tienen todos los valores". 

Input: {a, b, c} = {9, 0, 15}
Output: The missing side is 12.0

Input2: {a, b, c} = {0, 12, 0}
Output2: Exception in thread "main" java.lang.ArithmeticException: Invalid input, at least two values are required

Input3: {a, b, c} = {9, 12, 15}
Output3: Exception in thread "main" java.lang.ArithmeticException: You have all values, there is nothing to calculate

Para realizar la logica de devolver 'true' y que se calcule el valor faltante del triangulo he utilizado puertas logicas, primero haciendo el circuito electronico y luego pasandolo a codigo, la table de la verdad es opcional 
