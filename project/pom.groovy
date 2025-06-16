project {
    modelVersion '4.0.0'
    parent {
        groupId 'org.tautua'
        artifactId 'tautua'
        version '5'
    }
    groupId 'org.tautua.archetypes'
    artifactId 'project.archetype'
    version '1.0.0-SNAPSHOT'
    packaging 'maven-archetype'

    url 'http://www.example.com'
    properties {
        'maven.compiler.target' '8'
        'maven.compiler.source' '8'
        'project.build.sourceEncoding' 'UTF-8'
    }
    build {
        extensions 'org.apache.maven.archetype:archetype-packaging:3.3.0'
        pluginManagement {
            plugins {
                plugin 'org.apache.maven.plugins:maven-archetype-plugin:3.3.0'
            }
        }
    }
}
