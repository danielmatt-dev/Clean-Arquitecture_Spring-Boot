# Instalación de Kotlin y Spring Boot en VSCode, IntelliJ y NetBeans

## Requisitos Previos
Antes de comenzar, asegúrate de tener instalada una de las siguientes versiones de Java:
- Java 17
- Java 21
- Java 22

Puedes descargar e instalar Java desde [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) o [OpenJDK](https://openjdk.java.net/install/).

## 1. Instalación de Kotlin

### VSCode
1. **Instalar VSCode**: Descarga e instala Visual Studio Code desde [VSCode Official](https://code.visualstudio.com/).
2. **Instalar Extensiones Necesarias**:
   - Abre VSCode.
   - Ve a la pestaña de Extensiones (o usa el atajo `Ctrl+Shift+X`).
   - Busca e instala las siguientes extensiones:
     - [Kotlin Language](https://marketplace.visualstudio.com/items?itemName=fwcd.kotlin)
     - [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-spring-boot)
     - [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
3. **Configurar el JDK**:
   - Ve a `File > Preferences > Settings`.
   - Busca `java.home`.
   - Configura la ruta del JDK instalado en tu sistema.

### IntelliJ IDEA
1. **Instalar IntelliJ IDEA**: Descarga e instala IntelliJ IDEA desde [IntelliJ IDEA Official](https://www.jetbrains.com/idea/download/).
2. **Instalar Plugins Necesarios**:
   - Abre IntelliJ IDEA.
   - Ve a `File > Settings > Plugins` (o `Preferences` en macOS).
   - Busca e instala los siguientes plugins:
     - Kotlin
     - Spring Boot (ya viene preinstalado en la versión Ultimate)
3. **Configurar el JDK**:
   - Ve a `File > Project Structure`.
   - Selecciona `Project` en la lista de la izquierda.
   - Configura la versión del JDK a la versión que hayas instalado (Java 17, 21 o 22).

### NetBeans
1. **Instalar NetBeans**: Descarga e instala Apache NetBeans desde [NetBeans Official](https://netbeans.apache.org/download/).
2. **Instalar el Plugin de Kotlin**:
   - Abre NetBeans.
   - Ve a `Tools > Plugins`.
   - Ve a la pestaña de `Available Plugins`.
   - Busca "Kotlin" y selecciona el plugin de Kotlin.
   - Haz clic en "Install" y sigue las instrucciones para completar la instalación.
3. **Instalar el Plugin de Spring Boot**:
   - Sigue el mismo proceso para instalar el plugin `NB SpringBoot` si no viene preinstalado.
4. **Configurar el JDK**:
   - Ve a `Tools > Java Platforms`.
   - Agrega la versión del JDK instalada si no está ya listada y configúrala como la predeterminada.

## 2. Configuración de Spring Boot

### Dependencias Necesarias
Para ejecutar un proyecto de Spring Boot, necesitarás las siguientes dependencias en tu `build.gradle` (si usas Gradle) o `pom.xml` (si usas Maven):

**Gradle:**
```groovy
plugins {
    id 'org.springframework.boot' version '2.6.4'
    id 'io.spring.dependency-management' version '1.0.11.RELEASE'
    id 'kotlin' version '1.6.10'
    id 'kotlin-spring' version '1.6.10'
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.jetbrains.kotlin:kotlin-reflect'
    implementation 'org.jetbrains.kotlin:kotlin-stdlib-jdk8'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}
```

**Maven:**
```xml
<project>
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.example</groupId>
    <artifactId>demo</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <packaging>jar</packaging>
    <name>demo</name>
    <description>Demo project for Spring Boot</description>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.6.4</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <properties>
        <java.version>17</java.version>
        <kotlin.version>1.6.10</kotlin.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-reflect</artifactId>
        </dependency>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib-jdk8</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
            <plugin>
                <groupId>org.jetbrains.kotlin</groupId>
                <artifactId>kotlin-maven-plugin</artifactId>
                <version>${kotlin.version}</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>test-compile</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>
```

## 3. Ejecución de un Proyecto Spring Boot

### VSCode
1. **Abrir el Proyecto**:
   - Abre VSCode y selecciona `File > Open Folder`.
   - Navega a la carpeta del proyecto y ábrela.
2. **Configurar el Debugger**:
   - Ve a la pestaña de Debug (`Ctrl+Shift+D`).
   - Haz clic en "create a launch.json file" y selecciona "Java".
3. **Ejecutar la Aplicación**:
   - Usa el terminal integrado (`Ctrl+~`).
   - Ejecuta `./gradlew bootRun` (para Gradle) o `mvn spring-boot:run` (para Maven).

### IntelliJ IDEA
1. **Abrir el Proyecto**:
   - Abre IntelliJ IDEA y selecciona `File > Open`.
   - Navega a la carpeta del proyecto y ábrela.
2. **Ejecutar la Aplicación**:
   - Haz clic derecho en el archivo principal de la aplicación (`Application.kt`) y selecciona `Run 'Application'`.

### NetBeans
1. **Abrir el Proyecto**:
   - Abre NetBeans y selecciona `File > Open Project`.
   - Navega a la carpeta del proyecto y ábrela.
2. **Ejecutar la Aplicación**:
   - Haz clic derecho en el proyecto y selecciona `Run`.
