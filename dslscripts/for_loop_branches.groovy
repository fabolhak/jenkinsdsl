def branches = ['master', 'feature']

branches.each { branch ->
    job('dsl-branch-'+branch){
        scm{
            github('jenkins/jendsl', branch)
        }
    }
}