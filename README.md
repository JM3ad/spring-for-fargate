# The app
* This is a simple spring app designed for playing about with AWS & specifically Fargate.

### Running locally
* The local DB runs in docker, so `docker-compose up` to set that up
* Assumed that the app runs in Intellij with the default launch config, but can also run it manually using `package.bat` and `run.bat`

### Deploy to AWS
* Log into docker & AWS in powershell
  * `aws ecr get-login-password | docker login -u AWS --password-stdin 521082294481.dkr.ecr.eu-west-2.amazonaws.com/my-container-repo`
* Run `release.ps1`

### Set up
* Currently the docker image is pushed to an AWS Elastic Container Registry from where it is picked up by an Elastic Container Service & deployed automatically.
* Secrets are stored in AWS secret manager, and added to the container as environment variables
* DNS has been configured to point http://api.meadbros.co.uk/ at a load balancer which routes traffic to the containers
