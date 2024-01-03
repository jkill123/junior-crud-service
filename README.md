# junior-crud-service



#### for local run
- active profile "default"
- testing profile "dev"
- postgresDB run from docker

#### API

- Create Order example curl
```
curl --location 'http://localhost:8080/api/v1/orders' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=6rsUIySU_K1r5ayTX8bkqQxca8JWOjMwqOD0ytXL' \
--data '{
    "cost": 21.1,
    "date": "2023-12-30",
    "products" : [
        {
            "name" : "Demo33",
            "cost" : 433.4
        },
        {
            "name" : "Demo44",
            "cost" : 533.4
        },
        {
            "name" : "Demo55",
            "cost" : 533.4
        }
    ]
}'
```

- Get Order example curl
```
curl --location 'http://localhost:8080/api/v1/orders/5' \
--header 'Cookie: JSESSIONID=6rsUIySU_K1r5ayTX8bkqQxca8JWOjMwqOD0ytXL'
```
