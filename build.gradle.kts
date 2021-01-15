plugins {
    java
    kotlin("jvm") version "1.4.21"
    id("org.jetbrains.kotlin.plugin.serialization") version "1.4.21"
    id("com.github.johnrengelman.shadow") version "6.0.0"
    id("com.github.gmazzo.buildconfig") version "2.0.2"
}

group = "io.github.starwishsama.hina"
version = Versions.hinaVersion

repositories {
    mavenCentral()
    maven(url = "https://mirrors.huaweicloud.com/repository/maven")
    maven(url = "https://dl.bintray.com/kotlin/kotlin-eap")
    gradlePluginPortal()
    jcenter()
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))

    implementation(ktor("server-cio"))
    implementation(ktor("websockets"))
    implementation(ktor("websockets"))
    implementation(ktor("client-okhttp"))
    implementation(ktor("client-websockets"))

    implementation("com.google.code.gson:gson:${Versions.gsonVersion}")
    implementation("com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:1.0.1")
    implementation("net.mamoe.yamlkt:yamlkt:${Versions.yamlktVersion}")
    implementation("org.fusesource.jansi:jansi:${Versions.jansiVersion}")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
}
