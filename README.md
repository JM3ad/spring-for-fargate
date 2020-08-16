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
* Run `release.ps1`