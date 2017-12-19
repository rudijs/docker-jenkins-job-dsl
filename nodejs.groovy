job('NodeJS Example') {
    scm git('https://github.com/rudijs/docker-demo-web-app.git') { node -> 
        node / gitConfigName('DSL User')
        node / gitConfigEmail('rudi.starcevic@viseo.com')
    }
}