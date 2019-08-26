def giturl= 'https://github.com/quidryan/aws-sdk-test.git'
for(i in 0..5){
    job("job-test-${i}"){
        scm{
            git(giturl)
        }
        steps {
            maven("test -Dtest.suite=${i}")
        }
    }
}