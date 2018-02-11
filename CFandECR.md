1. Setup the Cloudformation stack to create the prerequisite resources by executing `make stack` in the `cloudformation/` folder
2. Build and Publish your API container to the ECR repository created by Cloudformation executing `make publish` in the root folder
3. Populate your Task Definition with the correct region and account id using the `generate-task-definition` script in the `task-definition` folder
4. Register your Task Definition to ECS with `aws ecs register-task-definition --cli-input-json file://CHANGE-task-definition.json`
5. Launch your Service or Task using the AWS CLI, ECS CLI, or AWS Management Console