./package.bat
docker build -t 521082294481.dkr.ecr.eu-west-2.amazonaws.com/my-container-repo:my-spring-app .
docker push 521082294481.dkr.ecr.eu-west-2.amazonaws.com/my-container-repo:my-spring-app
aws ecs update-service --force-new-deployment --cluster my-first-cluster --service my-spring-app-service