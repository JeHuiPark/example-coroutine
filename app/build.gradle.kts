plugins {
    kotlin("jvm") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // https://projectreactor.io/docs
    implementation(platform("io.projectreactor:reactor-bom:2022.0.2"))
    implementation("io.projectreactor:reactor-core")

    // https://github.com/Kotlin/kotlinx.coroutines
    implementation(platform("org.jetbrains.kotlinx:kotlinx-coroutines-bom:1.6.4"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive")
}
