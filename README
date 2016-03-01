# Service One

Is [Play!](https://www.playframework.com/) application in version 2.4.

## Usage

is used as microservice in [play-main-microservice-arch](https://github.com/peterszatmary/play-main-microservice-arch) project.

You can use this project also standalone or with other two

- [play-service-backend](https://github.com/peterszatmary/play-service-backend)
- [play-main-microservice-arch](https://github.com/peterszatmary/play-main-microservice-arch)


### Application.doBigCalculation()

- GET /calculation/big 
- does some mocked calculation (return just random number value in some big delay)
- got to ```http://localhost:{port here probably 9000}/calculation/big ```

```java
 public F.Promise<Result> doBigCalculation() {
        return F.Promise.promise(() -> calculationSystem.calculationBig()) // non-blocking with F.Promise.promise
                .map(x -> {
                    Map<String, Integer> data = new HashMap<>();
                    data.put("result", x);
                    return data;
                })
                .map(Json::toJson)
                .map(jsonResponse -> (Result) ok(jsonResponse))
                .recover(t -> badRequest(t.getMessage() + "\n"));
    }
```


### Application.doSmallCalculation() 


- GET /calculation/small 
- does some mocked calculation (return just random number value in some  small delay)
- got to ```http://localhost:{port here probably 9000}/calculation/small ```

```java
 public F.Promise<Result> doSmallCalculation() {
        return F.Promise.promise(() -> calculationSystem.calculationSmall()) // non-blocking with F.Promise.promise
                .map(x -> {
                    Map<String, Integer> data = new HashMap<>();
                    data.put("result", x);
                    return data;
                })
                .map(Json::toJson)
                .map(jsonResponse -> (Result) ok(jsonResponse))
                .recover(t -> badRequest(t.getMessage() + "\n"));
    }
```

### Application.showRunProperties()

- GET /showRunProperties 
- shows just run properties, not insteresting for repo purpose
- got to ```http://localhost:{port here probably 9000}/showRunProperties```



## Deployment

```shell
./activator stage
```

or with other projects

```shell
./activator stage -Dhttp.port=9001
```

or in development mode

```shell
./activator run
```

or with other projects

```shell
./activator run -Dhttp.port=9001
```

## Configuration


See **conf/mock.conf.**

```java
big.exception=false
big.delay=5000
small.exception=false
small.delay=2 
```

As you see you can here change the dellays for calculations and also tell if ends with error or not.



