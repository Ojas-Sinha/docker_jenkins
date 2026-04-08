pipeline{
  agent any
  stages{
    stage('Build Image'){
      steps{
        bat 'r"C:\Program Files\Docker\Docker\resources\bin\docker.exe" build -t docker_image .'
      }
    }
    stage('Run conatainer'){
      steps{
        bat 'r"C:\Program Files\Docker\Docker\resources\bin\docker.exe" run docker_image'
      }
    }
  }
}
