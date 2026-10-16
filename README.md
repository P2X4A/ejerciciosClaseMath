# Ejercicios de la Clase Math

Cuatro ejercicios para practicar la clase Math de Java.

## Detalle

| | |
|---|---|
| Tipo | Ejercicios |
| Archivos Java | 5 |
| Version de Java | 23 |
| Patron | Cada clase tiene su propio metodo main, se ejecutan por separado |

## Funcionalidades

- Calculo con Math
- Raices cuadradas
- Promedios
- Valor maximo
- Modulo Java (JPMS)

## Estructura del proyecto

```
ejerciciosClaseMath/
|-- pom.xml       configuracion de Maven, importable desde cualquier IDE
|-- src/          codigo fuente
`-- README.md
```

## Como ejecutarlo

### Con Maven

```bash
mvn clean compile
mvn exec:java
```

### Con javac directamente

```bash
# Linux / macOS
javac -d bin $(find src -name "*.java")

# Windows (PowerShell)
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName
```

```bash
java -cp bin claseMath.Ejercicio1
```

### Desde un IDE

Cualquier IDE con soporte de Java (Eclipse, IntelliJ IDEA, VS Code o NetBeans)
puede importar el proyecto directamente como **proyecto Maven**. Basta con abrir
o importar la carpeta: el IDE detecta el `pom.xml`, resuelve las dependencias y
compila sin configuracion adicional.

## Autor

Desarrollado por [Sergio Parra](https://github.com/P2X4A) como parte de su
formacion en Java.

## Licencia

Ver el archivo [LICENSE](LICENSE).