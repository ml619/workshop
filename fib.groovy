pipeline {
    agent any 
    stages {
        stage('Stage 1') {
            steps {
                script{
                    int f = params.fib as Integer
                    if(f < 0){
                        println('invalid input')
                    }else{
                        int a = 0;
                        int b = 1;
                        int c;
                        for(int i = 0; i < f; ++i){
                            c = b;
                            b = b + a;
                            a = c;
                        }
                        println(a)
                    }
                }    
                   
            }
            
        }
    }
}
