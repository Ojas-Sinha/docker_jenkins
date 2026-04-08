pipeline{
  agent any
  stages{
    stage('Build Image'){
      bat 'docker build -t docker_image .'
    }
    stage('Run conatainer'){
      bat 'docker run docker_image'
    }
  }
}
