# VariablesYOperadores

1. Respuestas Teóricas

¿Para qué se utilizan los operadores lógicos en programación?
Los operadores lógicos se utilizan para combinar o comparar condiciones. Por ejemplo, con AND puedo verificar que dos condiciones sean verdaderas al mismo tiempo, y con OR  verifico si al menos una condición es verdadera. Esto me permite tomar decisiones más complejas en mis programas.

¿Por qué es importante declarar correctamente el tipo de dato de una variable?
Es importante porque cada tipo de dato ocupa un espacio diferente en memoria y acepta diferentes valores. Si declaro mal el tipo, el programa puede dar errores o resultados incorrectos. Por ejemplo, si uso int para guardar un número con decimales, los decimales se pierden.


2. Justificación Técnica

Clasificación de Edad:
Utilicé if-else porque la clasificación maneja rangos de números, por ejemplo de 12 a 17 años. El switch no puede evaluar rangos, solo valores exactos, por eso if-else fue la opción más adecuada.

Día de la Semana:
Utilicé switch porque cada número del 1 al 7 corresponde a un valor exacto. El switch es ideal para este caso ya que compara un valor específico contra múltiples opciones fijas.

Verificación de Acceso:
Utilicé if-else porque necesitaba verificar múltiples condiciones en orden: primero si el usuario existe, luego si la contraseña es correcta. El switch no es adecuado para comparar cadenas de texto con condiciones dependientes entre sí.


Programas incluidos
- Programa1.java - Declaración y uso de variables
- Programa2.java - Operaciones matemáticas
- Programa3.java - Operaciones lógicas
- Programa4.java - Clasificación de edad
- Programa5.java - Día de la semana
- Programa6.java - Verificación de acceso
