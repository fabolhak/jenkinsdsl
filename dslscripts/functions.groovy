def createMavenJob( def jobFactory, def name){
    jobFactory.mavenJob(name){
        goals('clean')
    }
}

def jobA = createMavenJob(this, 'project-a')
def jobB = createMavenJob(this, 'project-b')

jobB.with{
    scm{
        github('example-jenkins/project-a')
    }
}