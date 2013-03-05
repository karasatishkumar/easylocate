##Web Server based app request##
http://localhost:8080/geodataservice/oauth/authorize?response_type=code&client_id=easylocate&scope=read&redirect_uri=http://localhost:8080/web

http://localhost:8080/geodataservice/oauth/token?grant_type=authorization_code&code=H7Dfm3&redirect_uri=http://localhost:8080/roleservice/api/role&client_id=easylocate&client_secret=secret

##Browser Based request#
http://localhost:8080/geodataservice/oauth/authorize?response_type=token&client_id=easylocate&redirect_uri=http://localhost:8080/web&scope=read

curl -i -H "Authorization: Bearer 91ced49d-da0e-4fa4-944a-d8dda99f47f0" http://localhost:8080/roleservice/api/role

curl -i -H "Authorization: Bearer 91ced49d-da0e-4fa4-944a-d8dda99f47f0" http://localhost:8080/tripservice/api/trip

curl -i -H "Authorization: Bearer 458d3a7c-a12b-474f-9dda-aa29f7029ab0" http://localhost:8080/geodataservice/api/geodata

curl -i -H "Authorization: Bearer 91ced49d-da0e-4fa4-944a-d8dda99f47f0" http://localhost:8080/userservice/api/user

##Password Based Authentication
curl -i -X POST -d "client_id=easylocate&grant_type=password&username=admin&password=admin&client_secret=secret" http://localhost:8080/oauth2/oauth/token

##Client Credential Based##
curl -i -X POST -d "client_id=easylocate&grant_type=client_credentials&client_secret=secret" http://localhost:8080/oauth2/oauth/token

http://localhost:8080/roleservice/api/oauth/authorize?response_type=token&client_id=easylocate&redirect_uri=http://localhost:8080/web&scope=read

