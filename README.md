# account-service

### Register
URL: http://localhost:8080/api/user/register

HTTP Method: POST

Header: Content-Type: application/json

Body: {
      	"username":"yutthagarn",
      	"password":"abc123",
      	"firstName":"Yutthagarn",
      	"lastName":"Intajug",
      	"email":"yutthagarn.ken@gmail.com"
      }

### Login
URL: http://localhost:8080/login

HTTP Method: POST

Header: Content-Type: application/json

Body: {
      	"username":"yutthagarn",
      	"password":"abc123"
      }
      
### New Account
URL: http://localhost:8080/api/account/new

HTTP Method: POST

Header: Content-Type: application/json , Authorization Bearer {Token}

Body: {
        "citizenId": "1235245652158",
        "accountName": "Yutthagarn Ken",
        "accountNumber": "20326521548",
        "accountType": "Saving",
        "balance": "150000",
        "currency": "THB"
      }
      
### Get All Account
URL: http://localhost:8080/api/account

HTTP Method: GET

Header: Content-Type: application/json , Authorization Bearer {Token}
