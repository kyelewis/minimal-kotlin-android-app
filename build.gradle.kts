buildscript { 
    repositories {
        mavenCentral()
	google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.2")
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}
