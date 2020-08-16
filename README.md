### Building Locally
* Run `package.bat`

### Running locally
* Run `run.bat`

### Build dockerfile
* Run `docker build -t myapp .`

### Run that dockerfile locally
* Run `docker run -p 8080:8080 -t myapp`

### Deploy to AWS
* Log into docker & AWS in powershell
* `aws ecr get-login-password | docker login -u AWS --password-stdin 521082294481.dkr.ecr.eu-west-2.amazonaws.com/my-container-repo`
* Run `release.ps1`