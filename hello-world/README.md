# Hello World

## run

```shell
clj -M -m hello
```

or `clj -X hello/run`

## package

```shell
clj -T:build uber
java -jar .\target\hello-0.0.x-standalone.jar
```
