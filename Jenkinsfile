pipeline{
  agent any
  stages{
    stage('Build Image'){
      steps{
        bat 'docker build -t docker_image .'
      }
    }
    stage('Run conatainer'){
      steps{
        bat 'docker run docker_image'
      }
    }
  }
}
