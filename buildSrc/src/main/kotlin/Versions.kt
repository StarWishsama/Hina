object Versions {
    const val jansiVersion = "2.1.1"
    const val yamlktVersion = "0.7.5"
    const val hinaVersion = "0.0.1-EA"
    const val ktorVersion = "1.4.1"
    const val gsonVersion = "2.8.6"
    const val retrofitVersion = "2.9.0"
    const val kotlinVersion = "1.4.21"
}

fun ktor(id: String, version: String = Versions.ktorVersion) = "io.ktor:ktor-$id:$version"