# spring-boot-unsij

### Endpoints persona

#### get all persona

`GET  /persona`

#### get persona by id

`GET  /persona/{id}`

#### create persona

`POST  /persona`

*Body:*
```json
{
    "nombre": "any",
    "apellido": "any"
}
```

#### update persona

`PUT  /persona/{id}`

*Body:*
```json
{
    "nombre": "any",
    "apellido": "any"
}
```



#### delete persona

`DELETE  /persona/{id}`

