griffon.project.dependency.resolution = {
    inherits("global")
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
    }
    dependencies {
        runtime 'com.seaglasslookandfeel:seaglasslookandfeel:0.2'
    }
}

log4j = {
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
