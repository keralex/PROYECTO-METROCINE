# PROYECTO-METROCINE
La empresa MetroCine es una cadena de cines con sucursales en todo el país. Ellos los han
contratado para realizar su plataforma de ventas, luego de discutir con ellos sus necesidades,
realizaron el siguiente levantamiento de requisitos:
Las diferentes sucursales tienen un código de 4 números, una ubicación y distintas salas de
cine, ya sean 2D, 3D o 4DX. Cada sala tiene un número que la identifica y en ellas se proyectan
películas, las cuales tienen un nombre, un género y un idioma, el horario no influye puesto que todas
son a las 7:00 pm.
Se tiene un registro de los tickets que se venden en la cadena, los cuales tienen un
identificador único de 7 números, la sucursal con su sala, un precio de venta que depende del tipo de
sala, la película que se verá, la fecha en la cual se proyectará la función y la información de los
clientes.
El sistema será manejado únicamente por los empleados, ellos podrán:
● Agregar y modificar sucursales, salas, y películas
● Seleccionar la película que se muestra en cada sala
● Modificar los precios de los tickets por tipo de sala
● Registrar nuevos clientes, indicando su nombre, teléfono y número de cédula
Cada cliente cuenta con un carrito de compras donde los empleados podrán agregar las
entradas a las películas que el cliente desee comprar. La orden puede o no ser completada, por ello
se debe mantener un registro de las entradas en cada carrito, ya que si el cliente llega a visitar el cine
nuevamente puede continuar con su compra.
Al modificar la disponibilidad de una película, este cambio debe verse reflejado en los carritos
de los clientes, ya que si una película deja de ser ofrecida, deberá eliminarse de los carritos.
Igualmente, si se modifica el precio de las entradas de un tipo de sala, este cambio deberá reflejarse
en el costo de las entradas en los carritos, más no en las entradas ya pagadas.
Al ver el listado de películas, se deberán poder filtrar por género, por idioma y ordenar por
nombre (de menor a mayor y viceversa). Igualmente se debe poder buscar una película por nombre y
añadir las entradas deseadas al carrito. De igual forma se debe poder filtrar las películas por sucursal
y por tipo de sala.
Al agregar entradas a los carritos de los clientes, se debe poder deshacer dicha operación si
fuera necesario, por lo tanto se debe mantener un registro de las entradas que se agregan a los
carritos de los clientes para poder revertir dicha operación.
Se debe poder ver el carrito de cada cliente buscandolo por cédula al igual que todas sus
compras anteriores.
De igual forma se debe indicar cuáles salas de cine son las más frecuentadas al igual que los
ingresos de la empresa.

Notas​:
● No hay límite en la cantidad de entradas que se pueden vender para una cierta función.
● Se debe incluir información inicial para poder corregir el proyecto, esto supone agregar un
mínimo de 3 sucursales, 15 salas de cine (5 de cada tipo) las cuales distribuirán entre las 3
sucursales, y 5 películas que se asignarán a las 15 salas de cine.
Criterios de evaluación
Los equipos deberán estar conformados por dos integrantes como máximo.
El proyecto comprimido, junto con el diagrama de clases del proyecto deben ser enviados a través de
Classroom. Fecha de Entrega: 3 de Abril hasta las 11:59 p.m.
Se debe utilizar al menos una estructura de datos de cada uno de los siguientes grupos:
● Listas (Simples, Dobles, Circulares)
● Pilas y Colas
● Árboles
No es necesario realizar interfaz gráfica para el proyecto, sin embargo su realización será
considerada como bono.
Se deben seguir los principios de programación orientada a objetos:
● Abstracción
● Herencia
● Polimorfismo
● Encapsulación
Originalidad: ​Si se detectan proyectos con enfoques muy similares, serán rechazados y obtendrán
calificación cero (0).
Funcionalidad​: Capacidad del producto o software para proporcionar las funcionalidades que
satisfacen las necesidades explicitas e implícitas cuando se usa bajo ciertas condiciones.
Fiabilidad​: Capacidad del producto software para mantener un nivel especificado de prestaciones
cuando se usa bajo ciertas condiciones.
Madurez​: el programa no presenta fallas originadas por errores de programación, análisis o
diseño.
Tolerancia a fallos​: el programa maneja adecuadamente el manejo inadecuado del usuario;
es decir, mantiene su prestación aun cuando el usuario introduzca datos erróneos o manipule
inadecuadamente las interfaces de usuario.
Usabilidad​: Capacidad del producto software para ser entendido, aprendido, usado y ser atractivo
para el usuario, cuando se usa bajo condiciones especificadas.
Modificabilidad​: Capacidad del producto software para ser modificado. Las modificaciones podrían
incluir correcciones, mejoras o adaptación del software a cambios en el entorno, y requisitos y
especificaciones funcionales. La modificabilidad está directamente relacionada con la modularidad.
Modularidad​: se utilizan clases como mecanismo de estructuración del sistema y herencia
como mecanismo de reutilización.
Documentación​: Utiliza la documentación interna para facilitar la comprensión del programa.
