# dontmakemewaitforit
# Running
```shell
$ sbt
> ~reStart
$ open http://localhost:8080
```

## Cleaning

The root project aggregates all the other projects by default.
Use this root project, called `dontmakemewaitforit`, to clean all the projects at once.
```shell
$ sbt
> dontmakemewaitforit/clean
```

