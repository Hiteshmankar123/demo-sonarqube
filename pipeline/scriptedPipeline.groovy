node {  
    stage('Pull') { 
        git 'https://github.com/shubhamkalsait/studentapp-ui.git'
    }
    stage('Build') { 
        echo ''
    }
    stage('Test') { 
        // 
    }
    stage('Deploy') { 
        // 
    }
}