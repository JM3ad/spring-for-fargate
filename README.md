# Simple Spring App
* This is a simple spring app designed for playing about with AWS & specifically Fargate.

### Running locally
* The local DB runs in docker, so `docker-compose up` to set that up
* Assumed that the app runs in Intellij with the default launch config, but can also run it manually using `package.bat` and `run.bat`

### Deploy to AWS
* Log into docker & AWS in powershell
  * `aws ecr get-login-password | docker login -u AWS --password-stdin 521082294481.dkr.ecr.eu-west-2.amazonaws.com/my-container-repo`
* Run `release.ps1`
