plugins {
    java
    id("io.spring.dependency-management") version "1.0.4.RELEASE"
    id("org.springframework.boot") version "1.5.10.RELEASE"
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    jcenter()
}

dependencies {
    compile("org.springframework.boot:spring-boot-starter-web")
}